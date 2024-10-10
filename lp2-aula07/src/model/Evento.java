package model;

import java.util.Date;

public class Evento{

	// atributos
    private String nome;
    private Date data;

    /*public void agendar(String nome, Date data) {
        this.nome = nome;
        this.data = data;
    }*/

    public String getNome(){
        return nome;
    }

	public Date getData(){
		return data;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setData(Date data) {
		this.data = data;
	}
}