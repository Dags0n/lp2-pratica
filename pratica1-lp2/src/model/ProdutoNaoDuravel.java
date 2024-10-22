package model;

public class ProdutoNaoDuravel extends Produto {
    private String dataValidade;
    private String genero;

    public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, String dataValidade, String genero) {
        super(nome, preco, marca, descricao);
        this.dataValidade = dataValidade;
        this.genero = genero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
