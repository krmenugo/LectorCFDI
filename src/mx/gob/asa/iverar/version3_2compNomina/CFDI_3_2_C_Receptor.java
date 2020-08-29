package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Receptor {
	public final static String ETIQUETA_RECEPTOR = "Receptor";
	public final static String ETIQUETA_RECEPTOR_RFC = "rfc";
	public final static String ETIQUETA_RECEPTOR_NOMBRE = "nombre";
	
	private String rfc;
	private String nombre;
	
	private CFDI_3_2_C_R_Domicilio domicilio;

	
	@Override
	public String toString() {
		return "CFDI_3_2_C_Receptor [rfc=" + rfc + ", nombre=" + nombre + ", domicilio=" + domicilio + "]";
	}

	//----------------------------------------------------------------------
	public String getRfc() {
		return rfc;
	}

	public String setRfc(String rfc) {
		return this.rfc = rfc;
	}
	//----------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	//----------------------------------------------------------------------
	public CFDI_3_2_C_R_Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(CFDI_3_2_C_R_Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public static String getEtiquetaReceptor() {
		return ETIQUETA_RECEPTOR;
	}

	public static String getEtiquetaReceptorRfc() {
		return ETIQUETA_RECEPTOR_RFC;
	}

	public static String getEtiquetaReceptorNombre() {
		return ETIQUETA_RECEPTOR_NOMBRE;
	}

}
