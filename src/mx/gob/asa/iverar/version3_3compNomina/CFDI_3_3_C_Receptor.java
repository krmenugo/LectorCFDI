package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_Receptor {

	public final static String ETIQUETA_RECEPTOR = "Receptor";
	public final static String ETIQUETA_RECEPTOR_RFC = "Rfc";
	public final static String ETIQUETA_RECEPTOR_NOMBRE = "Nombre";
	public final static String ETIQUETA_RECEPTOR_USOCFDI = "UsoCFDI";
	
	private String rfc;
	private String nombre;
	private String usocfdi;
	
	@Override
	public String toString() {
		return "CFDI_3_3_C_Receptor [rfc=" + rfc + ", nombre=" + nombre + ", usocfdi=" + usocfdi + "]";
	}
	
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsocfdi() {
		return usocfdi;
	}
	public void setUsocfdi(String usocfdi) {
		this.usocfdi = usocfdi;
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
	public static String getEtiquetaReceptorUsocfdi() {
		return ETIQUETA_RECEPTOR_USOCFDI;
	}
	
}
