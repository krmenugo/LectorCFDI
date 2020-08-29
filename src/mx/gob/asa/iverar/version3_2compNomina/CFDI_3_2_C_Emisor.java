package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Emisor {
	public final static String ETIQUETA_EMISOR = "Emisor";
	public final static String ETIQUETA_EMISOR_RFC = "rfc";
	public final static String ETIQUETA_EMISOR_NOMBRE = "nombre";

	private String rfc;
	private String nombre;

	private CFDI_3_2_C_E_DomicilioFiscal DomicilioFiscal;
	private CFDI_3_2_C_E_ExpedidoEn ExpedidoEn;
	private CFDI_3_2_C_E_RegimenFiscal RegimenFiscal;
	
	

	@Override
	public String toString() {
		return "CFDI_3_2_C_Emisor [rfc=" + rfc + ", nombre=" + nombre + ", DomicilioFiscal=" + DomicilioFiscal
				+ ", ExpedidoEn=" + ExpedidoEn + ", RegimenFiscal=" + RegimenFiscal + "]";
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CFDI_3_2_C_E_DomicilioFiscal getDomicilioFiscal() {
		return DomicilioFiscal;
	}

	public void setDomicilioFiscal(CFDI_3_2_C_E_DomicilioFiscal domicilioFiscal) {
		DomicilioFiscal = domicilioFiscal;
	}

	public CFDI_3_2_C_E_ExpedidoEn getExpedidoEn() {
		return ExpedidoEn;
	}

	public void setExpedidoEn(CFDI_3_2_C_E_ExpedidoEn expedidoEn) {
		ExpedidoEn = expedidoEn;
	}

	public CFDI_3_2_C_E_RegimenFiscal getRegimenFiscal() {
		return RegimenFiscal;
	}

	public void setRegimenFiscal(CFDI_3_2_C_E_RegimenFiscal regimenFiscal) {
		RegimenFiscal = regimenFiscal;
	}

	public static String getEtiquetaEmisor() {
		return ETIQUETA_EMISOR;
	}

	public static String getEtiquetaComprobanteRfc() {
		return ETIQUETA_EMISOR_RFC;
	}

	public static String getEtiquetaComprobanteNombre() {
		return ETIQUETA_EMISOR_NOMBRE;
	}

	
}
