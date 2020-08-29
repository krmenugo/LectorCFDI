package mx.gob.asa.iverar.version3_2compNomina;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import mx.gob.asa.iverar.conexiones.Connection_Class;
import mx.gob.asa.iverar.conexiones.Eleccion_Ventana;
import mx.org.asa.ivr.manejadorxml.krmenugo.vistas.Eleccion_Comprobante;

// ia1 = ITERACIÓN ATRUBUTOS NIVEL 1
public class Lector_CFDI_3_2_SAX {
	public static String version;
	public static String total_comp;
	public static String tipoComprobante;

	static CFDI_3_2_Comprobante comprobante = new CFDI_3_2_Comprobante();
	Eleccion_Comprobante ventana = new Eleccion_Comprobante();

	private String generaTabuladores(int cantidad) {
		String tabuladores = "";
		for (int i = 1; i <= cantidad; i++) {
			tabuladores += "\t";
		}
		return tabuladores;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public CFDI_3_2_Comprobante leerCFDI() {
		SAXBuilder builder = new SAXBuilder();
		String nombreArchivo = ventana.archivo_Nombre_Ruta;
		//String nombreArchivo = "C:\\Users\\KRMENUGO\\Documents\\-- U N I V E R S I D A D --\\RESIDENCIAS\\P R O Y E C T O\\3_2_ASAxxxxxxU9_0A8xxx-4xx5-4xxx1.xml\\";
		File xmlFile = new File(nombreArchivo);

		try {
			Document document = (Document) builder.build(xmlFile);
			Element nodoPrimerNivel = document.getRootElement();
			String nombrePrimerNivel = nodoPrimerNivel.getName();
			List<Attribute> listaAtributosPrimerNivel = nodoPrimerNivel.getAttributes();
			List<Element> listaHijosPrimerNivel = nodoPrimerNivel.getChildren();

			System.out.println("Datos del CFDI: " + nombreArchivo);

			if (nombrePrimerNivel.equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE)) {
				leeNComprobante(comprobante, nodoPrimerNivel, nombrePrimerNivel, listaAtributosPrimerNivel,
						listaHijosPrimerNivel);
			} else {
				comprobante = null;
				System.out.println("ERROR: Archivo XML no válido. No se encontro la etiqueta: Comprobante");
			}
			return comprobante;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	// ---- leeNComprobante
	// -------------------------------------------------------------------------------------------------------------------------------------------
	private void leeNComprobante(CFDI_3_2_Comprobante comprobante, Element nodoPrimerNivel, String nombrePrimerNivel,
			List<Attribute> listaAtributosPrimerNivel, List<Element> listaHijosPrimerNivel) {// METODO leeNComprobante
		String tabuladores;
		tabuladores = generaTabuladores(1);
		System.out.println(tabuladores + "1er nivel= " + nombrePrimerNivel);
		System.out.println(tabuladores + "Atributos de 1er nivel= " + listaAtributosPrimerNivel.size());
		System.out.println(tabuladores + "Hijos de 1er nivel= " + listaHijosPrimerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		for (int ia1 = 0; ia1 < listaAtributosPrimerNivel.size(); ia1++) {
			Attribute a1 = (Attribute) listaAtributosPrimerNivel.get(ia1);
			for (int buscandoVersion = 0; buscandoVersion < listaAtributosPrimerNivel.size(); buscandoVersion++) {
				Attribute bv = (Attribute) listaAtributosPrimerNivel.get(buscandoVersion);
				// System.out.println("---> Version");
			}
			System.out.println(tabuladores + a1.getName() + ": " + a1.getValue());

			if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_VERSION)) {
				comprobante.setVersion(nodoPrimerNivel.getAttributeValue(a1.getName()));
			} else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_TOTAL))
				comprobante.setTotal(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_TIPODECOMPROBANTE))
				comprobante.setTipoDeComprobante(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_SUBTOTAL))
				comprobante.setSubTotal(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_SERIE))
				comprobante.setSerie(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_SELLO))
				comprobante.setSello(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_NOCERTIFICADO))
				comprobante.setNoCertificado(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_MOTIVODESCUENTO))
				comprobante.setMotivoDescuento(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_METODODEPAGO))
				comprobante.setMetodoDePago(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_FORMADEPAGO))
				comprobante.setFormaDePago(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_FOLIO))
				comprobante.setFolio(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_FECHA))
				comprobante.setFecha(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_DESCUENTO))
				comprobante.setDescuento(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_CERTIFICADO))
				comprobante.setCertificado(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_TIPOCAMBIO))
				comprobante.setTipoCambio(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_NUMCTAPAGO))
				comprobante.setNumCtaPago(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_MONEDA))
				comprobante.setMoneda(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_2_Comprobante.ETIQUETA_COMPROBANTE_LUGAREXPEDICION))
				comprobante.setLugarExpedicion(nodoPrimerNivel.getAttributeValue(a1.getName()));
		}
		// System.out.println(version);
		//System.out.println("\nPrueba 1 getVersion: " + comprobante.getVersion());
		//System.out.println("Prueba 2 getTotal: " + comprobante.getTotal());
		//System.out.println("Prueba 3 getTipoDeComprobante: " + comprobante.getTipoDeComprobante());
		//System.out.println("Prueba 4 getSubTotal: " + comprobante.getSubTotal() + "\n");

		for (int ih1 = 0; ih1 < listaHijosPrimerNivel.size(); ih1++) {
			Element nodoSegundoNivel = (Element) listaHijosPrimerNivel.get(ih1);
			String nombreSegundoNivel = nodoSegundoNivel.getName();
			List<Attribute> listaAtributosSegundoNivel = nodoSegundoNivel.getAttributes();
			List<Element> listaHijosSegundoNivel = nodoSegundoNivel.getChildren();

			if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_2_C_Emisor.ETIQUETA_EMISOR)) {
				ih1 = leeN_C_Emisor(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel, listaAtributosSegundoNivel,
						listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_2_C_Receptor.ETIQUETA_RECEPTOR)) {
				ih1 = leeN_C_Receptor(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_2_C_Conceptos.ETIQUETA_CONCEPTOS_CONCEPTOS)) {
				ih1 = leeN_C_Conceptos(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_2_C_Impuestos.ETIQUETA_IMPUESTOS_IMPUESTOS)) {
				ih1 = leeN_C_Impuestos(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_2_C_Complemento.ETIQUETA_COMPLEMENTO)) {
				ih1 = leeN_C_Complemento(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_2_C_Addenda.ETIQUETA_ADDENDA)) {
				ih1 = leeN_C_Addenda(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel, listaAtributosSegundoNivel,
						listaHijosSegundoNivel);
			}
		}
	}

	// 1----- leeN_C_Emisor
	// -------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Emisor(CFDI_3_2_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_2_C_Emisor cfdi_3_2_C_Emisor = new CFDI_3_2_C_Emisor();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
			if (a2.getName().equalsIgnoreCase(CFDI_3_2_C_Emisor.ETIQUETA_EMISOR_RFC))
				cfdi_3_2_C_Emisor.setRfc(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_2_C_Emisor.ETIQUETA_EMISOR_NOMBRE))
				cfdi_3_2_C_Emisor.setNombre(nodoSegundoNivel.getAttributeValue(a2.getName()));
		}
		comprobante.setEmisor(cfdi_3_2_C_Emisor);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);
			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO)) {
				ih2 = leeN_C_E_DomicilioFiscal(cfdi_3_2_C_Emisor, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			} else if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN)) {
				ih2 = leeN_C_E_ExpedidoEn(cfdi_3_2_C_Emisor, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			} else if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_E_RegimenFiscal.ETIQUETA_REGIMENFISCAL)) {
				ih2 = leeN_C_E_RegimenFiscal(cfdi_3_2_C_Emisor, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
			//System.out.println("\nPrueba Emisor getRfc: " + cfdi_3_2_C_Emisor.getRfc());
			//System.out.println("Prueba Emisor getNombre: " + cfdi_3_2_C_Emisor.getNombre() + "\n");
			//System.out.println("Prueba clases: " + comprobante.getEmisor().getRfc());
		}
		return ih1;
	}

	// ------EMISOR --->
	// leeN_C_E_DomicilioFiscal-------------------------------------------------------------------------------------------
	private int leeN_C_E_DomicilioFiscal(CFDI_3_2_C_Emisor emisor, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_2_C_E_DomicilioFiscal cfdi_3_2_C_E_DomicilioFiscal = new CFDI_3_2_C_E_DomicilioFiscal();
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_CALLE))
				cfdi_3_2_C_E_DomicilioFiscal.setCalle(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_CODIGOPOSTAL))
				cfdi_3_2_C_E_DomicilioFiscal.setCodigoPostal(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_COLONIA))
				cfdi_3_2_C_E_DomicilioFiscal.setColonia(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_ESTADO))
				cfdi_3_2_C_E_DomicilioFiscal.setEstado(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_MUNICIPIO))
				cfdi_3_2_C_E_DomicilioFiscal.setMunicipio(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_NOEXTERIOR))
				cfdi_3_2_C_E_DomicilioFiscal.setNoExterior(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_DomicilioFiscal.ETIQUETA_DOMICILIO_PAIS))
				cfdi_3_2_C_E_DomicilioFiscal.setPais(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		//System.out.println("\nPrueba DomicilioFiscal getRfc: " + cfdi_3_2_C_E_DomicilioFiscal.getCalle());
		//System.out.println("Prueba DomicilioFiscal getRfc: " + cfdi_3_2_C_E_DomicilioFiscal.getCodigoPostal());
		//System.out.println("Prueba DomicilioFiscal getNombre: " + cfdi_3_2_C_E_DomicilioFiscal.getColonia() + "\n");
		return ih2;
	}

	// ------EMISOR --->
	// leeN_C_E_ExpedidoEn-------------------------------------------------------------------------------------------
	private int leeN_C_E_ExpedidoEn(CFDI_3_2_C_Emisor emisor, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_2_C_E_ExpedidoEn cfdi_3_2_C_E_ExpedidoEn = new CFDI_3_2_C_E_ExpedidoEn();

		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_CALLE))
				cfdi_3_2_C_E_ExpedidoEn.setCalle(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_CODIGOPOSTAL))
				cfdi_3_2_C_E_ExpedidoEn.setCodigoPostal(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_COLONIA))
				cfdi_3_2_C_E_ExpedidoEn.setColonia(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_ESTADO))
				cfdi_3_2_C_E_ExpedidoEn.setEstado(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_MUNICIPIO))
				cfdi_3_2_C_E_ExpedidoEn.setMunicipio(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_NOEXTERIOR))
				cfdi_3_2_C_E_ExpedidoEn.setNoExterior(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_ExpedidoEn.ETIQUETA_EXPEDIDOEN_PAIS))
				cfdi_3_2_C_E_ExpedidoEn.setPais(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		//System.out.println("\nPrueba ExpedidoEn getCalle: " + cfdi_3_2_C_E_ExpedidoEn.getCalle());
		//System.out.println("Prueba ExpedidoEn getCodigoPostal: " + cfdi_3_2_C_E_ExpedidoEn.getCodigoPostal());
		//System.out.println("Prueba ExpedidoEn getColonia: " + cfdi_3_2_C_E_ExpedidoEn.getColonia() + "\n");
		return ih2;
	}

	// ---EMISOR --->
	// leeN_C_E_RegimenFiscal-------------------------------------------------------------------------------------
	private int leeN_C_E_RegimenFiscal(CFDI_3_2_C_Emisor emisor, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		CFDI_3_2_C_E_RegimenFiscal cfdi_3_2_C_E_RegimenFiscal = new CFDI_3_2_C_E_RegimenFiscal();
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_E_RegimenFiscal.ETIQUETA_REGIMENFISCAL_REGIMEN))
				cfdi_3_2_C_E_RegimenFiscal.setRegimen(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		//System.out.println("\nPrueba ExpedidoEn getCalle: " + cfdi_3_2_C_E_RegimenFiscal.getRegimen() + "\n");
		return ih2;
	}

	// 2------ leeN_C_Receptor
	// --------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Receptor(CFDI_3_2_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_2_C_Receptor cfdi_3_2_C_Receptor = new CFDI_3_2_C_Receptor();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
			if (a2.getName().equalsIgnoreCase(CFDI_3_2_C_Receptor.ETIQUETA_RECEPTOR_RFC))
				cfdi_3_2_C_Receptor.setRfc(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_2_C_Receptor.ETIQUETA_RECEPTOR_NOMBRE))
				cfdi_3_2_C_Receptor.setNombre(nodoSegundoNivel.getAttributeValue(a2.getName()));
		}

		//System.out.println("\nPrueba Receptor getRfc: " + cfdi_3_2_C_Receptor.getRfc());
		//System.out.println("Prueba Receptor getNombre: " + cfdi_3_2_C_Receptor.getNombre() + "\n");

		comprobante.setReceptor(cfdi_3_2_C_Receptor);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);

			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO)) {
				ih2 = leeN_C_R_Domicilio(cfdi_3_2_C_Receptor, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
		}
		return ih1;
	}

	// -------RECEPTOR --->
	// leeN_C_R_Domicilio-----------------------------------------------------------------------------------
	private int leeN_C_R_Domicilio(CFDI_3_2_C_Receptor receptor, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		CFDI_3_2_C_R_Domicilio cfdi_3_2_C_R_Domicilio = new CFDI_3_2_C_R_Domicilio();
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_CALLE))
				cfdi_3_2_C_R_Domicilio.setCalle(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_CODIGOPOSTAL))
				cfdi_3_2_C_R_Domicilio.setCodigoPostal(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_COLONIA))
				cfdi_3_2_C_R_Domicilio.setColonia(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_ESTADO))
				cfdi_3_2_C_R_Domicilio.setEstado(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_MUNICIPIO))
				cfdi_3_2_C_R_Domicilio.setMunicipio(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_NOEXTERIOR))
				cfdi_3_2_C_R_Domicilio.setNoExterior(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_NOINTERIOR))
				cfdi_3_2_C_R_Domicilio.setNoInterior(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_R_Domicilio.ETIQUETA_DOMICILIO_PAIS))
				cfdi_3_2_C_R_Domicilio.setPais(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		//System.out.println("\nPrueba Domicilio getCalle: " + cfdi_3_2_C_R_Domicilio.getCalle());
		//System.out.println("Prueba Domicilio getCodigoPostal: " + cfdi_3_2_C_R_Domicilio.getCodigoPostal());
		//System.out.println("Prueba Domicilio getColonia: " + cfdi_3_2_C_R_Domicilio.getColonia());
		//System.out.println("Prueba Domicilio getEstado: " + cfdi_3_2_C_R_Domicilio.getEstado());
		//System.out.println("Prueba Domicilio getMunicipio: " + cfdi_3_2_C_R_Domicilio.getMunicipio());
		//System.out.println("Prueba Domicilio getNoExterior: " + cfdi_3_2_C_R_Domicilio.getNoExterior());
		//System.out.println("Prueba Domicilio getNoInterior: " + cfdi_3_2_C_R_Domicilio.getNoInterior());
		//System.out.println("Prueba Domicilio getPais: " + cfdi_3_2_C_R_Domicilio.getPais() + "\n");
		return ih2;
	}

	// 3------- leeN_C_Conceptos
	// ------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Conceptos(CFDI_3_2_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_2_C_Conceptos cfdi_3_2_C_Conceptos = new CFDI_3_2_C_Conceptos();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
		}
		comprobante.setConceptos(cfdi_3_2_C_Conceptos);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);
			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO)) {
				ih2 = leeN_C_Cs_Concepto(cfdi_3_2_C_Conceptos, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
		}
		return ih1;
	}

	// -------CONCEPTOS --->
	// leeN_C_R_Concepto-----------------------------------------------------------------------------------
	private int leeN_C_Cs_Concepto(CFDI_3_2_C_Conceptos conceptos, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		CFDI_3_2_C_Cs_Concepto cfdi_3_2_C_Cs_Concepto = new CFDI_3_2_C_Cs_Concepto();
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO_CANTIDAD))
				cfdi_3_2_C_Cs_Concepto.setCantidad(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO_DESCRIPCION))
				cfdi_3_2_C_Cs_Concepto.setDescripcion(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO_IMPORTE))
				cfdi_3_2_C_Cs_Concepto.setImporte(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO_NOIDENTIFICACION))
				cfdi_3_2_C_Cs_Concepto.setNoIdentificacion(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO_UNIDAD))
				cfdi_3_2_C_Cs_Concepto.setUnidad(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_Cs_Concepto.ETIQUETA_CONCEPTO_VALORUNITARIO))
				cfdi_3_2_C_Cs_Concepto.setValorUnitario(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		//System.out.println("\nPrueba Concepto getCantidad: " + cfdi_3_2_C_Cs_Concepto.getCantidad());
		//System.out.println("Prueba Concepto getDescripcion: " + cfdi_3_2_C_Cs_Concepto.getDescripcion());
		//System.out.println("Prueba Concepto getImporte: " + cfdi_3_2_C_Cs_Concepto.getImporte());
		//System.out.println("Prueba Concepto getNoIdentificacion: " + cfdi_3_2_C_Cs_Concepto.getNoIdentificacion());
		//System.out.println("Prueba Concepto getUnidad: " + cfdi_3_2_C_Cs_Concepto.getUnidad());
		//System.out.println("Prueba Concepto getValorUnitario: " + cfdi_3_2_C_Cs_Concepto.getValorUnitario() + "\n");

		return ih2;
	}

	// 4----- leeN_C_Impuestos
	// --------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Impuestos(CFDI_3_2_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_2_C_Impuestos cfdi_3_2_C_Impuestos = new CFDI_3_2_C_Impuestos();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
			if (a2.getName().equalsIgnoreCase(CFDI_3_2_C_Impuestos.ETIQUETA_IMPUESTOS_TOTALIMPUESTOSTRASLADADOS))
				cfdi_3_2_C_Impuestos.setTotalImpuestosTrasladados(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_2_C_Impuestos.ETIQUETA_IMPUESTOS_TOTALIMPUESTOSRETENIDOS))
				cfdi_3_2_C_Impuestos.setTotalImpuestosRetenidos(nodoSegundoNivel.getAttributeValue(a2.getName()));
		}
		//System.out.println("\nPrueba Impuestos getTotalImpuestosTrasladados: "+ cfdi_3_2_C_Impuestos.getTotalImpuestosTrasladados());
		//System.out.println("Prueba Impuestos getTotalImpuestosRetenidos: " + cfdi_3_2_C_Impuestos.getTotalImpuestosRetenidos() + "\n");

		comprobante.setImpuestos(cfdi_3_2_C_Impuestos);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);

			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_Is_Retenciones.ETIQUETA_RETENCIONES)) {
				ih2 = leeN_C_Is_Retenciones(cfdi_3_2_C_Impuestos, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			} else if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_Is_Traslados.ETIQUETA_TRASLADOS)) {
				ih2 = leeN_C_Is_Traslados(cfdi_3_2_C_Impuestos, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);

			}
		}
		return ih1;
	}

	// -------IMPUESTOS --->
	// leeN_C_Is_Retenciones-----------------------------------------------------------------------------------
	private int leeN_C_Is_Retenciones(CFDI_3_2_C_Impuestos impuestos, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_2_C_Is_Retenciones cfdi_3_2_C_Is_Retenciones = new CFDI_3_2_C_Is_Retenciones();
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
		}

		impuestos.setRetenciones(cfdi_3_2_C_Is_Retenciones);

		for (int ih3 = 0; ih3 < listaHijosTercerNivel.size(); ih3++) {
			Element nodoCuartoNivel = (Element) listaHijosTercerNivel.get(ih3);

			String nombreCuartoNivel = nodoCuartoNivel.getName();
			List<Attribute> listaAtributosCuartoNivel = nodoCuartoNivel.getAttributes();
			List<Element> listaHijosCuartoNivel = nodoCuartoNivel.getChildren();

			if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_2_C_Is_Rs_Retencion.ETIQUETA_RETENCION)) {
				ih3 = leeN_C_Is_Rs_Retencion(cfdi_3_2_C_Is_Retenciones, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			}
		}
		return ih2;
	}

	// -------RETENCIONES --->
	// leeN_C_Is_Rs_Retencion-----------------------------------------------------------------------------------
	private int leeN_C_Is_Rs_Retencion(CFDI_3_2_C_Is_Retenciones retenciones, int ih2, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_2_C_Is_Rs_Retencion cfdi_3_2_C_Is_Rs_Retencion = new CFDI_3_2_C_Is_Rs_Retencion();
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_Is_Rs_Retencion.ETIQUETA_RETENCION_IMPORTE))
				cfdi_3_2_C_Is_Rs_Retencion.setImporte(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_Is_Rs_Retencion.ETIQUETA_RETENCION_IMPUESTO))
				cfdi_3_2_C_Is_Rs_Retencion.setImpuesto(nodoTercerNivel.getAttributeValue(a4.getName()));
		}
		//System.out.println("\nPrueba Retencion getImporte: " + cfdi_3_2_C_Is_Rs_Retencion.getImporte());
		//System.out.println("Prueba Retencion getImpuesto: " + cfdi_3_2_C_Is_Rs_Retencion.getImpuesto() + "\n");
		return ih2;
	}

	// -------IMPUESTOS --->
	// leeN_C_Is_Traslados-----------------------------------------------------------------------------------
	private int leeN_C_Is_Traslados(CFDI_3_2_C_Impuestos impuestos, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_2_C_Is_Traslados cfdi_3_2_C_Is_Traslados = new CFDI_3_2_C_Is_Traslados();
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
		}

		impuestos.setTraslados(cfdi_3_2_C_Is_Traslados);

		for (int ih3 = 0; ih3 < listaHijosTercerNivel.size(); ih3++) {
			Element nodoCuartoNivel = (Element) listaHijosTercerNivel.get(ih3);

			String nombreCuartoNivel = nodoCuartoNivel.getName();
			List<Attribute> listaAtributosCuartoNivel = nodoCuartoNivel.getAttributes();
			List<Element> listaHijosCuartoNivel = nodoCuartoNivel.getChildren();

			if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_2_C_Is_Ts_Traslado.ETIQUETA_TRASLADO)) {
				ih3 = leeN_C_Is_Rs_Ts_Traslado(cfdi_3_2_C_Is_Traslados, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			}
		}
		return ih2;
	}

	// -------RETENCIONES --->
	// leeN_C_Is_Rs_Retencion-----------------------------------------------------------------------------------
	private int leeN_C_Is_Rs_Ts_Traslado(CFDI_3_2_C_Is_Traslados traslados, int ih2, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			CFDI_3_2_C_Is_Ts_Traslado cfdi_3_2_C_Is_Ts_Traslado = new CFDI_3_2_C_Is_Ts_Traslado();
			if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_Is_Ts_Traslado.ETIQUETA_TRASLADO_IMPORTE))
				cfdi_3_2_C_Is_Ts_Traslado.setImporte(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_Is_Ts_Traslado.ETIQUETA_TRASLADO_IMPUESTO))
				cfdi_3_2_C_Is_Ts_Traslado.setImpuesto(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_Is_Ts_Traslado.ETIQUETA_TRASLADO_TASA))
				cfdi_3_2_C_Is_Ts_Traslado.setTasa(nodoTercerNivel.getAttributeValue(a4.getName()));
		}
		return ih2;
	}

	// 5----- Complemento
	// ------------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Complemento(CFDI_3_2_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_2_C_Complemento cfdi_3_2_C_Complemento = new CFDI_3_2_C_Complemento();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
		}
		comprobante.setComplemento(cfdi_3_2_C_Complemento);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);

			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL)) {
				ih2 = leeN_C_C_TimbreFiscalDigital(cfdi_3_2_C_Complemento, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			} else if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA)) {
				ih2 = leeN_C_C_Nomina(cfdi_3_2_C_Complemento, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
		}
		return ih1;
	}

	// -------COMPLEMENTO --->
	// leeN_C_C_TimbreFiscalDigital-----------------------------------------------------------------------------------
	private int leeN_C_C_TimbreFiscalDigital(CFDI_3_2_C_Complemento complemento, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			CFDI_3_2_C_C_TimbreFiscalDigital cfdi_3_2_C_C_TimbreFiscalDigitalo = new CFDI_3_2_C_C_TimbreFiscalDigital();
			if (a3.getName()
					.equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_FECHATIMBRADO))
				cfdi_3_2_C_C_TimbreFiscalDigitalo.setFechaTimbrado(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_UUID))
				cfdi_3_2_C_C_TimbreFiscalDigitalo.setUUID(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName()
					.equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_NOCERTIFICADOSAT))
				cfdi_3_2_C_C_TimbreFiscalDigitalo.setNoCertificadoSAT(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName()
					.equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_SELLOCFD))
				cfdi_3_2_C_C_TimbreFiscalDigitalo.setSelloCFD(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName()
					.equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_SELLOSAT))
				cfdi_3_2_C_C_TimbreFiscalDigitalo.setSelloSAT(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName()
					.equalsIgnoreCase(CFDI_3_2_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_VERSION))
				cfdi_3_2_C_C_TimbreFiscalDigitalo.setVersion(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		return ih2;
	}

	// -------COMPLEMENTO --->
	// leeN_C_C_Nomina-----------------------------------------------------------------------------------
	private int leeN_C_C_Nomina(CFDI_3_2_C_Complemento complemento, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_2_C_C_Nomina cfdi_3_2_C_C_Nomina = new CFDI_3_2_C_C_Nomina();
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_BANCO))
				cfdi_3_2_C_C_Nomina.setBanco(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_CLABE))
				cfdi_3_2_C_C_Nomina.setClabe(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_CURP))
				cfdi_3_2_C_C_Nomina.setCurp(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_DEPARTAMENTO))
				cfdi_3_2_C_C_Nomina.setDepartamento(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_FECHAFINALPAGO))
				cfdi_3_2_C_C_Nomina.setFechaFinalPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_FECHAINICIALPAGO))
				cfdi_3_2_C_C_Nomina.setFechaInicialPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_FECHAINICIORELLABORAL))
				cfdi_3_2_C_C_Nomina.setFechaInicioRelLaboral(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_FECHAPAGO))
				cfdi_3_2_C_C_Nomina.setFechaPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_NUMDIASPAGADOS))
				cfdi_3_2_C_C_Nomina.setNumDiasPagados(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_NUMEMPLEADO))
				cfdi_3_2_C_C_Nomina.setNumEmpleado(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_NUMSEGURIDADSOCIAL))
				cfdi_3_2_C_C_Nomina.setNumSeguridadSocial(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_PERIODICIDADPAGO))
				cfdi_3_2_C_C_Nomina.setPeriodicidadPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_PUESTO))
				cfdi_3_2_C_C_Nomina.setPuesto(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_REGISTROPATRONAL))
				cfdi_3_2_C_C_Nomina.setRegistroPatronal(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_TIPOREGIMEN))
				cfdi_3_2_C_C_Nomina.setTipoRegimen(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_2_C_C_Nomina.ETIQUETA_NOMINA_VERSION))
				cfdi_3_2_C_C_Nomina.setVersion(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}

		// System.out.println("Prueba deducciones getTotalGravado: " +
		// comprobante.getComplemento().getNomina().getDeducciones().getTotalGravado() +
		// "\n");

		complemento.setNomina(cfdi_3_2_C_C_Nomina);

		//System.out.println("NUM EMPLEADO >>>> " + comprobante.getComplemento().getNomina().getNumEmpleado());
		//System.out.println("FECHA DE PAGO >>>> " + comprobante.getComplemento().getNomina().getFechaPago());

		for (int ih3 = 0; ih3 < listaHijosTercerNivel.size(); ih3++) {
			Element nodoCuartoNivel = (Element) listaHijosTercerNivel.get(ih3);

			String nombreCuartoNivel = nodoCuartoNivel.getName();
			List<Attribute> listaAtributosCuartoNivel = nodoCuartoNivel.getAttributes();
			List<Element> listaHijosCuartoNivel = nodoCuartoNivel.getChildren();

			if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_2_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES)) {
				ih3 = leeN_C_C_N_Percepciones(cfdi_3_2_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			} else if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_2_C_C_N_Deducciones.ETIQUETA_DEDUCCIONES)) {
				ih3 = leeN_C_C_N_Deducciones(cfdi_3_2_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			} else if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_2_C_C_N_HorasExtras.ETIQUETA_HORASEXTRAS)) {
				ih3 = leeN_C_C_N_HorasExtras(cfdi_3_2_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			}
		}
		return ih2;
	}

	// -------NOMINA --->
	// leeN_C_C_N_Percepciones-----------------------------------------------------------------------------------
	private int leeN_C_C_N_Percepciones(CFDI_3_2_C_C_Nomina nomina, int ih2, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			CFDI_3_2_C_C_N_Percepciones cfdi_3_2_C_C_N_Percepciones = new CFDI_3_2_C_C_N_Percepciones();
			if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES_TOTALEXENTO))
				cfdi_3_2_C_C_N_Percepciones.setTotalExento(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES_TOTALGRAVADO))
				cfdi_3_2_C_C_N_Percepciones.setTotalGravado(nodoTercerNivel.getAttributeValue(a4.getName()));
		}

		return ih2;
	}

	// -------NOMINA --->
	// leeN_C_C_N_Deducciones-----------------------------------------------------------------------------------
	private int leeN_C_C_N_Deducciones(CFDI_3_2_C_C_Nomina nomina, int ih2, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			CFDI_3_2_C_C_N_Deducciones cfdi_3_2_C_C_N_Deducciones = new CFDI_3_2_C_C_N_Deducciones();
			if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_C_N_Deducciones.ETIQUETA_DEDUCCIONES_TOTALEXENTO))
				cfdi_3_2_C_C_N_Deducciones.setTotalExento(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_2_C_C_N_Deducciones.ETIQUETA_DEDUCCIONES_TOTALGRAVADO))
				cfdi_3_2_C_C_N_Deducciones.setTotalGravado(nodoTercerNivel.getAttributeValue(a4.getName()));
		}
		return ih2;
	}

	// -------NOMINA --->
	// leeN_C_C_N_HorasExtras-----------------------------------------------------------------------------------
	private int leeN_C_C_N_HorasExtras(CFDI_3_2_C_C_Nomina nomina, int ih2, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
		}
		return ih2;
	}

	// 6--- Addenda
	// ---------------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Addenda(CFDI_3_2_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_2_C_Addenda cfdi_3_2_C_Addenda = new CFDI_3_2_C_Addenda();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
		}

		comprobante.setAddenda(cfdi_3_2_C_Addenda);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);

			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_2_C_A_Observaciones.ETIQUETA_OBSERVACION)) {
				ih2 = leeN_C_A_Observaciones(cfdi_3_2_C_Addenda, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
		}
		return ih1;
	}

	// -------ADDENDA --->
	// leeN_C_C_Nomina-----------------------------------------------------------------------------------
	private int leeN_C_A_Observaciones(CFDI_3_2_C_Addenda addenda, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
		}
		return ih2;
	}
	public static void comp() {
		System.out.println("FECHA = "+comprobante.getFecha());
		System.out.println("Folio = "+comprobante.getFolio());
		System.out.println("RFC = "+comprobante.getReceptor().getRfc());
		System.out.println("FECHA DE PAGO = "+comprobante.getComplemento().getNomina().getFechaPago());
		System.out.println("NUM EMPLEADO = "+comprobante.getComplemento().getNomina().getNumEmpleado());
		System.out.println("NOMBRE = "+comprobante.getReceptor().getNombre());
		System.out.println("RFC"+comprobante.getReceptor().getRfc());
		System.out.println("Total = "+comprobante.getTotal());
		System.out.println("Fecha Inicial Rel Lab = "+ comprobante.getComplemento().getNomina().getFechaInicioRelLaboral());
		//------------------------------------------------------------------
		//System.out.println("Percepciones total gravado = "+ comprobante.getComplemento().getNomina().getPercepciones().getTotalGravado());
		//System.out.println("P Total Exento = "+ comprobante.getComplemento().getNomina().getPercepciones().getTotalExento());
		//System.out.println("BANCO = "+ comprobante.getComplemento().getNomina().getBanco());
		//System.out.println("getTotalImpuestosRetenidos = "+ comprobante.getComplemento().getNomina().getDeducciones().getTotalImpuestosRetenidos());
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) throws SQLException {
		System.out.println("\n----- L E C T U R A   D E   C F D I   ( V E R S I O N   3 . 2 ) -----\n");
		Lector_CFDI_3_2_SAX lector3_2 = new Lector_CFDI_3_2_SAX();
		CFDI_3_2_Comprobante comprobante = lector3_2.leerCFDI();
		comp();
		if (comprobante != null) {
			System.out.println("Datos del CFDI leido:" + comprobante);

			Connection_Class conexion = new Connection_Class();
			conexion.abrirConexion();
			boolean existe = conexion.existeDatosXML(
					comprobante.getComplemento().getNomina().getNumEmpleado(),
					comprobante.getComplemento().getNomina().getFechaPago());
			
			/*int actualizacionNumero = conexion.registro(
					comprobante.getComplemento().getNomina().getNumEmpleado(),
					comprobante.getComplemento().getNomina().getFechaPago());*/
			
			if (existe == true) {
				try {
					conexion.actualizar3_2(
							comprobante.getFecha(),
							comprobante.getFolio(),
							comprobante.getFolio(),
							comprobante.getComplemento().getNomina().getFechaPago(),
							comprobante.getComplemento().getNomina().getNumEmpleado(),
							comprobante.getReceptor().getNombre(),
							comprobante.getReceptor().getRfc(),
							comprobante.getTotal(),
							comprobante.getComplemento().getNomina().getFechaInicioRelLaboral(),
							String.valueOf(comprobante.getComplemento().getNomina().getPercepciones()),
							"0",
							String.valueOf(comprobante.getComplemento().getNomina().getDeducciones()),
							"s/n",
							comprobante.getImpuestos().getTotalImpuestosRetenidos(),
							comprobante.getImpuestos().getTotalImpuestosRetenidos(),
							1,
							7
							);
				} catch (Exception e) {
					System.out.println("ERROR");
				}
			} else {
				try {
					conexion.guardar(
							comprobante.getFecha(),
							comprobante.getFolio(),
							comprobante.getFolio(),
							comprobante.getComplemento().getNomina().getFechaPago(),
							comprobante.getComplemento().getNomina().getNumEmpleado(),
							comprobante.getReceptor().getNombre(),
							comprobante.getReceptor().getRfc(),
							comprobante.getTotal(),
							comprobante.getComplemento().getNomina().getFechaInicioRelLaboral(),
							String.valueOf(comprobante.getComplemento().getNomina().getPercepciones()),
							"0",
							String.valueOf(comprobante.getComplemento().getNomina().getDeducciones()),
							"s/n",
							comprobante.getImpuestos().getTotalImpuestosRetenidos(),
							comprobante.getImpuestos().getTotalImpuestosRetenidos(),
							0,
							7);
				} catch (Exception e) {
					System.out.println("El CFDI no puede ser almacenado, intentalo de nuevo!");
				}
			}
			conexion.cerrarConexion();
		}
	}
}
