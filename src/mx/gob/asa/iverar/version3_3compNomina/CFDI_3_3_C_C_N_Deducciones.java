package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_C_N_Deducciones {
	public final static String ETIQUETA_DEDUCCIONES = "Deducciones";
	public final static String ETIQUETA_DEDUCCIONES_TOTALOTRASDEDUCCIONES = "TotalOtrasDeducciones";
	public final static String ETIQUETA_DEDUCCIONES_TOTALIMPUESTOSRETENIDOS = "TotalImpuestosRetenidos";
	
	private String totalOtrasDeducciones;
	private String totalImpuestosRetenidos;
	
	@Override
	public String toString() {
		return "Deducciones [totalOtrasDeducciones=" + totalOtrasDeducciones + ", totalImpuestosRetenidos="
				+ totalImpuestosRetenidos + "]";
	}

	public String getTotalOtrasDeducciones() {
		return totalOtrasDeducciones;
	}

	public void setTotalOtrasDeducciones(String totalOtrasDeducciones) {
		this.totalOtrasDeducciones = totalOtrasDeducciones;
	}

	public String getTotalImpuestosRetenidos() {
		return totalImpuestosRetenidos;
	}

	public void setTotalImpuestosRetenidos(String totalImpuestosRetenidos) {
		this.totalImpuestosRetenidos = totalImpuestosRetenidos;
	}

	public static String getEtiquetaDeduccionesDeducciones() {
		return ETIQUETA_DEDUCCIONES;
	}

	public static String getEtiquetaDeduccionesTotalotrasdeducciones() {
		return ETIQUETA_DEDUCCIONES_TOTALOTRASDEDUCCIONES;
	}

	public static String getEtiquetaDeduccionesTotalimpuestosretenidos() {
		return ETIQUETA_DEDUCCIONES_TOTALIMPUESTOSRETENIDOS;
	}
	
    //Lista_Deduccion
        //Importe
        //Concepto
        //Clave
        //TipoDeduccion
	
}
