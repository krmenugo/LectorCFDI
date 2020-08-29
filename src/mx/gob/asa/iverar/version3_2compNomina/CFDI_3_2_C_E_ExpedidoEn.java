package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_E_ExpedidoEn {
	public final static String ETIQUETA_EXPEDIDOEN = "ExpedidoEn";
	public final static String ETIQUETA_EXPEDIDOEN_PAIS = "pais";
	public final static String ETIQUETA_EXPEDIDOEN_NOEXTERIOR = "noExterior";
	public final static String ETIQUETA_EXPEDIDOEN_MUNICIPIO = "municipio";
	public final static String ETIQUETA_EXPEDIDOEN_ESTADO = "estado";
	public final static String ETIQUETA_EXPEDIDOEN_COLONIA = "colonia";
	public final static String ETIQUETA_EXPEDIDOEN_CODIGOPOSTAL = "codigoPostal";
	public final static String ETIQUETA_EXPEDIDOEN_CALLE = "calle";

	private String pais;
	private String noExterior;
	private String municipio;
	private String estado;
	private String colonia;
	private String codigoPostal;
	private String calle;
	
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_E_ExpedidoEn [pais=" + pais + ", noExterior=" + noExterior + ", municipio=" + municipio
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
	public static String getEtiquetaExpedidoen() {
		return ETIQUETA_EXPEDIDOEN;
	}
	public static String getEtiquetaExpedidoenPais() {
		return ETIQUETA_EXPEDIDOEN_PAIS;
	}
	public static String getEtiquetaExpedidoenNoexterior() {
		return ETIQUETA_EXPEDIDOEN_NOEXTERIOR;
	}
	public static String getEtiquetaExpedidoenMunicipio() {
		return ETIQUETA_EXPEDIDOEN_MUNICIPIO;
	}
	public static String getEtiquetaExpedidoenEstado() {
		return ETIQUETA_EXPEDIDOEN_ESTADO;
	}
	public static String getEtiquetaExpedidoenColonia() {
		return ETIQUETA_EXPEDIDOEN_COLONIA;
	}
	public static String getEtiquetaExpedidoenCodigopostal() {
		return ETIQUETA_EXPEDIDOEN_CODIGOPOSTAL;
	}
	public static String getEtiquetaExpedidoenCalle() {
		return ETIQUETA_EXPEDIDOEN_CALLE;
	}
	
}
