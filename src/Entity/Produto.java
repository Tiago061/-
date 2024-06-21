package Entity;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private boolean disponivelParaVenda;

    public Produto(String nome, String descricao, double valor, boolean disponivelParaVenda) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.disponivelParaVenda = this.disponivelParaVenda;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", disponivelParaVenda=" + disponivelParaVenda +
                '}';
    }
}
