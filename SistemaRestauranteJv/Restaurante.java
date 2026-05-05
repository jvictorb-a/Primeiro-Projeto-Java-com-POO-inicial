package SistemaRestauranteJv;

import java.util.ArrayList;

public class Restaurante {
    // Atributos
    private String nome;
    private String endereco;
    private ArrayList<Prato> listaPratos;
    private ArrayList<Pedido> listaPedidos;

    // Métodos Especiais
    public Restaurante(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setListaPedidos(new ArrayList<>());
        this.setListaPratos(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Prato> getListaPratos() {
        return listaPratos;
    }

    public void setListaPratos(ArrayList<Prato> listaPratos) {
        this.listaPratos = listaPratos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    // Métodos Personalizados
    public void adicionarPrato(Prato pra) {
        getListaPratos().add(pra);
    }

    public void removerPrato(Prato pra) {
        getListaPratos().remove(pra);
    }

    public void listarPratos() {
        System.out.println("Cardápio do restaurante--> " + getNome() + ":");
        for (Prato pra : getListaPratos()) {
            pra.exibirInfor();
        }
    }

    public void registrarPedido(Pedido pra) {
        getListaPedidos().add(pra);
    }

    public void exibirPedidos() {
        System.out.println("Pedidos ativos: ");
        for (Pedido pra : getListaPedidos()) {
            pra.exibirResumo();
        }
    }
}
