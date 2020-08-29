package mx.gob.asa.iverar.conexiones;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Properties;

import javax.activation.DataSource;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class conexion_BD_LogIn {

public DataSource dataSource;
Connection conexion = null;
String user = "root";
String password = "";

public PreparedStatement pstm;
public ResultSet resultado;

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

//--------------------------------------------------------------------------------------------------------------
 public void WriteExcel() throws SQLException{
	 
File file = new File("C:\\Users\\car\\Desktop\\ReporteXML_Leídos.xls");

int row=0;

//FORMATO FUENTE PARA EL CONTENIDO
WritableFont wf = new WritableFont( WritableFont.ARIAL, 12, WritableFont.NO_BOLD );
WritableCellFormat cf = new WritableCellFormat(wf);    

//INTERFAZ PARA UNA HOJA DE CÁLCULO
WritableSheet excelSheet = null;
WritableWorkbook workbook = null;

//ESTABLECE LA CONFIGURACIÓN REGIONAL PARA GENERAR LA HOJA DE CALCULO
WorkbookSettings wbSettings = new WorkbookSettings();
wbSettings.setLocale(new Locale("en", "EN"));

try {
    workbook = Workbook.createWorkbook( file, wbSettings );
    //HOJA CON NOMBRE DE LA TABLA
    workbook.createSheet( "persona", 0 );
    excelSheet = workbook.getSheet(0);
    System.out.println(  "creando hoja excel.....Listo"  );            
} catch (IOException ex) {
    System.err.println( ex.getMessage() );
}

//CONSULTA SQL
//String sql = "SELECT id_empleado_int, nombre_empleado_str, total_pagado FROM cfdi";

try{
	PreparedStatement pstm = conexion.prepareStatement("SELECT id_empleado_int, nombre_empleado_str, total_pagado FROM cfdi"); //ERROR
    ResultSet rs = pstm.executeQuery();
    System.out.println(  "obteniendo registros.....Listo"  );
     
    while(rs.next())
      {
          Number id_empleado_int     = new Number( 0 , row, rs.getLong( "ID" ) , cf );
          Label nombre_empleado_str  = new Label( 1 , row, rs.getString( "NOMBRE" ) , cf );
          Number total_pagado = new Number( 2 , row, rs.getFloat( "TOTAL PAGADO" ) , cf );                                    
          row ++;                  
         try {
             excelSheet.addCell( id_empleado_int );
             excelSheet.addCell( nombre_empleado_str );
             excelSheet.addCell( total_pagado );

         } catch (WriteException ex) {
             System.err.println(  ex.getMessage() );
         } 
      }
      rs.close();         
 }catch( SQLException er){
    System.err.println( er.getMessage() );
}

//ESCRIBIR EL ARCHIVO EN DISCO
try {
    workbook.write();
    workbook.close();
    System.out.println(  "Escribiendo en disco....Listo"  );         
} catch (IOException ex) {
    System.err.println(  ex.getMessage() );
}
catch (WriteException ex) {
   System.err.println(  ex.getMessage() );
}

System.out.println(  "Proceso completado...."  );
    }
//--------------------------------------------------------------------------------------------------------------

}
