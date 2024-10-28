package model;

import java.util.ArrayList;
import java.util.List;

public class Nota {
    private List<Produto> produtos;

    public Nota() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotalVenda() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPrecoTotal();
        }
        return total;
    }

    public void exibirNota() {
        System.out.println("========== Nota de Venda ==========");
        for (Produto produto : produtos) {
            System.out.printf("Produto: %s\nQuantidade: %d\nPreço Unitário: R$ %.2f\nPreço Total: R$ %.2f\n\n",
                    produto.getNome(), produto.getQuantidade(), produto.getPrecoUnitario(), produto.getPrecoTotal());
        }
        System.out.printf("Valor Total da Venda: R$ %.2f\n", calcularTotalVenda());
    }
}