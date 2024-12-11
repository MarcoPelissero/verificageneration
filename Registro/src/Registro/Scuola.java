package Registro;
import java.util.ArrayList;
import java.util.Scanner;
public class Scuola
{
private static ArrayList<Studente> registro;
	
	public Scuola() {
		registro=new ArrayList<Studente>();
		
	}//costruttore
	public void AggiungiStudente(Studente nome,Studente cognome,Studente matricola) {
		registro.add(nome);
		registro.add(cognome);
		registro.add(matricola);
		
	}
	//metodo per trovare studente
	public Studente trovaStudente(String matricola) {
		for (Studente a :registro) {
			if (a.getMatricola().equalsIgnoreCase(matricola) ){
				return a;
			}
			
		}
		return null;
	}
	
	//metodo per stampare registro
	public void stamparegistro(){
		for (Studente a:registro) {
			a.getDettagli();
		}
	}
	



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Studente> studenti=new ArrayList<Studente>();
		Scanner scanner=new Scanner(System.in);
		//scelta operatore
		System.out.println("Scegli un'azione. 1) aggiungi studente. 2)visualizza elenco studenti. 3)cerca studente per matricola. 4)Esci.");
		int scelta=scanner.nextInt();
		if(scelta==1) {
			System.out.println("Inserisci nome");
			String nome=scanner.nextLine();
			System.out.println("Inserisci cognome");
			String cognome=scanner.nextLine();
			System.out.println("Inserisci matricola");
			String matricola=scanner.nextLine();
			Studente.AggiungiStudente(nome,cognome,matricola);
			
		}else if(scelta==2) {
			stamparegistro();
		}
		else if(scelta==3) {
			System.out.println("Inserisci numero matricola");
			String matricola=scanner.nextLine();
			Studente.trovaStudente(matricola)
		}
		else {
			System.exit(0);
		}
		
			
		}
				

	}

}
