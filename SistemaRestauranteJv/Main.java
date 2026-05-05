package SistemaRestauranteJv;



public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Cantina da Júlia", "Rua Geraldo Margela, 21");

        // Pratos 
        Prato pizza = new Prato("Pizza 4 Queijos", 40, 20);
        pizza.adicionarIngrediente("Massa");
        pizza.adicionarIngrediente("Molho de tomate");
        pizza.adicionarIngrediente("Queijos");

        Prato lasanha = new Prato("Lasanha Bolonhesa", 50, 30);
        lasanha.adicionarIngrediente("Massa");
        lasanha.adicionarIngrediente("Molho branco");
        lasanha.adicionarIngrediente("Carne");

        restaurante.adicionarPrato(pizza);
        restaurante.adicionarPrato(lasanha);

        restaurante.listarPratos();

        //Cliente e Pedido
        Cliente cliente = new Cliente("João", "(84))9999-9999","joao@gmail.com" );
        Pedido pedido1 = cliente.fazerPedidos(1);

        pedido1.adicionarPrato(lasanha);
        pedido1.adicionarPrato(pizza);

        pedido1.exibirResumo();

        restaurante.registrarPedido(pedido1);
        restaurante.exibirPedidos();

        //Mudando Status via setter
        pedido1.setStatus("Finalizado");
        pedido1.exibirResumo();

        cliente.exibirHistorico();
    }
}
