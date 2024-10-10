package view;

import model.Escola;
import model.Evento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EscolaVisao{
	
	public static void main(String args []){
		Escola escola = new Escola();
		Evento evento = new Evento();

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a descricao do evento:\n");
		String descricao = ler.nextLine();

		System.out.print("Informe a data do evento:\n");
		String data = ler.nextLine();

		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dt = sdf.parse(data);
        } catch (ParseException e) {
			System.out.println("Erro ao converter a data do evento");
        }

		evento.setNome(descricao);
		evento.setData(dt);
		escola.setEvento(evento);

		mostrarEvento(escola);
    }
	private static void mostrarEvento(Escola escola) {
		System.out.println("\n");
		System.out.println("Evento: " + escola.getEvento().getNome());
		System.out.println("Data: " + escola.getEvento().getData());
	}
}
