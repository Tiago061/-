
import Entity.Produto;
import Entity.ProdutoService;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static ProdutoService produtoService = new ProdutoService();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       while(true){
           System.out.println("\nMenu:");
           System.out.println("1. Cadastrar novo produto");
           System.out.println("2. Listar produtos");
           System.out.println("3. Sair");
           System.out.println("Escolha uma opção: ");
           int opcao = scanner.nextInt();
           scanner.nextLine();

           switch (opcao){
               case 1:
                   cadastrarNovoProduto();
                   break;
               case 2:
                   produtoService.listarProdutos();
                   break;
               case 3:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Opção inválida. Tente novamente.");
           }
       }
    }
    private static void cadastrarNovoProduto(){
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.println("Valor do produto: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Disponível para venda (sim/não): ");
        String disponivel = scanner.nextLine();
        boolean disponivelParaVenda = disponivel.equalsIgnoreCase("sim");

        Produto produto = new Produto(nome,descricao,valor,disponivelParaVenda);
        produtoService.cadastrarProduto(produto);

    }
}
