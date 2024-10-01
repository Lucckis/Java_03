package entidades;

import java.util.List;
import java.util.Objects;

public class Pedido {
    //Atributos
    private String nomeCliente;
    private List<Cardapio> itens;

    //Metodos
    public void adicionarItem(Cardapio item){
        itens.add(item);
    }

    public void removerItem(Cardapio item){
        itens.remove(item);
    }

    public void detalhePedidos(){
        System.out.println("Dono do pedido: " + this.nomeCliente);
        for(var item:itens) {
            item.detalhesItem();
            System.out.println("------------");
        }
    }

    //Construtor vazio
    public Pedido() {
    }

    //Construtor completo
    public Pedido(String nomeCliente, List<Cardapio> itens) {
        this.nomeCliente = nomeCliente;
        this.itens = itens;
    }

    //Getters e setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Cardapio> getItens() {
        return itens;
    }

    public void setItens(List<Cardapio> itens) {
        this.itens = itens;
    }

    //Equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(getNomeCliente(), pedido.getNomeCliente()) && Objects.equals(getItens(), pedido.getItens());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomeCliente(), getItens());
    }

    //ToString

    @Override
    public String toString() {
        return "Pedido{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", itens=" + itens +
                '}';
    }
}
