package it.polito.tdp.anagrammi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AnagrammaDAO {
	
	public boolean isCorrect(String parola){
		String sql = "SELECT * FROM parola WHERE nome = ?";
		boolean res = false;
		try{
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, parola);
			ResultSet rs = st.executeQuery();
			if(rs.next()){
				res= true;
			}
			
		}catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
		return res;
	}

}
