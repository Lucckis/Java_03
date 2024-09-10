
public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto("Coca-Cola", 5.0, "Refrigerante de Cola", 10);

        var produto2 = new Produto("Guarana", 4.0, "Refrigerante de Guarana", 5);

        produto1.AdicionarEstoque(5);

        System.out.println(produto2);
    }
}