package Scarpati.LAB_INF_5F.model;

import java.util.*;



/**
 * 
/**
 * Oggetto semplice che contiene i dati relativi ad un singolo esame. POJO -
 * plain old java object
 * 
 * dati privati (proprietà) ** costruttore metodi get/set metodi di servizio
 */
public class Esame {

	private String codice;
	private String titolo;
	private String docente;
	// private Docente docente ;



	/**
	 * 
	 * 
	 * @param codice
	 *            codice dell'esame
	 * @param titolo
	 *            denominazione del corso
	 * @param docente
	 *            cognome e nome del docente titolare
	 */
	public Esame(String codice, String titolo, String docente) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
	}



	public String getCodice() {
		return codice;
	}



	public void setCodice(String codice) {
		this.codice = codice;
	}



	public String getTitolo() {
		return titolo;
	}



	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	public String getDocente() {
		return docente;
	}



	public void setDocente(String docente) {
		this.docente = docente;
	}

	



	}







