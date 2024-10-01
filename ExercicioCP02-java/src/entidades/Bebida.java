package entidades;

import java.util.Objects;

public class Bebida extends Cardapio{
    //Atributos
    private String tipoBebida; //Bebida quente ou fria

    //Metodos
    public void detalhesItem(){
        System.out.println("Detalhes do item - "
                + " Nome: " + this.getNome()
                + " Descrição: " + this.getDescricao()
                + " Valor: " + this.getPreco()
                + " Temperatura da bebida: " + this.tipoBebida);
    }

    //Construtor vazio

    public Bebida() {
    }

    //Construtor completo
    public Bebida(String nome, String descricao, int preco, String tipoBebida) {
        super(nome, descricao, preco);
        this.tipoBebida = tipoBebida;
    }

    //Getters e setters
    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    //Equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bebida bebida = (Bebida) o;
        return Objects.equals(getTipoBebida(), bebida.getTipoBebida());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoBebida());
    }

    //ToString
    @Override
    public String toString() {
        return "Bebida{" +
                "tipoBebida='" + tipoBebida + '\'' +
                '}';
    }
}
