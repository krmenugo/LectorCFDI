package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_E_DomicilioFiscal {
	public final static String ETIQUETA_DOMICILIO = "DomicilioFiscal";
	public final static String ETIQUETA_DOMICILIO_PAIS = "pais";
	public final static String ETIQUETA_DOMICILIO_NOEXTERIOR = "noExterior";
	public final static String ETIQUETA_DOMICILIO_MUNICIPIO = "municipio";
	public final static String ETIQUETA_DOMICILIO_ESTADO = "estado";
	public final static String ETIQUETA_DOMICILIO_COLONIA = "colonia";
	public final static String ETIQUETA_DOMICILIO_CODIGOPOSTAL = "codigoPostal";
	public final static String ETIQUETA_DOMICILIO_CALLE = "calle";
	
	private String pais;
	private String noExterior;
	private String municipio;
	private String estado;
	private String colonia;
	private String codigoPostal;
	private String calle;
	

	@Override
	public String toString() {
		return "CFDI_3_2_C_E_DomicilioFiscal [pais=" + pais + ", noExterior=" + noExterior + ", municipio=" + municipio
				+ ", estado=" + estado + ", colonia=" + colonia + ", codigoPostal=" + codigoPostal + ", calle=" + calle
				+ "]";
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNoExterior() {
		return noExterior;
	}

	public void setNoExterior(String noExterior) {
		this.noExterior = noExterior;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public static String getEtiquetaDomicilio() {
		return ETIQUETA_DOMICILIO;
	}

	public static String getEtiquetaDomicilioPais() {
		return ETIQUETA_DOMICILIO_PAIS;
	}

	public static String getEtiquetaDomicilioNoexterior() {
		return ETIQUETA_DOMICILIO_NOEXTERIOR;
	}

	public static String getEtiquetaDomicilioMunicipio() {
		return ETIQUETA_DOMICILIO_MUNICIPIO;
	}

	public static String getEtiquetaDomicilioEstado() {
		return ETIQUETA_DOMICILIO_ESTADO;
	}

	public static String getEtiquetaDomicilioColonia() {
		return ETIQUETA_DOMICILIO_COLONIA;
	}

	public static String getEtiquetaDomicilioCodigopostal() {
		return ETIQUETA_DOMICILIO_CODIGOPOSTAL;
	}

	public static String getEtiquetaDomicilioCalle() {
		return ETIQUETA_DOMICILIO_CALLE;
	}
	
	
}
