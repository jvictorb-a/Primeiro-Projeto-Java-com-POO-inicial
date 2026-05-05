package SistemaRestauranteJv;

import java.util.ArrayList;

public class Cliente {
        // Atributos
        public String nome;
        private String telefone;
        private String email;
        private ArrayList<Pedido> historicoPedidos;

        // Métodos Especiais
        public Cliente(String nome, String telefone, String email) {
            this.setNome(nome);
            this.setTelefone(telefone);
            this.setEmail(email);
            this.setHistoricoPedidos(new ArrayList<>());
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public ArrayList<Pedido> getHistoricoPedidos() {
            return historicoPedidos;
        }

        public void setHistoricoPedidos(ArrayList<Pedido> historicoPedidos) {
            this.historicoPedidos = historicoPedidos;
        }

        // Métodos Personalizados
        public Pedido fazerPedidos(int numeroPedido) {
            Pedido novo = new Pedido(numeroPedido, getNome());
            this.getHistoricoPedidos().add(novo);
            return novo;
        }

        public void exibirHistorico() {
            System.out.println("Histórico de Pedidos de " + getNome() + ": ");
            for (Pedido pra : getHistoricoPedidos()) {
                pra.exibirResumo();
            }
        }
    }
