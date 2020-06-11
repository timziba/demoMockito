package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domaine.Etudiant;

public class EtudiantDao implements IEtudiantDao {

	
	private String url = "jdbc:mysql://localhost/gestionformations?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String sql_login = "root";
	private String sql_password = "";

	public String createEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Connection cn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, sql_login, sql_password);
			st = cn.createStatement();
			
			String sql = "INSERT INTO etudiant (nom, prenom) VALUES ('"+ etudiant.getNomEtudiant() +"', '"+ etudiant.getPrenomEtudiant() +"')";
			
			st.executeUpdate(sql);
			
			cn.close();
			st.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return "etudiant creer ";
	}

	public Etudiant getEtudiantById(int id) {
		// TODO Auto-generated method stub
		
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		Etudiant etudiant=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, sql_login, sql_password);
			st = cn.createStatement();
			
			String sql = "SELECT * FROM etudiant WHERE id = '"+ id +"'";
			
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				etudiant=new Etudiant(rs.getInt("id"), rs.getString("nom"),rs.getString("prenom")) ;
			}
			cn.close();
			st.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return etudiant;
	}

	
}
