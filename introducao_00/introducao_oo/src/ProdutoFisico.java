public class ProdutoFisico extends Produto {
    private final Object Dimensao = new Object();
    private double peso;


    public ProdutoFisico(Object dimensao) {
        Dimensao = dimensao;
    }

    public ProdutoFisico(String nome, double preco, String descricao, int quantidade ) {
        super(nome, preco, descricao, quantidade);
        this.peso = peso;
        this.Dimensao = Dimensao;
    }

    public Object getDimensao() {
        return Dimensao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
