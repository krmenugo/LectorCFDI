package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_Cs_Concepto {
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO = "Concepto";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_DESCUENTO = "Descuento";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_VALORUNITARIO = "ValorUnitario";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_IMPORTE = "Importe";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_DESCRIPCION = "Descripcion";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_CLAVEUNIDAD = "ClaveUnidad";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_CLAVEPRODSERV = "ClaveProdServ";
	public final static String ETIQUETA_CONCEPTOS_CONCEPTO_CANTIDAD= "Cantidad";
	
	private String descuento;
	private String valorUnitario;
	private String importe;
	private String descripcion;
	private String claveUnidad;
	private String claveProdServ;
	private String cantidad;
	
	@Override
	public String toString() {
		return "CFDI_3_3_C_Cs_Concepto [descuento=" + descuento + ", valorUnitario=" + valorUnitario + ", importe="
				+ importe + ", descripcion=" + descripcion + ", claveUnidad=" + claveUnidad + ", claveProdServ="
				+ claveProdServ + ", cantidad=" + cantidad + "]";
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
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

	public String getClaveUnidad() {
		return claveUnidad;
	}

	public void setClaveUnidad(String claveUnidad) {
		this.claveUnidad = claveUnidad;
	}

	public String getClaveProdServ() {
		return claveProdServ;
	}

	public void setClaveProdServ(String claveProdServ) {
		this.claveProdServ = claveProdServ;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public static String getEtiquetaConceptosConcepto() {
		return ETIQUETA_CONCEPTOS_CONCEPTO;
	}

	public static String getEtiquetaConceptosConceptoDescuento() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_DESCUENTO;
	}

	public static String getEtiquetaConceptosConceptoValorunitario() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_VALORUNITARIO;
	}

	public static String getEtiquetaConceptosConceptoImporte() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_IMPORTE;
	}

	public static String getEtiquetaConceptosConceptoDescripcion() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_DESCRIPCION;
	}

	public static String getEtiquetaConceptosConceptoClaveunidad() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_CLAVEUNIDAD;
	}

	public static String getEtiquetaConceptosConceptoClaveprodserv() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_CLAVEPRODSERV;
	}

	public static String getEtiquetaConceptosConceptoCantidad() {
		return ETIQUETA_CONCEPTOS_CONCEPTO_CANTIDAD;
	}
	
}
