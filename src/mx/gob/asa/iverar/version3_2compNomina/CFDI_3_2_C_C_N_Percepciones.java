package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_C_N_Percepciones {
	public final static String ETIQUETA_PERCEPCIONES = "Percepciones";
	public final static String ETIQUETA_PERCEPCIONES_TOTALGRAVADO = "TotalGravado";
	public final static String ETIQUETA_PERCEPCIONES_TOTALEXENTO = "TotalExento";
	
	private String totalGravado;
	private String totalExento;
	//lista de percepciones
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_C_N_Percepciones [totalGravado=" + totalGravado + ", totalExento=" + totalExento + "]";
	}
	
	public String getTotalGravado() {
		return totalGravado;
	}
	public String setTotalGravado(String totalGravado) {
		return this.totalGravado = totalGravado;
	}
	public String getTotalExento() {
		return totalExento;
	}
	public String setTotalExento(String totalExento) {
		return this.totalExento = totalExento;
	}
	public static String getEtiquetaPercepciones() {
		return ETIQUETA_PERCEPCIONES;
	}
	public static String getEtiquetaPercepcionesTotalgravado() {
		return ETIQUETA_PERCEPCIONES_TOTALGRAVADO;
	}
	public static String getEtiquetaPercepcionesTotalexento() {
		return ETIQUETA_PERCEPCIONES_TOTALEXENTO;
	}

}
