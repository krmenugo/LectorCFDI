package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_Emisor {
	public final static String ETIQUETA_EMISOR = "Emisor";
	public final static String ETIQUETA_EMISOR_RFC = "Rfc";
	public final static String ETIQUETA_EMISOR_REGIMENFISCAL = "RegimenFiscal";
	public final static String ETIQUETA_EMISOR_NOMBRE = "Nombre";
	
	private String rfc;
	private String regimenFiscal;
	private String nombre;
	
	@Override
	public String toString() {
		return "CFDI_3_3_C_Emisor [rfc=" + rfc + ", regimenFiscal=" + regimenFiscal + ", nombre=" + nombre + "]";
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getRegimenFiscal() {
		return regimenFiscal;
	}

	public void setRegimenFiscal(String regimenFiscal) {
		this.regimenFiscal = regimenFiscal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String getEtiquetaEmisorEmisor() {
		return ETIQUETA_EMISOR;
	}

	public static String getEtiquetaEmisorRfc() {
		return ETIQUETA_EMISOR_RFC;
	}

	public static String getEtiquetaEmisorRegimenfiscal() {
		return ETIQUETA_EMISOR_REGIMENFISCAL;
	}

	public static String getEtiquetaEmisorNombre() {
		return ETIQUETA_EMISOR_NOMBRE;
	}
	
}
