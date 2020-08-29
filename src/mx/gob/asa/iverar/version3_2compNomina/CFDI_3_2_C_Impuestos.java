package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Impuestos {
	public final static String ETIQUETA_IMPUESTOS_IMPUESTOS = "Impuestos";
	public final static String ETIQUETA_IMPUESTOS_TOTALIMPUESTOSTRASLADADOS = "totalImpuestosTrasladados";
	public final static String ETIQUETA_IMPUESTOS_TOTALIMPUESTOSRETENIDOS = "totalImpuestosRetenidos";

	private String totalImpuestosTrasladados;
	private String totalImpuestosRetenidos;

	private CFDI_3_2_C_Is_Retenciones retenciones;
	private CFDI_3_2_C_Is_Traslados traslados;

	@Override
	public String toString() {
		return "CFDI_3_2_C_Impuestos [totalImpuestosTrasladados=" + totalImpuestosTrasladados
				+ ", totalImpuestosRetenidos=" + totalImpuestosRetenidos + ", retenciones=" + retenciones
				+ ", traslados=" + traslados + "]";
	}

	// ----------------------------------------------------------------------
	public String getTotalImpuestosTrasladados() {
		return totalImpuestosTrasladados;
	}

	public String setTotalImpuestosTrasladados(String totalImpuestosTrasladados) {
		return this.totalImpuestosTrasladados = totalImpuestosTrasladados;
	}

	// ----------------------------------------------------------------------
	public String getTotalImpuestosRetenidos() {
		return totalImpuestosRetenidos;
	}

	public String setTotalImpuestosRetenidos(String totalImpuestosRetenidos) {
		return this.totalImpuestosRetenidos = totalImpuestosRetenidos;
	}

	// ----------------------------------------------------------------------
	public CFDI_3_2_C_Is_Retenciones getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(CFDI_3_2_C_Is_Retenciones retenciones) {
		this.retenciones = retenciones;
	}

	public CFDI_3_2_C_Is_Traslados getTraslados() {
		return traslados;
	}

	public void setTraslados(CFDI_3_2_C_Is_Traslados traslados) {
		this.traslados = traslados;
	}

	public static String getEtiquetaImpuestosImpuestos() {
		return ETIQUETA_IMPUESTOS_IMPUESTOS;
	}

	public static String getEtiquetaImpuestosTotalimpuestostrasladados() {
		return ETIQUETA_IMPUESTOS_TOTALIMPUESTOSTRASLADADOS;
	}

	public static String getEtiquetaImpuestosTotalimpuestosretenidos() {
		return ETIQUETA_IMPUESTOS_TOTALIMPUESTOSRETENIDOS;
	}

}
