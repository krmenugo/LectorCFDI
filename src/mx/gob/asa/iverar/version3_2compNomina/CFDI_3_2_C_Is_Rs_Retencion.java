package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Is_Rs_Retencion {
	public final static String ETIQUETA_RETENCION= "Retencion";
	public final static String ETIQUETA_RETENCION_IMPORTE = "importe";
	public final static String ETIQUETA_RETENCION_IMPUESTO = "impuesto";
	
	private String importe;
	private String impuesto;
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_Is_Rs_Retencion [importe=" + importe + ", impuesto=" + impuesto + "]";
	}
	
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}
	public static String getEtiquetaRetencion() {
		return ETIQUETA_RETENCION;
	}
	public static String getEtiquetaRetencionImporte() {
		return ETIQUETA_RETENCION_IMPORTE;
	}
	public static String getEtiquetaRetencionImpuesto() {
		return ETIQUETA_RETENCION_IMPUESTO;
	}
	
	

}
