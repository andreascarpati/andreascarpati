package Scarpati.LAB_INF_5F.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Scarpati.LAB_INF_5F.model.Esame;


public class EsameDAO {
	
	public Esame find(String codice) {
		
		final String sql = 
				"SELECT codice, titolo, docente " +
				"FROM esame "+
				"WHERE codice=?" ;
		
	
	
		
		try {
			
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql) ;
			
			st.setString(1, codice);
			
			ResultSet res = st.executeQuery() ;
			Esame esam=null;
			if(res.next()) {
				
				 esam = new Esame(
						res.getString("codice"),
						res.getString("titolo"),
						res.getString("docente")
						
						) ;
				
			}
				conn.close();
				return esam;

			}  catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Errore Db");
			}
	}


				// TODO: estrarre anche voto e data_superamento !!
				
				
				
	
		
	
	
	public String create(Esame esam) {
	final	String sql = "INSERT INTO `libretto`.`esame` (`codice`, `titolo`, `docente`) VALUES (?, ?, ?);" ;
		
	String returnValue = "";
		try {
			Connection conn = ConnectDB.getConnection();
		
			
			
			PreparedStatement st = conn.prepareStatement(sql) ;
			
			st.setString(1, esam.getCodice()) ;
			st.setString(2, esam.getTitolo()) ;
			st.setString(3, esam.getDocente()) ;
			
			int res = st.executeUpdate();

			

			if (res == 1) {
				returnValue = "record inserito con successo";
			}
			conn.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
			returnValue = e.getMessage();
			//throw new RuntimeException("Errore Db");
			return returnValue;
		}
		return returnValue;
	}
	}
			
			
		
		
	


