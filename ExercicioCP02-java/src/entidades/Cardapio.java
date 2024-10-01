package entidades;

import java.util.Objects;

abstract class Cardapio {
    //Atributos
    private String nome;
    private String descricao;
    private int preco;

    //Metodos
    public void detalhesItem(){
        System.out.println("Detalhes do item - "
                + " Nome: " + this.nome
                + " Descrição: " + this.descricao
                + " Valor: " + this.preco);
    }

    //construtor vazio

    public Cardapio() {
    }

    //construtor completo

    public Cardapio(String nome, String descricao, int preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    //Equals e hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cardapio cardapio = (Cardapio) o;
        return getPreco() == cardapio.getPreco() && Objects.equals(getNome(), cardapio.getNome()) && Objects.equals(getDescricao(), cardapio.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getPreco());
    }

    //ToString

    @Override
    public String toString() {
        return "Cardapio{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
