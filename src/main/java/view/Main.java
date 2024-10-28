package view;

import model.Nota;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Nota nota = new Nota();

        nota.adicionarProduto(new Produto("Arroz", 5.50, 2));
        nota.adicionarProduto(new Produto("Feijão", 7.00, 3));
        nota.adicionarProduto(new Produto("Macarrão", 4.50, 1));

        nota.exibirNota();
    }
}
