package mx.gob.asa.iverar.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.PreparedStatement;

import javax.activation.DataSource;
import javax.swing.JOptionPane;

import mx.gob.asa.iverar.version3_2compNomina.CFDI_3_2_C_C_N_Deducciones;
import mx.gob.asa.iverar.version3_2compNomina.CFDI_3_2_C_C_N_Percepciones;
import mx.gob.asa.iverar.version3_2compNomina.CFDI_3_2_C_Impuestos;

public class Connection_Class {
	public DataSource dataSource;
	Connection conexion = null;
	String user = "root";
	String password = "";
	int val = 1;
	public PreparedStatement pstm;
	public ResultSet resultado;

	public static void main(String [] args) throws SQLException {
		Connection_Class conexion = new Connection_Class();
		conexion.abrirConexion();
	}
	// -----------------------------------------------------------------------------------------------------------------
	public Connection abrirConexion() throws SQLException {
		Properties datos = new Properties();
		datos.put("user", user);
		datos.put("password", password);
		String url = "jdbc:mysql://localhost:3306/lector_xml";
		System.out.println("conexión en proceso...");
		try{
			 System.out.println("entraste al try");
			 conexion = DriverManager.getConnection(url, datos);
			 conexion.createStatement();
			if (conexion != null) {
				System.out.println("Conexión Exitosa");
			}else {
				System.out.println("Conexión Fallida, intenta de nuevo.");
			}
			System.out.println("Termina proceso de conexión");
		}catch (Exception e) {
			System.out.println("No se tienen los datos de la base de datos o del usuario y contraseña");
			e.printStackTrace();
		}
		return conexion;
	}
	// -----------------------------------------------------------------------------------------------------------------
	
	public ResultSet getQuery(String _query) {
		Statement state = null;
		ResultSet resultado = null;
		try {
			state = (Statement) conexion.createStatement();
			resultado = state.executeQuery(_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	// -----------------------------------------------------------------------------------------------------------------
	public int guardar(
			String fecha_dt,
			String folio_fiscal_str,
			String folio_str,
			String fecha_pago_dt,
			String id_empleado_int,
			String nombre_empleado_str,
			String rfc_str,
			String total_pagado,
			String fecha_ingreso_dt,
			String cfdi_3_2_C_C_N_Percepciones,
			String total_percep_exen_num,
			String cfdi_3_2_C_C_N_Deducciones,
			String total_deduc_num,
			String isr_num,
			String impuestos_retenidos_num,
			int numero_actualizacion_int,
			int id_Usuario
			) {

		int resultado = 0;
		String SSQL = "INSERT INTO cfdi VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement psql = conexion.prepareStatement(SSQL);
			psql.setString(1, fecha_dt);
			psql.setString(2, folio_fiscal_str);
			psql.setString(3, folio_str);
			psql.setString(4, fecha_pago_dt);
			psql.setString(5, id_empleado_int);
			psql.setString(6, nombre_empleado_str);
			psql.setString(7, rfc_str);
			psql.setString(8, total_pagado);
			psql.setString(9, fecha_ingreso_dt);
			psql.setString(10, cfdi_3_2_C_C_N_Percepciones);
			psql.setString(11, total_percep_exen_num);
			psql.setString(12, cfdi_3_2_C_C_N_Deducciones);
			psql.setString(13, total_deduc_num);
			psql.setString(14, isr_num);
			psql.setString(15, impuestos_retenidos_num);
			psql.setLong(16, numero_actualizacion_int);
			psql.setLong(17, id_Usuario);
			resultado = psql.executeUpdate();
			
			psql.close();
			JOptionPane.showMessageDialog(null, "REGISTRO ALMACENADO CORRECTAMENTE");
			System.out.println("REGISTRO ALMACENADO CORRECTAMENTE");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al intentar almacenar la información:\n" + e,
					"Error en la operación", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				if (conexion != null) {
					conexion.close();
				}
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión:\n" + ex,
						"Error en la operación", JOptionPane.ERROR_MESSAGE);
			}
		}
		return resultado;
	}
	
	//-------------------------------------------------------------------------------------------------------------------
	public boolean existeDatosXML (String id_empleado_int, String fecha_pago_dt) {
        try{
            pstm = conexion.prepareStatement("SELECT id_empleado_int FROM cfdi WHERE id_empleado_int = '"+id_empleado_int+"' AND fecha_pago_dt = '"+fecha_pago_dt+"';");
            resultado = pstm.executeQuery();
            if(resultado.next()){
            	//JOptionPane.showMessageDialog(null,"REGISTRO EXISTENTE : \n registro:" + pstm + "." + JOptionPane.INFORMATION_MESSAGE);
            	JOptionPane.showMessageDialog(null,"REGISTRO EXISTENTE" + JOptionPane.INFORMATION_MESSAGE);
            	return true;
            } else
 JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EL REGISTRO" + JOptionPane.ERROR_MESSAGE);
            return false;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de validación de datos." + e);
        }
		return true;
    }
	// -----------------------------------------------------------------------------------------------------------------
		public void actualizar3_3 (
				String fecha_dt,
				String folio_fiscal_str,
				String folio_str,
				String fecha_pago_dt,
				String id_empleado_int,
				String nombre_empleado_str,
				String rfc_str,
				String total_pagado,
				String fecha_ingreso_dt,
				String total_percep_grab_num,
				String total_percep_exen_num,
				String total_otras_percep_num,
				String total_deduc_num,
				String isr_num,
				String impuestos_retenidos_num,
				int numero_actualizacion_int,
				int id_Usuario) {
			System.out.println("ESTAS EN ACTUALIZAR 3.3");
			try{
				//System.out.println("TE ENCUENTRAS DENTRO DEL TRY UPDATE");
				String SSQL = "UPDATE cfdi SET "
						+ "fecha_dt='"+fecha_dt+"',"
						+ "folio_fiscal_str = '"+folio_fiscal_str+"',"
						+ "folio_str = '"+folio_str+"',"
						+ "fecha_pago_dt = '"+fecha_pago_dt+"',"
						+ "id_empleado_int = '"+ id_empleado_int +"',"
						+ "nombre_empleado_str = '"+nombre_empleado_str+"',"
						+ "rfc_str = '"+rfc_str+"',"
						+ "total_pagado = '"+total_pagado+"',"
						+ "fecha_ingreso_dt = '"+fecha_ingreso_dt+"',"
						+ "total_percep_grab_num = '"+total_percep_grab_num+"',"
						+ "total_percep_exen_num = '"+total_percep_exen_num+"',"
						+ "total_otras_percep_num = '"+total_otras_percep_num+"',"
						+ "total_deduc_num = '"+total_deduc_num+"',"
						+ "isr_num = '"+isr_num+"',"
						+ "impuestos_retenidos_num = '"+impuestos_retenidos_num+"',"
						+ "numero_actualizacion_int = "+ ((numero_actualizacion_int) + 1) +","
						+ "id_Usuario = " + id_Usuario
						
						+" WHERE id_empleado_int = "+ id_empleado_int +"";
				
				System.out.println("FINALIZO EL UPDATE");
	            pstm = conexion.prepareStatement(SSQL);
	            System.out.println("SE EJECUTA PSTM");
	            if(pstm.executeUpdate() > 0){
	            	//System.out.println("TE ENCUENTRAS DENTRO DEL IF DE pstm.executeUpdate");
	                JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa",JOptionPane.INFORMATION_MESSAGE);
	                //Logger logger = Logger.getLogger("MyLogger", null);
	            }else {
	            	System.out.println("TE ENCUENTRAS DENTRO DEL ELSE DE pstm.executeUpdate");
	                JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización 3.3 de los datos\n"
	                                              + "Inténtelo nuevamente.", "Error en la operación", 
	                                              JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (SQLException e) {
	        	System.out.println("TE ENCUENTRAS DENTRO DEL CATCH DE UPDATE");
	            JOptionPane.showMessageDialog(null, "Proceso de actualización erroneo 3.3\n"
	                                              + "Inténtelo nuevamente.\n"
	                                              + "Error: "+e, "Error en la operación", 
	                                              JOptionPane.ERROR_MESSAGE);
	        }
			System.out.println("TE ENCUENTRAS AL FINAL DEL METODO ACTUALIZAR 3.3");
		}
	//------------------------------------------------------------------------------------------------------------------
		public void actualizar3_2 (
				String fecha_dt,
				String folio_fiscal_str,
				String folio_str,
				String fecha_pago_dt,
				String id_empleado_int,
				String nombre_empleado_str,
				String rfc_str,
				String total_pagado,
				String fecha_ingreso_dt,
				String total_percep_grab_num,
				String total_percep_exen_num,
				String total_otras_percep_num,
				String total_deduc_num,
				String isr_num,
				String impuestos_retenidos_num,
				int numero_actualizacion_int, int id_Usuario) {
			
			try{
				String SSQL = "UPDATE cfdi SET "
						+ "fecha_dt='"+fecha_dt+"',"
						+ "folio_fiscal_str = '"+folio_fiscal_str+"',"
						+ "folio_str = '"+folio_str+"',"
						+ "fecha_pago_dt = '"+fecha_pago_dt+"',"
						+ "id_empleado_int = '"+id_empleado_int+"',"
						+ "nombre_empleado_str = '"+nombre_empleado_str+"',"
						+ "rfc_str = '"+rfc_str+"',"
						+ "total_pagado = '"+total_pagado+"',"
						+ "fecha_ingreso_dt = '"+fecha_ingreso_dt+"',"
						+ "total_percep_grab_num = '"+total_percep_grab_num+"',"
						+ "total_percep_exen_num = '"+total_percep_exen_num+"',"
						+ "total_otras_percep_num = '"+total_otras_percep_num+"',"
						+ "total_deduc_num = '"+total_deduc_num+"',"
						+ "isr_num = '"+isr_num+"',"
						+ "impuestos_retenidos_num = '"+impuestos_retenidos_num+"',"
						+ "numero_actualizacion_int = "+ ((numero_actualizacion_int) + 1) +","
						+ "id_Usuario = " + id_Usuario
						
						+" WHERE id_empleado_int = "+ id_empleado_int +"";
	            
	            pstm = conexion.prepareStatement(SSQL);
	            
	            if(pstm.executeUpdate() > 0){
	                JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa",JOptionPane.INFORMATION_MESSAGE);
	                //Logger logger = Logger.getLogger("MyLogger", null);
	            }else{
	                JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos 3.2\n"
	                                              + "Inténtelo nuevamente.", "Error en la operación", 
	                                              JOptionPane.ERROR_MESSAGE);
	            }
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(null, "Proceso de actualización erroneo 3.2\n"
	                                              + "Inténtelo nuevamente.\n"
	                                              + "Error: "+e, "Error en la operación", 
	                                              JOptionPane.ERROR_MESSAGE);
	        }
		}
	// -----------------------------------------------------------------------------------------------------------------
	public void setQuery(String _query) {
		Statement state = null;
		try {
			state = (Statement) conexion.createStatement();
			state.execute(_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// -----------------------------------------------------------------------------------------------------------------

	public void cerrarConexion() throws SQLException {
		try {
			conexion.close();
			System.out.println("Conexion cerrada");
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "--- ERROR AL INTENTAR CERRAR LA CONEXION ---\n");
		}
		
	}

}
