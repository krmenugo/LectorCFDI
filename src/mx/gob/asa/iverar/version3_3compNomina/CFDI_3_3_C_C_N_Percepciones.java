package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_C_N_Percepciones {
	public final static String ETIQUETA_PERCEPCIONES = "Percepciones";
	public final static String ETIQUETA_PERCEPCIONES_TOTALSUELDOS = "TotalSueldos";
	public final static String ETIQUETA_PERCEPCIONES_TOTALGRAVADO = "TotalGravado";
	public final static String ETIQUETA_PERCEPCIONES_TOTALEXENTO = "TotalExento";
	
	private String totalSueldos;
	private String totalGravado;
	private String totalExento;
	
	@Override
	public String toString() {
		return "Percepciones [totalSueldos=" + totalSueldos + ", totalGravado=" + totalGravado + ", totalExento="
				+ totalExento + "]";
	}
	
	public String getTotalSueldos() {
		return totalSueldos;
	}
	public void setTotalSueldos(String totalSueldos) {
		this.totalSueldos = totalSueldos;
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
	public static String getEtiquetaPercepciones() {
		return ETIQUETA_PERCEPCIONES;
	}
	public static String getEtiquetaPercepcionesTotalsueldos() {
		return ETIQUETA_PERCEPCIONES_TOTALSUELDOS;
	}
	public static String getEtiquetaPercepcionesTotalgravado() {
		return ETIQUETA_PERCEPCIONES_TOTALGRAVADO;
	}
	public static String getEtiquetaPercepcionesTotalexento() {
		return ETIQUETA_PERCEPCIONES_TOTALEXENTO;
	}
	
    //Lista Percepcion
        //TipoPercepcion
        //ImporteGravado
        //ImporteExento
        //Concepto
        //Clave
	
}
