import entidades.Bebida;
import entidades.Pedido;
import entidades.PratoPrincipal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var prato1 = new PratoPrincipal("Hamburguer", "Pão, alface, tomate, queijo, carne",
                25, 1800);
        var prato2 = new PratoPrincipal("Estrogonofe", "Arroz, batata palha, salada, frango",
                20, 1800);
        var bebida1 = new Bebida("Coca-cola", "Bebida gaseificada de cola",
                8, "Bebida gelada");
        var bebida2 = new Bebida("Café", "Bebida pra acordar",
                5, "Bebida quente");

        var pedido1 = new Pedido("José Carlos",
                new ArrayList<>());

        pedido1.adicionarItem(prato2);
        pedido1.adicionarItem(bebida1);
        pedido1.adicionarItem(prato1);
        pedido1.removerItem(prato1);

        pedido1.detalhePedidos();
    }
}