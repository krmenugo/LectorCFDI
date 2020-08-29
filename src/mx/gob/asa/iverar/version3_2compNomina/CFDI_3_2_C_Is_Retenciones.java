package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Is_Retenciones {
	public final static String ETIQUETA_RETENCIONES = "Retenciones";
	
	private CFDI_3_2_C_Is_Rs_Retencion retencion;

	@Override
	public String toString() {
		return "CFDI_3_2_C_Is_Retenciones [retencion=" + retencion + "]";
	}

	public CFDI_3_2_C_Is_Rs_Retencion getRetencion() {
		return retencion;
	}

	public void setRetencion(CFDI_3_2_C_Is_Rs_Retencion retencion) {
		this.retencion = retencion;
	}

	public static String getEtiquetaRetenciones() {
		return ETIQUETA_RETENCIONES;
	}

}
