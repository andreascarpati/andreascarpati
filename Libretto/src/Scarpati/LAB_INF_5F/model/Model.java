package Scarpati.LAB_INF_5F.model;



import Scarpati.LAB_INF_5F.DAO.EsameDAO;

public class Model {
	
 
	
	public Model() {

	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia già
	 * @param e
	 * @return true se l'ha inserito, false se esisteva già e quindi non l'ha potuto inserire
	 */
	public String addEsame(Esame e) {
		
		EsameDAO dao=new EsameDAO();
		
		return dao.create(e) ;		
		
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice) {
		EsameDAO dao = new EsameDAO() ;
		
		Esame e = dao.find(codice) ;
		
		return e ;
	}

}
