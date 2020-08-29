package mx.org.asa.ivr.manejadorxml.krmenugo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class connection_SQL_DB {
	private String _usuario = "root";
	private String _pwd = "mysql";
	private static String _bd = "prueba_xml";
	static String _url = "jdbc:mysql://localhost/"+_bd;
	private Connection conn = null;

	public connection_SQL_DB(){
		try {
			Class.forName("com.mysql.jdbc.Connection"); //HACER LA INICIZALIZACION Y EL REGISTRO DEL DRIVER
			conn = (Connection) DriverManager.getConnection(_url, _usuario, _pwd);
			if (conn != null) {
				System.out.println("Conexión a base de datos "+ _url + " correcta");
			}
		}catch(SQLException ex) {
			System.out.println("Existe un problema al conectar con la Base de Datos " + _url);
		}catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
	
	public ResultSet getQuery(String _query) {
		Statement state = null;
		ResultSet resultado= null;
		try {
			state = (Statement) conn.createStatement();
			resultado = state.executeQuery(_query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public void setQuery (String _query) {
		Statement state = null;
		try {
			state =(Statement) conn.createStatement();
			state.execute(_query);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
