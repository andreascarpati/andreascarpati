package Scarpati.LAB_INF_5F.DAO;

import Scarpati.LAB_INF_5F.model.Esame;

public class TestEsameDAO {

	public static void main(String[] args) {
		EsameDAO dao = new EsameDAO() ;
		
		Esame e1 = dao.find("AAAA2") ;
		System.out.println(e1);
		
		Esame e2 = dao.find("99QQQ") ;
		System.out.println(e2);

	}

}
