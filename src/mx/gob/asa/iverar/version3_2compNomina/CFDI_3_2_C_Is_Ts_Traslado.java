package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Is_Ts_Traslado {
	public final static String ETIQUETA_TRASLADO = "Traslado";
	public final static String ETIQUETA_TRASLADO_IMPORTE = "importe";
	public final static String ETIQUETA_TRASLADO_IMPUESTO = "impuesto";
	public final static String ETIQUETA_TRASLADO_TASA = "tasa";
	
	private String importe;
	private String impuesto;
	private String tasa;
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_Is_Ts_Traslado [importe=" + importe + ", impuesto=" + impuesto + ", tasa=" + tasa + "]";
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
	public String getTasa() {
		return tasa;
	}
	public void setTasa(String tasa) {
		this.tasa = tasa;
	}
	public static String getEtiquetaTraslado() {
		return ETIQUETA_TRASLADO;
	}
	public static String getEtiquetaTrasladoImporte() {
		return ETIQUETA_TRASLADO_IMPORTE;
	}
	public static String getEtiquetaTrasladoImpuesto() {
		return ETIQUETA_TRASLADO_IMPUESTO;
	}
	public static String getEtiquetaTrasladoTasa() {
		return ETIQUETA_TRASLADO_TASA;
	}

}
