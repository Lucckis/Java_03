import java.util.ArrayList;
import java.util.Objects;

public class ProdutoFisico extends Produto {
    private Object Dimensao = new Object();
    private double peso;

    public ProdutoFisico() {
    }

    public ProdutoFisico(Object dimensao, double peso) {
        Dimensao = dimensao;
        this.peso = peso;
    }

    public ProdutoFisico(String nome, double preco, String descricao, int quantidade, Object dimensao, double peso) {
        super(nome, preco, descricao, quantidade);
        Dimensao = dimensao;
        this.peso = peso;
    }

    public ProdutoFisico(String nome, double preco, String descricao, int quantidade, ArrayList<Caracteristica> caracteristicas, Object dimensao, double peso) {
        super(nome, preco, descricao, quantidade, caracteristicas);
        Dimensao = dimensao;
        this.peso = peso;
    }

    public Object getDimensao() {
        return Dimensao;
    }

    public void setDimensao(Object dimensao) {
        Dimensao = dimensao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoFisico that = (ProdutoFisico) o;
        return Double.compare(getPeso(), that.getPeso()) == 0 && Objects.equals(getDimensao(), that.getDimensao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDimensao(), getPeso());
    }
}
