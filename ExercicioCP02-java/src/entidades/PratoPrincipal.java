package entidades;

import java.util.Objects;

public class PratoPrincipal extends Cardapio{
    //Atributos
    private int tempoPreparo;

    //Metodos
    public void detalhesItem(){
        System.out.println("Detalhes do item - "
                + " Nome: " + this.getNome()
                + " Descrição: " + this.getDescricao()
                + " Valor: " + this.getPreco()
                + " Tempo de preparo: " + this.tempoPreparo);
    }


    //Construtor vazio
    public PratoPrincipal() {
    }

    //Construtor completo
    public PratoPrincipal(String nome, String descricao, int preco, int tempoPreparo) {
        super(nome, descricao, preco);
        this.tempoPreparo = tempoPreparo;
    }

    //Getters e setters
    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    //Equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PratoPrincipal that = (PratoPrincipal) o;
        return getTempoPreparo() == that.getTempoPreparo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTempoPreparo());
    }

    //ToString

    @Override
    public String toString() {
        return "PratoPrincipal{" +
                "tempoPreparo=" + tempoPreparo +
                '}';
    }
}
