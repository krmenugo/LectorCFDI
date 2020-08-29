package mx.gob.asa.iverar.version3_3compNomina;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import org.jdom.*;
import org.jdom.input.SAXBuilder;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import mx.gob.asa.iverar.conexiones.Connection_Class;
import mx.gob.asa.iverar.conexiones.Eleccion_Ventana;
import mx.gob.asa.iverar.version3_2compNomina.CFDI_3_2_Comprobante;
import mx.org.asa.ivr.manejadorxml.krmenugo.vistas.Eleccion_Comprobante;

// ia1 = ITERACIÓN ATRUBUTOS NIVEL 1
public class Lector_CFDI_3_3_SAX {
	static CFDI_3_3_Comprobante comprobante = new CFDI_3_3_Comprobante();
	Eleccion_Comprobante ventana = new Eleccion_Comprobante();

	private String generaTabuladores(int cantidad) {
		String tabuladores = "";
		for (int i = 1; i <= cantidad; i++) {
			tabuladores += "\t";
		}
		return tabuladores;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public CFDI_3_3_Comprobante leerCFDI() {
		SAXBuilder builder = new SAXBuilder();
		String nombreArchivo = ventana.archivo_Nombre_Ruta;
		//String nombreArchivo = "C:\\Users\\KRMENUGO\\Documents\\-- U N I V E R S I D A D --\\RESIDENCIAS\\P R O Y E C T O\\3_3_201xxxx3280N.xml";
		//String nombreArchivo = "C:\\Users\\KRMENUGO\\Documents\\-- U N I V E R S I D A D --\\RESIDENCIAS\\P R O Y E C T O\\3_2_ASAxxxxxxU9_0A8xxx-4xx5-4xxx1.xml\\";
		File xmlFile = new File(nombreArchivo);

		try {
			Document document = (Document) builder.build(xmlFile);
			
			Element nodoPrimerNivel = document.getRootElement();
			String nombrePrimerNivel = nodoPrimerNivel.getName();
			List<Attribute> listaAtributosPrimerNivel = nodoPrimerNivel.getAttributes();
			List<Element> listaHijosPrimerNivel = nodoPrimerNivel.getChildren();

			System.out.println("Datos del CFDI: " + nombreArchivo);

			if (nombrePrimerNivel.equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE)) {
				leeNComprobante(comprobante, nodoPrimerNivel, nombrePrimerNivel, listaAtributosPrimerNivel,
						listaHijosPrimerNivel);
			} else {
				comprobante = null;
				System.out.println("ERROR: Archivo XML no válido. No se encontro la etiqueta: Comprobante");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return comprobante;
	}

	// ---- leeNComprobante -------------------------------------------------------------------------------------------------------------------------------------------
	private void leeNComprobante(CFDI_3_3_Comprobante comprobante, Element nodoPrimerNivel, String nombrePrimerNivel,
			List<Attribute> listaAtributosPrimerNivel, List<Element> listaHijosPrimerNivel) {// METODO leeNComprobante
		String tabuladores;
		tabuladores = generaTabuladores(1);
		System.out.println(tabuladores + "1er nivel= " + nombrePrimerNivel);
		System.out.println(tabuladores + "Atributos de 1er nivel= " + listaAtributosPrimerNivel.size());
		System.out.println(tabuladores + "Hijos de 1er nivel= " + listaHijosPrimerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		for (int ia1 = 0; ia1 < listaAtributosPrimerNivel.size(); ia1++) {
			Attribute a1 = (Attribute) listaAtributosPrimerNivel.get(ia1);
			System.out.println(tabuladores + a1.getName() + ": " + a1.getValue());
			if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_VERSION))
				comprobante.setVersion(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_TOTAL))
				comprobante.setTotal(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_TIPODECOMPROBANTE))
				comprobante.setTipoDeComprobante(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_TIPOCAMBIO))
				comprobante.setTipoCambio(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_SUBTOTAL))
				comprobante.setSubTotal(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_SERIE))
				comprobante.setSerie(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_SELLO))
				comprobante.setSello(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_NOCERTIFICADO))
				comprobante.setNoCertificado(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_MONEDA))
				comprobante.setMoneda(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_METODOPAGO))
				comprobante.setMetodoPago(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_LUGAREXPEDICION))
				comprobante.setLugarExpedicion(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_FORMAPAGO))
				comprobante.setFormaPago(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_FOLIO))
				comprobante.setFolio(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_FECHA))
				comprobante.setFecha(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_DESCUENTO))
				comprobante.setDescuento(nodoPrimerNivel.getAttributeValue(a1.getName()));
			else if (a1.getName().equalsIgnoreCase(CFDI_3_3_Comprobante.ETIQUETA_COMPROBANTE_CERTIFICADO))
				comprobante.setCertificado(nodoPrimerNivel.getAttributeValue(a1.getName()));
		}
		
		System.out.println("\n--> getFecha: " + comprobante.getFecha());
		System.out.println("--> getFolio: " + comprobante.getFolio() +"\n");

		for (int ih1 = 0; ih1 < listaHijosPrimerNivel.size(); ih1++) {
			Element nodoSegundoNivel = (Element) listaHijosPrimerNivel.get(ih1);

			String nombreSegundoNivel = nodoSegundoNivel.getName();
			List<Attribute> listaAtributosSegundoNivel = nodoSegundoNivel.getAttributes();
			List<Element> listaHijosSegundoNivel = nodoSegundoNivel.getChildren();

			if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_3_C_Emisor.ETIQUETA_EMISOR)) {
				ih1 = leeN_C_Emisor(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel, listaAtributosSegundoNivel,
						listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_3_C_Receptor.ETIQUETA_RECEPTOR)) {
				ih1 = leeN_C_Receptor(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_3_C_Conceptos.ETIQUETA_CONCEPTOS)) {
				ih1 = leeN_C_Conceptos(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			} else if (nombreSegundoNivel.equalsIgnoreCase(CFDI_3_3_C_Complemento.ETIQUETA_COMPLEMENTO)) {
				ih1 = leeN_C_Complemento(comprobante, ih1, nodoSegundoNivel, nombreSegundoNivel,
						listaAtributosSegundoNivel, listaHijosSegundoNivel);
			}
		}
	}

	// ----- leeN_C_Emisor
	// -------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Emisor(CFDI_3_3_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_3_C_Emisor cfdi_3_3_C_Emisor = new CFDI_3_3_C_Emisor();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
			if (a2.getName().equalsIgnoreCase(CFDI_3_3_C_Emisor.ETIQUETA_EMISOR_RFC))
				cfdi_3_3_C_Emisor.setRfc(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_3_C_Emisor.ETIQUETA_EMISOR_REGIMENFISCAL))
				cfdi_3_3_C_Emisor.setRegimenFiscal(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_3_C_Emisor.ETIQUETA_EMISOR_NOMBRE))
				cfdi_3_3_C_Emisor.setNombre(nodoSegundoNivel.getAttributeValue(a2.getName()));
		}
		comprobante.setEmisor(cfdi_3_3_C_Emisor);
		return ih1;
	}

	// ------ leeN_C_Receptor
	// --------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Receptor(CFDI_3_3_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		CFDI_3_3_C_Receptor cfdi_3_3_C_Receptor = new CFDI_3_3_C_Receptor();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
			if (a2.getName().equalsIgnoreCase(CFDI_3_3_C_Receptor.ETIQUETA_RECEPTOR_RFC))
				cfdi_3_3_C_Receptor.setRfc(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_3_C_Receptor.ETIQUETA_RECEPTOR_NOMBRE))
				cfdi_3_3_C_Receptor.setNombre(nodoSegundoNivel.getAttributeValue(a2.getName()));
			else if (a2.getName().equalsIgnoreCase(CFDI_3_3_C_Receptor.ETIQUETA_RECEPTOR_USOCFDI))
				cfdi_3_3_C_Receptor.setUsocfdi(nodoSegundoNivel.getAttributeValue(a2.getName()));
		}
		comprobante.setReceptor(cfdi_3_3_C_Receptor);
		return ih1;
	}

	// ------- leeN_C_Conceptos
	// ------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Conceptos(CFDI_3_3_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_3_C_Conceptos cfdi_3_2_C_Conceptos = new CFDI_3_3_C_Conceptos();
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

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO)) {
				ih2 = leeN_C_Cs_Concepto(cfdi_3_2_C_Conceptos, ih2, nodoTercerNivel, nombreTercerNivel, 
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
		}

		return ih1;
	}

	// -------CONCEPTOS --->
	// leeN_C_R_Concepto-----------------------------------------------------------------------------------
	private int leeN_C_Cs_Concepto(CFDI_3_3_C_Conceptos conceptos, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		
		CFDI_3_3_C_Cs_Concepto cfdi_3_3_C_Cs_Concepto = new CFDI_3_3_C_Cs_Concepto();
		
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_DESCUENTO))
				cfdi_3_3_C_Cs_Concepto.setDescuento(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_VALORUNITARIO))
				cfdi_3_3_C_Cs_Concepto.setValorUnitario(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_IMPORTE))
				cfdi_3_3_C_Cs_Concepto.setImporte(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_DESCRIPCION))
				cfdi_3_3_C_Cs_Concepto.setDescripcion(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_CLAVEUNIDAD))
				cfdi_3_3_C_Cs_Concepto.setClaveUnidad(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_CLAVEPRODSERV))
				cfdi_3_3_C_Cs_Concepto.setClaveProdServ(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_Cs_Concepto.ETIQUETA_CONCEPTOS_CONCEPTO_CANTIDAD))
				cfdi_3_3_C_Cs_Concepto.setCantidad(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		conceptos.setConcepto(cfdi_3_3_C_Cs_Concepto);
		return ih2;
	}

	// ----- Complemento
	// ------------------------------------------------------------------------------------------------------------------------------------------
	private int leeN_C_Complemento(CFDI_3_3_Comprobante comprobante, int ih1, Element nodoSegundoNivel,
			String nombreSegundoNivel, List<Attribute> listaAtributosSegundoNivel,
			List<Element> listaHijosSegundoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(2);
		System.out.println(tabuladores + "2do nivel= " + nombreSegundoNivel);
		System.out.println(tabuladores + "Atributos de 2dor nivel= " + listaAtributosSegundoNivel.size());
		System.out.println(tabuladores + "Hijos de 2do nivel= " + listaHijosSegundoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");

		CFDI_3_3_C_Complemento cfdi_3_3_C_Complemento = new CFDI_3_3_C_Complemento();
		for (int ia2 = 0; ia2 < listaAtributosSegundoNivel.size(); ia2++) {
			Attribute a2 = (Attribute) listaAtributosSegundoNivel.get(ia2);
			System.out.println(tabuladores + a2.getName() + ": " + a2.getValue());
		}
		comprobante.setComplemento(cfdi_3_3_C_Complemento);

		for (int ih2 = 0; ih2 < listaHijosSegundoNivel.size(); ih2++) {
			Element nodoTercerNivel = (Element) listaHijosSegundoNivel.get(ih2);

			String nombreTercerNivel = nodoTercerNivel.getName();
			List<Attribute> listaAtributosTercerNivel = nodoTercerNivel.getAttributes();
			List<Element> listaHijosTercerNivel = nodoTercerNivel.getChildren();

			if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA)) {
				ih2 = leeN_C_C_Nomina (cfdi_3_3_C_Complemento, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}else if (nombreTercerNivel.equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL)) {
				ih2 = leeN_C_C_TimbreFiscalDigital (cfdi_3_3_C_Complemento, ih2, nodoTercerNivel, nombreTercerNivel,
						listaAtributosTercerNivel, listaHijosTercerNivel);
			}
		}
		return ih1;
	}

	// -------COMPLEMENTO --->
	// leeN_C_C_Nomina-----------------------------------------------------------------------------------
	private int leeN_C_C_Nomina(CFDI_3_3_C_Complemento complemento, int ih2, Element nodoSegundoNivel,
			String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(3);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
		System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
		System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		
		CFDI_3_3_C_C_Nomina cfdi_3_3_C_C_Nomina = new CFDI_3_3_C_C_Nomina();
		
		for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
			Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
			System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
			if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_VERSION))
				cfdi_3_3_C_C_Nomina.setVersion(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_TOTALPERCEPCIONES))
				cfdi_3_3_C_C_Nomina.setTotalPercepciones(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_TOTALDEDUCCIONES))
				cfdi_3_3_C_C_Nomina.setTotalDeducciones(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_TIPONOMINA))
				cfdi_3_3_C_C_Nomina.setTipoNomina(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_NUMDIASPAGADOS))
				cfdi_3_3_C_C_Nomina.setNumDiasPagados(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_FECHAPAGO))
				cfdi_3_3_C_C_Nomina.setFechaPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_FECHAINICIALPAGO))
				cfdi_3_3_C_C_Nomina.setFechaInicialPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
			else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_Nomina.ETIQUETA_NOMINA_FECHAFINALPAGO))
				cfdi_3_3_C_C_Nomina.setFechaFinalPago(nodoSegundoNivel.getAttributeValue(a3.getName()));
		}
		complemento.setNomina(cfdi_3_3_C_C_Nomina);

		for (int ih3 = 0; ih3 < listaHijosTercerNivel.size(); ih3++) {
			Element nodoCuartoNivel = (Element) listaHijosTercerNivel.get(ih3);

			String nombreCuartoNivel = nodoCuartoNivel.getName();
			List<Attribute> listaAtributosCuartoNivel = nodoCuartoNivel.getAttributes();
			List<Element> listaHijosCuartoNivel = nodoCuartoNivel.getChildren();

			if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_3_C_C_N_Emisor.ETIQUETA_NOMINA_EMISOR)) {
				ih3 = leeN_C_C_N_Emisor(cfdi_3_3_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			} else if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR)) {
				ih3 = leeN_C_C_N_Receptor(cfdi_3_3_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			} else if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_3_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES)) {
				ih3 = leeN_C_C_N_Percepciones(cfdi_3_3_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			} else if (nombreCuartoNivel.equalsIgnoreCase(CFDI_3_3_C_C_N_Deducciones.ETIQUETA_DEDUCCIONES)) {
				ih3 = leeN_C_C_N_Deducciones(cfdi_3_3_C_C_Nomina, ih3, nodoCuartoNivel, nombreCuartoNivel,
						listaAtributosCuartoNivel, listaHijosCuartoNivel);
			}
		}
		return ih2;
	}
	// -------COMPLEMENTO --->
		// leeN_C_C_Nomina-----------------------------------------------------------------------------------
		private int leeN_C_C_TimbreFiscalDigital(CFDI_3_3_C_Complemento complemento, int ih2, Element nodoSegundoNivel,
				String nombreTercerNivel, List<Attribute> listaAtributosTercerNivel, List<Element> listaHijosTercerNivel) {
			String tabuladores;
			tabuladores = generaTabuladores(3);
			System.out.println("\t\t\t-------------------------");
			System.out.println(tabuladores + "3er nivel= " + nombreTercerNivel);
			System.out.println(tabuladores + "Atributos de 3er nivel= " + listaAtributosTercerNivel.size());
			System.out.println(tabuladores + "Hijos de 3er nivel= " + listaHijosTercerNivel.size());
			System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
			
			CFDI_3_3_C_C_TimbreFiscalDigital cfdi_3_3_C_C_TimbreFiscalDigital = new CFDI_3_3_C_C_TimbreFiscalDigital();
			
			for (int ia3 = 0; ia3 < listaAtributosTercerNivel.size(); ia3++) {
				Attribute a3 = (Attribute) listaAtributosTercerNivel.get(ia3);
				System.out.println(tabuladores + a3.getName() + ": " + a3.getValue());
				if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_VERSION))
					cfdi_3_3_C_C_TimbreFiscalDigital.setVersion(nodoSegundoNivel.getAttributeValue(a3.getName()));
				else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_SELLOSAT))
					cfdi_3_3_C_C_TimbreFiscalDigital.setSellosat(nodoSegundoNivel.getAttributeValue(a3.getName()));
				else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_NOCERTIFICADOSAT))
					cfdi_3_3_C_C_TimbreFiscalDigital.setNoCertificadosat(nodoSegundoNivel.getAttributeValue(a3.getName()));
				else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_RFCPROVCERTIF))
					cfdi_3_3_C_C_TimbreFiscalDigital.setRfcprovcertif(nodoSegundoNivel.getAttributeValue(a3.getName()));
				else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_FECHATIMBRADO))
					cfdi_3_3_C_C_TimbreFiscalDigital.setFechatimbrado(nodoSegundoNivel.getAttributeValue(a3.getName()));
				else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_UUID))
					cfdi_3_3_C_C_TimbreFiscalDigital.setUuid(nodoSegundoNivel.getAttributeValue(a3.getName()));
				else if (a3.getName().equalsIgnoreCase(CFDI_3_3_C_C_TimbreFiscalDigital.ETIQUETA_TIMBREFISCALDIGITAL_SELLOCFD))
					cfdi_3_3_C_C_TimbreFiscalDigital.setSellocfd(nodoSegundoNivel.getAttributeValue(a3.getName()));
			}
			complemento.setTimbreFiscalDigital(cfdi_3_3_C_C_TimbreFiscalDigital);
			return ih2;
		}

	// -------NOMINA --->
	// leeN_C_C_N_Emisor-----------------------------------------------------------------------------------
	private int leeN_C_C_N_Emisor(CFDI_3_3_C_C_Nomina nomina, int ih3, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		
		CFDI_3_3_C_C_N_Emisor cfdi_3_3_C_C_N_Emisor = new CFDI_3_3_C_C_N_Emisor();
		
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Emisor.ETIQUETA_NOMINA_EMISOR_REGISTROPATRONAL))
				cfdi_3_3_C_C_N_Emisor.setRegistroPatronal(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Emisor.ETIQUETA_NOMINA_EMISOR_RFCPATRONORIGEN))
				cfdi_3_3_C_C_N_Emisor.setRfcPatronOrigen(nodoTercerNivel.getAttributeValue(a4.getName()));
		}
		nomina.setEmisor_Nomina(cfdi_3_3_C_C_N_Emisor);
		return ih3;
	}

	// -------NOMINA --->
	// leeN_C_C_N_Receptor------------------------------------------------------------------------------------------------
	private int leeN_C_C_N_Receptor(CFDI_3_3_C_C_Nomina nomina, int ih3, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		
		CFDI_3_3_C_C_N_Receptor cfdi_3_3_C_C_N_Receptor = new CFDI_3_3_C_C_N_Receptor();
		
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			
			if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_TIPOREGIMEN))
				cfdi_3_3_C_C_N_Receptor.setTipoRegimen(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_TIPOJORNADA))
				cfdi_3_3_C_C_N_Receptor.setTipoJornada(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_TIPOCONTRATO))
				cfdi_3_3_C_C_N_Receptor.setTipoContrato(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_SINDICALIZADO))
				cfdi_3_3_C_C_N_Receptor.setSindicalizado(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_SALARIODIARIOINTEGRADO))
				cfdi_3_3_C_C_N_Receptor.setSalarioDiarioIntegrado(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_SALARIOBASECOTAPOR))
				cfdi_3_3_C_C_N_Receptor.setSalarioBaseCotApor(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_RIESGOPUESTO))
				cfdi_3_3_C_C_N_Receptor.setRiesgoPuesto(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_PUESTO))
				cfdi_3_3_C_C_N_Receptor.setPuesto(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_PERIODICIDADPAGO))
				cfdi_3_3_C_C_N_Receptor.setPeriodicidadPago(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_NUMSEGURIDADSOCIAL))
				cfdi_3_3_C_C_N_Receptor.setNumSeguridadSocial(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_NUMEMPLEADO))
				cfdi_3_3_C_C_N_Receptor.setNumEmpleado(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_FECHAINICIORELLABORAL))
				cfdi_3_3_C_C_N_Receptor.setFechaInicioRelLaboral(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_DEPARTAMENTO))
				cfdi_3_3_C_C_N_Receptor.setDepartamento(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_CURP))
				cfdi_3_3_C_C_N_Receptor.setCurp(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_CUENTABANCARIA))
				cfdi_3_3_C_C_N_Receptor.setCuentaBancaria(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_CLAVEENTFED))
				cfdi_3_3_C_C_N_Receptor.setClaveEntFed(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_BANCO))
				cfdi_3_3_C_C_N_Receptor.setBanco(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Receptor.ETIQUETA_NOMINA_RECEPTOR_ANTIGÜEDAD))
				cfdi_3_3_C_C_N_Receptor.setAntigüedad(nodoTercerNivel.getAttributeValue(a4.getName()));
		}
		nomina.setReceptor_Nomina(cfdi_3_3_C_C_N_Receptor);
		return ih3;
	}
	// -------NOMINA --->
		// leeN_C_C_N_Percepciones-----------------------------------------------------------------------------------
		private int leeN_C_C_N_Percepciones(CFDI_3_3_C_C_Nomina nomina, int ih3, Element nodoTercerNivel,
				String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
			String tabuladores;
			tabuladores = generaTabuladores(4);
			System.out.println("\t\t\t-------------------------");
			System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
			System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
			System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
			System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
			
			CFDI_3_3_C_C_N_Percepciones cfdi_3_3_C_C_N_Percepciones = new CFDI_3_3_C_C_N_Percepciones();
			
			for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
				Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
				System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
				if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES_TOTALSUELDOS))
					cfdi_3_3_C_C_N_Percepciones.setTotalSueldos(nodoTercerNivel.getAttributeValue(a4.getName()));
				else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES_TOTALGRAVADO))
					cfdi_3_3_C_C_N_Percepciones.setTotalGravado(nodoTercerNivel.getAttributeValue(a4.getName()));
				else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Percepciones.ETIQUETA_PERCEPCIONES_TOTALEXENTO))
					cfdi_3_3_C_C_N_Percepciones.setTotalExento(nodoTercerNivel.getAttributeValue(a4.getName()));
			}
			nomina.setPercepciones(cfdi_3_3_C_C_N_Percepciones);
			return ih3;
		}
	// -------NOMINA --->
	// leeN_C_C_N_Deducciones-----------------------------------------------------------------------------------
	private int leeN_C_C_N_Deducciones(CFDI_3_3_C_C_Nomina nomina, int ih3, Element nodoTercerNivel,
			String nombreCuartoNivel, List<Attribute> listaAtributosCuartoNivel, List<Element> listaHijosCuartoNivel) {
		String tabuladores;
		tabuladores = generaTabuladores(4);
		System.out.println("\t\t\t-------------------------");
		System.out.println(tabuladores + "4to nivel= " + nombreCuartoNivel);
		System.out.println(tabuladores + "Atributos de 4to nivel= " + listaAtributosCuartoNivel.size());
		System.out.println(tabuladores + "Hijos de 4to nivel= " + listaHijosCuartoNivel.size());
		System.out.println(tabuladores + "--> LISTA DE ATRIBUTOS: ");
		
		CFDI_3_3_C_C_N_Deducciones cfdi_3_3_C_C_N_Deducciones = new CFDI_3_3_C_C_N_Deducciones();
		
		for (int ia4 = 0; ia4 < listaAtributosCuartoNivel.size(); ia4++) {
			Attribute a4 = (Attribute) listaAtributosCuartoNivel.get(ia4);
			System.out.println(tabuladores + a4.getName() + ": " + a4.getValue());
			if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Deducciones.ETIQUETA_DEDUCCIONES_TOTALOTRASDEDUCCIONES))
				cfdi_3_3_C_C_N_Deducciones.setTotalOtrasDeducciones(nodoTercerNivel.getAttributeValue(a4.getName()));
			else if (a4.getName().equalsIgnoreCase(CFDI_3_3_C_C_N_Deducciones.ETIQUETA_DEDUCCIONES_TOTALIMPUESTOSRETENIDOS))
				cfdi_3_3_C_C_N_Deducciones.setTotalImpuestosRetenidos(nodoTercerNivel.getAttributeValue(a4.getName()));
		}
		nomina.setDeducciones(cfdi_3_3_C_C_N_Deducciones);
		return ih3;
	}

	public static void comp() {
		System.out.println("FECHA = "+ comprobante.getFecha());
		System.out.println("FOLIO = "+ comprobante.getFolio());
		System.out.println("CURP = "+ comprobante.getComplemento().getNomina().getReceptor_Nomina().getCurp());
		System.out.println("FECHA DE PAGO = "+ comprobante.getComplemento().getNomina().getFechaPago());
		System.out.println("NUM DE EMPLEADO = "+ comprobante.getComplemento().getNomina().getReceptor_Nomina().getNumEmpleado());
		System.out.println("NOMBRE = "+ comprobante.getReceptor().getNombre());
		System.out.println("RFC = "+ comprobante.getReceptor().getRfc());
		System.out.println("TOTAL = "+ comprobante.getTotal());
		System.out.println("FECHA INICIO LAB = "+ comprobante.getComplemento().getNomina().getReceptor_Nomina().getFechaInicioRelLaboral());
		System.out.println("TOTAL GRAVADO = "+ comprobante.getComplemento().getNomina().getPercepciones().getTotalGravado());
		System.out.println("TOTAL EXENTO = "+ comprobante.getComplemento().getNomina().getPercepciones().getTotalExento());
		System.out.println("TOTAL SUELDOS = "+ comprobante.getComplemento().getNomina().getPercepciones().getTotalSueldos());
		System.out.println("getTotalOtrasDeducciones = "+ comprobante.getComplemento().getNomina().getDeducciones().getTotalOtrasDeducciones());
		System.out.println("getBanco"+ comprobante.getComplemento().getNomina().getReceptor_Nomina().getBanco());
		System.out.println("getTotalImpuestosRetenidos = "+ comprobante.getComplemento().getNomina().getDeducciones().getTotalImpuestosRetenidos());
	}
	// ---------------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) throws SQLException {
		System.out.println("\n----- L E C T U R A   D E   C F D I   ( V E R S I O N   3 . 3 ) -----\n");
		Lector_CFDI_3_3_SAX lector3_3 = new Lector_CFDI_3_3_SAX();
		CFDI_3_3_Comprobante comprobante = lector3_3.leerCFDI();
		lector3_3.leerCFDI();
		boolean existe = false;
		Connection_Class conexion = new Connection_Class();
		comp();
		if (comprobante != null) {
			System.out.println("Datos del CFDI leido:" + comprobante);
			conexion.abrirConexion();
			existe = conexion.existeDatosXML(
					comprobante.getComplemento().getNomina().getReceptor_Nomina().getNumEmpleado(),
					comprobante.getComplemento().getNomina().getFechaPago());}

			if (existe == true) {
				try {
					conexion.actualizar3_3(
							comprobante.getFecha(),
							comprobante.getFolio(),
							comprobante.getFolio(),
							comprobante.getComplemento().getNomina().getFechaPago(),
							comprobante.getComplemento().getNomina().getReceptor_Nomina().getNumEmpleado(),
							comprobante.getReceptor().getNombre(),
							comprobante.getReceptor().getRfc(),
							comprobante.getTotal(),
							comprobante.getComplemento().getNomina().getReceptor_Nomina().getFechaInicioRelLaboral(),
							comprobante.getComplemento().getNomina().getPercepciones().getTotalGravado(),
							comprobante.getComplemento().getNomina().getTotalPercepciones(),
							comprobante.getComplemento().getNomina().getTotalPercepciones(),
							comprobante.getComplemento().getNomina().getTotalDeducciones(),
							comprobante.getFolio(),
							comprobante.getComplemento().getNomina().getDeducciones().getTotalImpuestosRetenidos(),
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
							comprobante.getEmisor().getRegimenFiscal(),
							comprobante.getFolio(),
							comprobante.getComplemento().getNomina().getFechaPago(),
							comprobante.getComplemento().getNomina().getReceptor_Nomina().getNumEmpleado(),
							comprobante.getReceptor().getNombre(),
							comprobante.getReceptor().getRfc(),
							comprobante.getTotal(),
							comprobante.getComplemento().getNomina().getReceptor_Nomina().getFechaInicioRelLaboral(),
							comprobante.getComplemento().getNomina().getPercepciones().getTotalGravado(),
							comprobante.getComplemento().getNomina().getTotalPercepciones(),
							comprobante.getComplemento().getNomina().getTotalPercepciones(),
							comprobante.getComplemento().getNomina().getTotalDeducciones(),
							comprobante.getFolio(),
							comprobante.getComplemento().getNomina().getDeducciones().getTotalImpuestosRetenidos(),
							0,
							7
							);
					
					//System.out.println("Estas preciosa y también en el método guardar");
				} catch (Exception e) {
					System.out.println("Existe algún error en la obtención de los datos para su almacenamiento.");
				}
			}
			conexion.cerrarConexion();
		}
}

