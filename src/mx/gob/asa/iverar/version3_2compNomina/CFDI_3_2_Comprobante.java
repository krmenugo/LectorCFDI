package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_Comprobante {
	public final static String ETIQUETA_COMPROBANTE = "Comprobante";
	public final static String ETIQUETA_COMPROBANTE_VERSION = "version";
	public final static String ETIQUETA_COMPROBANTE_TOTAL = "total";
	public final static String ETIQUETA_COMPROBANTE_TIPODECOMPROBANTE = "tipoDeComprobante";
	public final static String ETIQUETA_COMPROBANTE_SUBTOTAL = "subTotal";
	public final static String ETIQUETA_COMPROBANTE_SERIE = "serie";
	public final static String ETIQUETA_COMPROBANTE_SELLO = "sello";
	public final static String ETIQUETA_COMPROBANTE_NOCERTIFICADO = "noCertificado";
	public final static String ETIQUETA_COMPROBANTE_MOTIVODESCUENTO = "motivoDescuento";
	public final static String ETIQUETA_COMPROBANTE_METODODEPAGO = "metodoDePago";
	public final static String ETIQUETA_COMPROBANTE_FORMADEPAGO = "formaDePago";
	public final static String ETIQUETA_COMPROBANTE_FOLIO = "folio";
	public final static String ETIQUETA_COMPROBANTE_FECHA = "fecha";
	public final static String ETIQUETA_COMPROBANTE_DESCUENTO = "descuento";
	public final static String ETIQUETA_COMPROBANTE_CERTIFICADO = "certificado";
	public final static String ETIQUETA_COMPROBANTE_TIPOCAMBIO = "TipoCambio";
	public final static String ETIQUETA_COMPROBANTE_NUMCTAPAGO = "NumCtaPago";
	public final static String ETIQUETA_COMPROBANTE_MONEDA = "Moneda";
	public final static String ETIQUETA_COMPROBANTE_LUGAREXPEDICION = "LugarExpedicion";

	private String version;
	private String total;
	private String tipoDeComprobante;
	private String subTotal;
	private String serie;
	private String sello;
	private String noCertificado;
	private String motivoDescuento;
	private String metodoDePago;
	private String formaDePago;
	private String folio;
	private String fecha;
	private String descuento;
	private String certificado;
	private String tipoCambio;
	private String numCtaPago;
	private String moneda;
	private String lugarExpedicion;

	private CFDI_3_2_C_Emisor emisor;
	private CFDI_3_2_C_Receptor receptor;
	private CFDI_3_2_C_Conceptos conceptos;
	private CFDI_3_2_C_Impuestos impuestos;
	private CFDI_3_2_C_Complemento complemento;
	private CFDI_3_2_C_Addenda addenda;

	@Override
	public String toString() {
		return "CFDI_3_2_Comprobante [version=" + version + ", total=" + total + ", tipoDeComprobante="
				+ tipoDeComprobante + ", subTotal=" + subTotal + ", serie=" + serie + ", sello=" + sello
				+ ", noCertificado=" + noCertificado + ", motivoDescuento=" + motivoDescuento + ", metodoDePago="
				+ metodoDePago + ", formaDePago=" + formaDePago + ", folio=" + folio + ", fecha=" + fecha
				+ ", descuento=" + descuento + ", certificado=" + certificado + ", tipoCambio=" + tipoCambio
				+ ", numCtaPago=" + numCtaPago + ", moneda=" + moneda + ", lugarExpedicion=" + lugarExpedicion
				+ ", emisor=" + emisor + ", receptor=" + receptor + ", conceptos=" + conceptos + ", impuestos="
				+ impuestos + ", complemento=" + complemento + ", addenda=" + addenda + "]";
	}

	// ----------------------------------------------------------------------
	public String getVersion() {
		return version;
	}

	public String setVersion(String version) {
		return this.version = version;
	}

	// ----------------------------------------------------------------------
	public String getTotal() {
		return total;
	}

	public String setTotal(String total) {
		return this.total = total;
	}

	// ----------------------------------------------------------------------
	public String getTipoDeComprobante() {
		return tipoDeComprobante;
	}

	public String setTipoDeComprobante(String tipoDeComprobante) {
		return this.tipoDeComprobante = tipoDeComprobante;
	}

	// ----------------------------------------------------------------------
	public String getSubTotal() {
		return subTotal;
	}

	public String setSubTotal(String subTotal) {
		return this.subTotal = subTotal;
	}

	// ----------------------------------------------------------------------
	public String getSerie() {
		return serie;
	}

	public String setSerie(String serie) {
		return this.serie = serie;
	}

	// ----------------------------------------------------------------------
	public String getSello() {
		return sello;
	}

	public String setSello(String sello) {
		return this.sello = sello;
	}

	// ----------------------------------------------------------------------
	public String getNoCertificado() {
		return noCertificado;
	}

	public String setNoCertificado(String noCertificado) {
		return this.noCertificado = noCertificado;
	}

	// ----------------------------------------------------------------------
	public String getMotivoDescuento() {
		return motivoDescuento;
	}

	public String setMotivoDescuento(String motivoDescuento) {
		return this.motivoDescuento = motivoDescuento;
	}

	// ----------------------------------------------------------------------
	public String getMetodoDePago() {
		return metodoDePago;
	}

	public String setMetodoDePago(String metodoDePago) {
		return this.metodoDePago = metodoDePago;
	}

	// ----------------------------------------------------------------------
	public String getFormaDePago() {
		return formaDePago;
	}

	public String setFormaDePago(String formaDePago) {
		return this.formaDePago = formaDePago;
	}

	// ----------------------------------------------------------------------
	public String getFolio() {
		return folio;
	}

	public String setFolio(String folio) {
		return this.folio = folio;
	}

	// ----------------------------------------------------------------------
	public String getFecha() {
		return fecha;
	}

	public String setFecha(String fecha) {
		return this.fecha = fecha;
	}

	// ----------------------------------------------------------------------
	public String getDescuento() {
		return descuento;
	}

	public String setDescuento(String descuento) {
		return this.descuento = descuento;
	}

	// ----------------------------------------------------------------------
	public String getCertificado() {
		return certificado;
	}

	public String setCertificado(String certificado) {
		return this.certificado = certificado;
	}

	// ----------------------------------------------------------------------
	public String getTipoCambio() {
		return tipoCambio;
	}

	public String setTipoCambio(String tipoCambio) {
		return this.tipoCambio = tipoCambio;
	}

	// ----------------------------------------------------------------------
	public String getNumCtaPago() {
		return numCtaPago;
	}

	public String setNumCtaPago(String numCtaPago) {
		return this.numCtaPago = numCtaPago;
	}

	// ----------------------------------------------------------------------
	public String getMoneda() {
		return moneda;
	}

	public String setMoneda(String moneda) {
		return this.moneda = moneda;
	}

	// ----------------------------------------------------------------------
	public String getLugarExpedicion() {
		return lugarExpedicion;
	}

	public String setLugarExpedicion(String lugarExpedicion) {
		return this.lugarExpedicion = lugarExpedicion;
	}

	// ----------------------------------------------------------------------
	public CFDI_3_2_C_Emisor getEmisor() {
		return emisor;
	}

	public void setEmisor(CFDI_3_2_C_Emisor emisor) {
		this.emisor = emisor;
	}

	public CFDI_3_2_C_Receptor getReceptor() {
		return receptor;
	}

	public void setReceptor(CFDI_3_2_C_Receptor receptor) {
		this.receptor = receptor;
	}

	public CFDI_3_2_C_Conceptos getConceptos() {
		return conceptos;
	}

	public void setConceptos(CFDI_3_2_C_Conceptos conceptos) {
		this.conceptos = conceptos;
	}

	public CFDI_3_2_C_Impuestos getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(CFDI_3_2_C_Impuestos impuestos) {
		this.impuestos = impuestos;
	}

	public CFDI_3_2_C_Complemento getComplemento() {
		return complemento;
	}

	public void setComplemento(CFDI_3_2_C_Complemento complemento) {
		this.complemento = complemento;
	}

	public CFDI_3_2_C_Addenda getAddenda() {
		return addenda;
	}

	public void setAddenda(CFDI_3_2_C_Addenda addenda) {
		this.addenda = addenda;
	}

}
