package Registro;
import java.util.ArrayList;

public class Studente
{
	
	/*Gestione di un Registro di Studenti
	Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

	Registrare nuovi studenti con:
	Nome,
	Cognome,
	Matricola (univoca).
	Visualizzare l'elenco degli studenti.
	Cercare uno studente tramite la matricola.
	Requisiti Tecnici:
	Creare una classe Studente con i campi necessari.
	Utilizzare un ArrayList per memorizzare gli studenti.
	Creare un menu testuale che permetta all'utente di:

	Aggiungere uno studente.
	Visualizzare tutti gli studenti.
	Cercare uno studente per matricola.
	Uscire dal programma*/
	
	
static String nome;
static String cognome;
static String matricola;
//costruttore
public Studente(String nome,String cognome,String matricola) {
	this.nome=nome;
	this.cognome=cognome;
	this.matricola=matricola;
}

static ArrayList<Studente> studenti=new ArrayList<Studente>();
static Studente studente=new Studente(nome,cognome,matricola);
//trova studente
public  String getStudente() {
	return nome+cognome+matricola;
}
//trova matricola
public String getMatricola() {
	return matricola;
}
//trova studente per matricola
public void trovaStudente(String matricola) {
	for (Studente studenti : studenti) {
		if(studenti.getMatricola().equals(matricola)) {
			studenti.getStudente();
		}
	}
}
//aggiungi studente
public static void aggiungiStudente(String nome,String cognome,String matricola) {
	studenti.add(studente);
	studenti.add(studente);
	studenti.add(studente);
	
}
//stampa elenco studenti
public void stampaRegistro() {
	for(Studente studenti:studenti) {
		System.out.println(studenti);
	}
}
//sistema uscita
public void exit() {
	System.exit(0);
}
public void getDettagli() {
	System.out.println("Nome: "+nome+" Cognome: "+cognome+" matricola: "+matricola);
{
	// TODO Auto-generated method stub
	
}

}

