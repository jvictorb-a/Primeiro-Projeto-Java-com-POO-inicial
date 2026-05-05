package SistemaRestauranteJv;

import java.util.ArrayList;

public class Pedido {
        // Atributos
        private int numeroPedido;
        private String cliente;
        private ArrayList<Prato> listaPratos;
        private String status;
        private float valorTotal;

        // Métodos Especiais
        public Pedido(int numeroPedido, String cliente) {
            this.setNumeroPedido(numeroPedido);
            this.setCliente(cliente);
            this.setListaPratos(new ArrayList<>());
            this.setStatus(" Em preparo... ");
            this.setValorTotal(0);
        }

        public int getNumeroPedido() {
            return numeroPedido;
        }

        public void setNumeroPedido(int numeroPedido) {
            this.numeroPedido = numeroPedido;
        }

        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public ArrayList<Prato> getListaPratos() {
            return listaPratos;
        }

        public void setListaPratos(ArrayList<Prato> listaPratos) {
            this.listaPratos = listaPratos;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public float getValorTotal() {
            return valorTotal;
        }

        public void setValorTotal(float valorTotal) {
            this.valorTotal = valorTotal;
        }

        // Métodos Personalizados
        public void adicionarPrato(Prato pra) {
            if (pra.isDisponível()) {
                this.getListaPratos().add(pra);
                calcularTotal();
                System.out.println(pra.getNome() + " adicionado ao Pedido! ");
            } else {
                System.out.println(" Prato Indisponível! ");
            }
        }

        public void removerPrato(Prato pra) {
            this.getListaPratos().remove(pra);
            calcularTotal();
            System.out.println(pra.getNome() + " removido ");
        }

        public void calcularTotal() {
            float total = 0;

            for (Prato pra : getListaPratos()) {
                total += pra.getPreco();
            }
            setValorTotal(total);
        }

        public void exibirResumo() {
            System.out.println("Pedido nº: " + getNumeroPedido() + " || Cliente: " + getCliente());
            for (Prato pra : getListaPratos()) {
                System.out.println("- " + pra.getNome() + " (R$" + pra.getPreco() + ") ");
            }
            System.out.println("Total: " + getValorTotal() + " || Status: " + getStatus());
            System.out.println("--------------------------------------------------");
        }
    }