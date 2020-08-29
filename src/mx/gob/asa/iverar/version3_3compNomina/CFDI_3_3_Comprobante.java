package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_Comprobante {
	public final static String ETIQUETA_COMPROBANTE = "Comprobante";
	public final static String ETIQUETA_COMPROBANTE_VERSION = "Version";
	public final static String ETIQUETA_COMPROBANTE_TOTAL = "Total";
	public final static String ETIQUETA_COMPROBANTE_TIPODECOMPROBANTE = "TipoDeComprobante";
	public final static String ETIQUETA_COMPROBANTE_TIPOCAMBIO = "TipoCambio";
	public final static String ETIQUETA_COMPROBANTE_SUBTOTAL= "SubTotal";
	public final static String ETIQUETA_COMPROBANTE_SERIE = "Serie";
	public final static String ETIQUETA_COMPROBANTE_SELLO = "Sello";
	public final static String ETIQUETA_COMPROBANTE_NOCERTIFICADO = "NoCertificado";
	public final static String ETIQUETA_COMPROBANTE_MONEDA = "Moneda";
	public final static String ETIQUETA_COMPROBANTE_METODOPAGO = "MetodoPago";
	public final static String ETIQUETA_COMPROBANTE_LUGAREXPEDICION = "LugarExpedicion";
	public final static String ETIQUETA_COMPROBANTE_FORMAPAGO = "FormaPago";
	public final static String ETIQUETA_COMPROBANTE_FOLIO = "Folio";
	public final static String ETIQUETA_COMPROBANTE_FECHA = "Fecha";
	public final static String ETIQUETA_COMPROBANTE_DESCUENTO = "Descuento";
	public final static String ETIQUETA_COMPROBANTE_CERTIFICADO = "Certificado";
	
	private String version;
	private String total;
	private String tipoDeComprobante;
	private String tipoCambio;
	private String subTotal;
	private String serie;
	private String sello;
	private String noCertificado;
	private String moneda;
	private String metodoPago;
	private String lugarExpedicion;
	private String formaPago;
	private String folio;
	private String fecha;
	private String descuento;
	private String certificado;
	
	private CFDI_3_3_C_Emisor Emisor;
	private CFDI_3_3_C_Conceptos Conceptos;
	private CFDI_3_3_C_Receptor Receptor;
	private CFDI_3_3_C_Complemento Complemento;
	@Override
	public String toString() {
		return "CFDI_3_3_Comprobante [version=" + version + ", total=" + total + ", tipoDeComprobante="
				+ tipoDeComprobante + ", tipoCambio=" + tipoCambio + ", subTotal=" + subTotal + ", serie=" + serie
				+ ", sello=" + sello + ", noCertificado=" + noCertificado + ", moneda=" + moneda + ", metodoPago="
				+ metodoPago + ", lugarExpedicion=" + lugarExpedicion + ", formaPago=" + formaPago + ", folio=" + folio
				+ ", fecha=" + fecha + ", descuento=" + descuento + ", certificado=" + certificado + ", Emisor="
				+ Emisor + ", Conceptos=" + Conceptos + ", Receptor=" + Receptor + ", Complemento=" + Complemento + "]";
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	//----------------------------------------------------------------------
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	//----------------------------------------------------------------------
	public String getTipoDeComprobante() {
		return tipoDeComprobante;
	}
	public void setTipoDeComprobante(String tipoDeComprobante) {
		this.tipoDeComprobante = tipoDeComprobante;
	}
	//----------------------------------------------------------------------
	public String getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	//----------------------------------------------------------------------
	public String getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	//----------------------------------------------------------------------
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	//----------------------------------------------------------------------
	public String getSello() {
		return sello;
	}
	public void setSello(String sello) {
		this.sello = sello;
	}
	//----------------------------------------------------------------------
	public String getNoCertificado() {
		return noCertificado;
	}
	public void setNoCertificado(String noCertificado) {
		this.noCertificado = noCertificado;
	}
	//----------------------------------------------------------------------
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	//----------------------------------------------------------------------
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	//----------------------------------------------------------------------
	public String getLugarExpedicion() {
		return lugarExpedicion;
	}
	public void setLugarExpedicion(String lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}
	//----------------------------------------------------------------------
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	//----------------------------------------------------------------------
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	//----------------------------------------------------------------------
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	//----------------------------------------------------------------------
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	//----------------------------------------------------------------------
	public String getCertificado() {
		return certificado;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	//----------------------------------------------------------------------
	public CFDI_3_3_C_Emisor getEmisor() {
		return Emisor;
	}
	public void setEmisor(CFDI_3_3_C_Emisor emisor) {
		Emisor = emisor;
	}
	public CFDI_3_3_C_Conceptos getConceptos() {
		return Conceptos;
	}
	public void setConceptos(CFDI_3_3_C_Conceptos conceptos) {
		Conceptos = conceptos;
	}
	public CFDI_3_3_C_Receptor getReceptor() {
		return Receptor;
	}
	public void setReceptor(CFDI_3_3_C_Receptor receptor) {
		Receptor = receptor;
	}
	public CFDI_3_3_C_Complemento getComplemento() {
		return Complemento;
	}
	public void setComplemento(CFDI_3_3_C_Complemento complemento) {
		Complemento = complemento;
	}
	public static String getEtiquetaComprobante() {
		return ETIQUETA_COMPROBANTE;
	}
	public static String getEtiquetaComprobanteVersion() {
		return ETIQUETA_COMPROBANTE_VERSION;
	}
	public static String getEtiquetaComprobanteTotal() {
		return ETIQUETA_COMPROBANTE_TOTAL;
	}
	public static String getEtiquetaComprobanteTipodecomprobante() {
		return ETIQUETA_COMPROBANTE_TIPODECOMPROBANTE;
	}
	public static String getEtiquetaComprobanteTipocambio() {
		return ETIQUETA_COMPROBANTE_TIPOCAMBIO;
	}
	public static String getEtiquetaComprobanteSubtotal() {
		return ETIQUETA_COMPROBANTE_SUBTOTAL;
	}
	public static String getEtiquetaComprobanteSerie() {
		return ETIQUETA_COMPROBANTE_SERIE;
	}
	public static String getEtiquetaComprobanteSello() {
		return ETIQUETA_COMPROBANTE_SELLO;
	}
	public static String getEtiquetaComprobanteNocertificado() {
		return ETIQUETA_COMPROBANTE_NOCERTIFICADO;
	}
	public static String getEtiquetaComprobanteMoneda() {
		return ETIQUETA_COMPROBANTE_MONEDA;
	}
	public static String getEtiquetaComprobanteMetodopago() {
		return ETIQUETA_COMPROBANTE_METODOPAGO;
	}
	public static String getEtiquetaComprobanteLugarexpedicion() {
		return ETIQUETA_COMPROBANTE_LUGAREXPEDICION;
	}
	public static String getEtiquetaComprobanteFormapago() {
		return ETIQUETA_COMPROBANTE_FORMAPAGO;
	}
	public static String getEtiquetaComprobanteFolio() {
		return ETIQUETA_COMPROBANTE_FOLIO;
	}
	public static String getEtiquetaComprobanteFecha() {
		return ETIQUETA_COMPROBANTE_FECHA;
	}
	public static String getEtiquetaComprobanteDescuento() {
		return ETIQUETA_COMPROBANTE_DESCUENTO;
	}
	public static String getEtiquetaComprobanteCertificado() {
		return ETIQUETA_COMPROBANTE_CERTIFICADO;
	}
	
}
