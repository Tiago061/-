package Entity;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos;

    public ProdutoService(){
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
        listarProdutos();
    }

    public void listarProdutos() {
        System.out.println("\nListagem de Produtos:");
        produtos.stream()
                .sorted(Comparator.comparingDouble(Produto::getValor))
                .forEach(produto -> System.out.println("Nome: " + produto.getNome() + ", Valor: " + produto.getValor()));
    }
}
