package SistemaRestauranteJv;

import java.util.ArrayList;

public class Prato {
        // Atributos
        public String nome;
        private float preco;
        private int tempoPreparo;
        private ArrayList<String> ingredientes;
        private boolean disponível;

        // Métodos Especiais
        public Prato(String nome, float preco, int tempoPreparo) {
            this.setNome(nome);
            this.setPreco(preco);
            this.setTempoPreparo(tempoPreparo);
            this.setIngredientes(new ArrayList<>());
            this.setDisponível(true);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getPreco() {
            return preco;
        }

        public void setPreco(float preco) {
            this.preco = preco;
        }

        public int getTempoPreparo() {
            return tempoPreparo;
        }

        public void setTempoPreparo(int tempoPreparo) {
            this.tempoPreparo = tempoPreparo;
        }

        public ArrayList<String> getIngredientes() {
            return ingredientes;
        }

        public void setIngredientes(ArrayList<String> ingredientes) {
            this.ingredientes = ingredientes;
        }

        public boolean isDisponível() {
            return disponível;
        }

        public void setDisponível(boolean disponível) {
            this.disponível = disponível;
        }

        // Métodos Personalizados
        public void adicionarIngrediente(String ing) {
            this.getIngredientes().add(ing);
        }

        public void removerIngrediente(String ing) {
            this.getIngredientes().remove(ing);
        }

        public void exibirInfor() {
            System.out.println("Prato: " + getNome() + "||" + "Preço: R$" + getPreco() + "||" + "Tempo de Preparo: "
                    + getTempoPreparo());
            System.out.println("Ingredientes: " + getIngredientes());
            System.out.println("Disponível: " + isDisponível());
            System.out.println("--------------------------------------------------");
        }
    }
