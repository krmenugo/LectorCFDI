package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Cs_Concepto {
	public final static String ETIQUETA_CONCEPTO = "Concepto";
	public final static String ETIQUETA_CONCEPTO_VALORUNITARIO = "valorUnitario";
	public final static String ETIQUETA_CONCEPTO_UNIDAD = "unidad";
	public final static String ETIQUETA_CONCEPTO_NOIDENTIFICACION = "noIdentificacion";
	public final static String ETIQUETA_CONCEPTO_IMPORTE = "importe";
	public final static String ETIQUETA_CONCEPTO_DESCRIPCION = "descripcion";
	public final static String ETIQUETA_CONCEPTO_CANTIDAD = "cantidad";

	private String valorUnitario;
	private String unidad;
	private String noIdentificacion;
	private String importe;
	private String descripcion;
	private String cantidad;
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_Cs_Concepto [valorUnitario=" + valorUnitario + ", unidad=" + unidad + ", noIdentificacion="
				+ noIdentificacion + ", importe=" + importe + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ "]";
	}
	public String getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getNoIdentificacion() {
		return noIdentificacion;
	}
	public void setNoIdentificacion(String noIdentificacion) {
		this.noIdentificacion = noIdentificacion;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public static String getEtiquetaConcepto() {
		return ETIQUETA_CONCEPTO;
	}
	public static String getEtiquetaConceptoValorunitario() {
		return ETIQUETA_CONCEPTO_VALORUNITARIO;
	}
	public static String getEtiquetaConceptoUnidad() {
		return ETIQUETA_CONCEPTO_UNIDAD;
	}
	public static String getEtiquetaConceptoNoidentificacion() {
		return ETIQUETA_CONCEPTO_NOIDENTIFICACION;
	}
	public static String getEtiquetaConceptoImporte() {
		return ETIQUETA_CONCEPTO_IMPORTE;
	}
	public static String getEtiquetaConceptoDescripcion() {
		return ETIQUETA_CONCEPTO_DESCRIPCION;
	}
	public static String getEtiquetaConceptoCantidad() {
		return ETIQUETA_CONCEPTO_CANTIDAD;
	}

}
