package model;
import java.util.Date;
import java.util.Scanner;

public class Escola{
    //Evento02 e = new Evento02();

	private Evento evento;

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
	/*Evento e = new Evento();
    public void cadastrarEvento(){

		Scanner ler = new Scanner(System.in);
        String nome = "";
		Date data;

		System.out.printf("Informe a descricao do evento:\n");
		nome = ler.nextLine();

		System.out.printf("Informe a data do evento:\n");


        e.agendar(nome, data);
    }

    public void mostrarEvento(){
		System.out.println("\n");
        System.out.println("Evento: " + e.getNome());
        System.out.println("Data: " + e.getData());
    }
	*/