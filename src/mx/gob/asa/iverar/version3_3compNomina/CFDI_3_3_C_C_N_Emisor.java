package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_C_N_Emisor {
	public final static String ETIQUETA_NOMINA_EMISOR = "Emisor";
	public final static String ETIQUETA_NOMINA_EMISOR_RFCPATRONORIGEN = "RfcPatronOrigen";
	public final static String ETIQUETA_NOMINA_EMISOR_REGISTROPATRONAL = "RegistroPatronal";
	
	private String rfcPatronOrigen;
	private String registroPatronal;
	
	@Override
	public String toString() {
		return "Emisor_Nomina [rfcPatronOrigen=" + rfcPatronOrigen + ", registroPatronal=" + registroPatronal + "]";
	}
	
	public String getRfcPatronOrigen() {
		return rfcPatronOrigen;
	}
	public void setRfcPatronOrigen(String rfcPatronOrigen) {
		this.rfcPatronOrigen = rfcPatronOrigen;
	}
	public String getRegistroPatronal() {
		return registroPatronal;
	}
	public void setRegistroPatronal(String registroPatronal) {
		this.registroPatronal = registroPatronal;
	}
	public static String getEtiquetaNominaEmisor() {
		return ETIQUETA_NOMINA_EMISOR;
	}
	public static String getEtiquetaNominaEmisorRfcpatronorigen() {
		return ETIQUETA_NOMINA_EMISOR_RFCPATRONORIGEN;
	}
	public static String getEtiquetaNominaEmisorRegistropatronal() {
		return ETIQUETA_NOMINA_EMISOR_REGISTROPATRONAL;
	}
	
}
