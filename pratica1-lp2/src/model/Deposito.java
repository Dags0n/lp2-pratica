package model;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Produto> produtos;

    public Deposito() {
        this.produtos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public int quantidadeProdutos() {
        return this.produtos.size();
    }

    public String depositoEstaVazio() {
        return this.produtos.isEmpty() ? "Sim" : "Não";
    }

    public Produto produtoComMaiorPreco() {
        Produto maisCaro = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }
        }
        return maisCaro;
    }
}
