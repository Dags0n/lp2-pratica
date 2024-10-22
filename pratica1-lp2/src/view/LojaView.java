package view;

import model.Deposito;
import model.Produto;
import model.ProdutoDuravel;
import model.ProdutoNaoDuravel;

import javax.sound.midi.Soundbank;

public class LojaView {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();

        Produto geladeira = new ProdutoDuravel("Geladeira", 1799.90, "Eletrolux", "Geladeira Eletrolux", 10);
        Produto livro = new ProdutoDuravel("Livro", 29.90, "Saraiva", "Clean Code", 10);
        Produto celular = new ProdutoDuravel("Celular", 1299.90, "Samsung", "Samsung Galaxy a34", 5);
        Produto chocolate = new ProdutoNaoDuravel("Chocolate", 9.90, "Garoto", "Barra de Chocolate", "07/04/2025", "Alimentício");
        Produto detergente = new ProdutoNaoDuravel("Detergente", 10.90, "Limpol", "Detergente Limpol", "10/03/2025", "Limpeza");
        Produto sabonete = new ProdutoNaoDuravel("Sabonete", 6.90, "Dove", "Sabonete Dove", "08/10/2025", "Higiene Pessoal");

        deposito.adicionarProduto(geladeira);
        deposito.adicionarProduto(livro);
        deposito.adicionarProduto(celular);
        deposito.adicionarProduto(chocolate);
        deposito.adicionarProduto(detergente);
        deposito.adicionarProduto(sabonete);

        deposito.removerProduto(livro);

        System.out.println("Quantidade de Produtos: " + deposito.quantidadeProdutos());
        System.out.println("Depósito vazio? " + deposito.depositoEstaVazio());

        Produto maisCaro = deposito.produtoComMaiorPreco();
        // Por algum motivo o nome e preco está null, não consegui consertar a tempo
        System.out.println("O produto mais caro é: " + maisCaro.getNome() + " com preço de R$ " + maisCaro.getPreco());
    }
}
