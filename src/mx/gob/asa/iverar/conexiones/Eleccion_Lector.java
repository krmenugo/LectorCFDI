package mx.gob.asa.iverar.conexiones;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.jdom.*;
import org.jdom.input.SAXBuilder;
import mx.gob.asa.iverar.version3_2compNomina.*;
import mx.gob.asa.iverar.version3_3compNomina.*;
import mx.org.asa.ivr.manejadorxml.krmenugo.vistas.Eleccion_Comprobante;

public class Eleccion_Lector {
	public static String version;
	Eleccion_Comprobante ventana = new Eleccion_Comprobante();

	public void leerCFDI() {
		SAXBuilder builder = new SAXBuilder();
		String nombreArchivo = Eleccion_Comprobante.archivo_Nombre_Ruta;
		System.out.println(nombreArchivo);
		File xmlFile = new File(nombreArchivo);
		
		CFDI_3_2_Comprobante comprobante = new CFDI_3_2_Comprobante();

		try {
			Document document = (Document) builder.build(xmlFile);
			Element nodoPrimerNivel = document.getRootElement();
			String nombrePrimerNivel = nodoPrimerNivel.getName();
			List<Attribute> listaAtributosPrimerNivel = nodoPrimerNivel.getAttributes();
			List<Element> listaHijosPrimerNivel = nodoPrimerNivel.getChildren();

			if (nombrePrimerNivel.equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE)) {
				leeNComprobante(comprobante, nodoPrimerNivel, nombrePrimerNivel, listaAtributosPrimerNivel,
						listaHijosPrimerNivel);
			} else {
				comprobante = null;
				System.out.println("ERROR: Archivo XML no válido. No se encontro la etiqueta: Comprobante");
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Archivo inválido");
			ex.printStackTrace();
		}
	}
	// -----------------------------------------------------------------------------------------------------------------
	private void leeNComprobante(CFDI_3_2_Comprobante comprobante, Element nodoPrimerNivel, String nombrePrimerNivel,
			List<Attribute> listaAtributosPrimerNivel, List<Element> listaHijosPrimerNivel) throws SQLException {// METODO leeNComprobante

		for (int ia1 = 0; ia1 < listaAtributosPrimerNivel.size(); ia1++) {
			Attribute a1 = (Attribute) listaAtributosPrimerNivel.get(ia1);
			if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_VERSION)) {
				comprobante.setVersion(nodoPrimerNivel.getAttributeValue(a1.getValue()));
				version = a1.getValue();

				switch (version) {
				case "3.2":
					//System.out.println("Llamamos a la clase LECTOR 3.2");
					Lector_CFDI_3_2_SAX.main(null);
					break;
				case "3.3":
					//System.out.println("Llamamos a la clase LECTOR 3.3");
					Lector_CFDI_3_3_SAX.main(null);
					break;
				default:
					System.out.println("default");
					break;
				}
				comprobante.setVersion(version);
			}
		}
	}

	public static void main(String[] args) {
		Eleccion_Lector cfdi = new Eleccion_Lector();
		cfdi.leerCFDI();
	}
}
