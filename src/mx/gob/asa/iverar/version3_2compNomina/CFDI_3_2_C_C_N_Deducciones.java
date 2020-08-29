package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_C_N_Deducciones {
	public final static String ETIQUETA_DEDUCCIONES = "Deducciones";
	public final static String ETIQUETA_DEDUCCIONES_TOTALGRAVADO = "TotalGravado";
	public final static String ETIQUETA_DEDUCCIONES_TOTALEXENTO = "TotalExento";
	public final static String ETIQUETA_DEDUCCIONES_TOTALIMPUESTOSRETENIDOS = "TotalImpuestosRetenidos";
	
	private String totalGravado;
	private String totalExento;
	private String totalImpuestosRetenidos;
	//lista deducciones
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_C_N_Deducciones [totalGravado=" + totalGravado + ", totalExento=" + totalExento
				+ ", totalImpuestosRetenidos=" + totalImpuestosRetenidos + "]";
	}
	
	public String getTotalGravado() {
		return totalGravado;
	}
	public void setTotalGravado(String totalGravado) {
		this.totalGravado = totalGravado;
	}
	public String getTotalExento() {
		return totalExento;
	}
	public void setTotalExento(String totalExento) {
		this.totalExento = totalExento;
	}
	public String getTotalImpuestosRetenidos() {
		return totalImpuestosRetenidos;
	}
	public void setTotalImpuestosRetenidos(String totalImpuestosRetenidos) {
		this.totalImpuestosRetenidos = totalImpuestosRetenidos;
	}
	public static String getEtiquetaDeducciones() {
		return ETIQUETA_DEDUCCIONES;
	}
	public static String getEtiquetaDeduccionesTotalgravado() {
		return ETIQUETA_DEDUCCIONES_TOTALGRAVADO;
	}
	public static String getEtiquetaDeduccionesTotalexento() {
		return ETIQUETA_DEDUCCIONES_TOTALEXENTO;
	}
	public static String getEtiquetaDeduccionesTotalimpuestosretenidos() {
		return ETIQUETA_DEDUCCIONES_TOTALIMPUESTOSRETENIDOS;
	}
	
}
