package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Is_Traslados {
	public final static String ETIQUETA_TRASLADOS = "Traslados";
	
	private CFDI_3_2_C_Is_Ts_Traslado traslado;
	


	@Override
	public String toString() {
		return "CFDI_3_2_C_Is_Traslados [traslado=" + traslado + "]";
	}
	public CFDI_3_2_C_Is_Ts_Traslado getTraslado() {
		return traslado;
	}
	public void setTraslado(CFDI_3_2_C_Is_Ts_Traslado traslado) {
		this.traslado = traslado;
	}
	public static String getEtiquetaTraslados() {
		return ETIQUETA_TRASLADOS;
	}
	
	
}
