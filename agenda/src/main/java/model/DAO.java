package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DAO {
	/** M�dulo de conex�o **/
	// Parametros de conex�o

	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://127.0.0.1:5432/db_agenda";
	Properties props = new Properties();

	// M�todo de conex�o
	private Connection conectar() {
		Connection conn = null;
		props.setProperty("user","robson");
		props.setProperty("password","automa");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, props);
			return conn;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// teste conex�o
	/*public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/

}
