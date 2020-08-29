package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_C_TimbreFiscalDigital {
	public final static String ETIQUETA_TIMBREFISCALDIGITAL = "TimbreFiscalDigital";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_VERSION = "Version";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_SELLOSAT = "SelloSAT";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_NOCERTIFICADOSAT = "NoCertificadoSAT";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_RFCPROVCERTIF = "RfcProvCertif";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_FECHATIMBRADO = "FechaTimbrado";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_UUID = "UUID";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_SELLOCFD = "SelloCFD";
	
	private String version;
	private String sellosat;
	private String noCertificadosat;
	private String rfcprovcertif;
	private String fechatimbrado;
	private String uuid;
	private String sellocfd;
	
	@Override
	public String toString() {
		return "CFDI_3_3_C_C_TimbreFiscalDigital [version=" + version + ", sellosat=" + sellosat + ", noCertificadosat="
				+ noCertificadosat + ", rfcprovcertif=" + rfcprovcertif + ", fechatimbrado=" + fechatimbrado + ", uuid="
				+ uuid + ", sellocfd=" + sellocfd + "]";
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSellosat() {
		return sellosat;
	}
	public void setSellosat(String sellosat) {
		this.sellosat = sellosat;
	}
	public String getNoCertificadosat() {
		return noCertificadosat;
	}
	public void setNoCertificadosat(String noCertificadosat) {
		this.noCertificadosat = noCertificadosat;
	}
	public String getRfcprovcertif() {
		return rfcprovcertif;
	}
	public void setRfcprovcertif(String rfcprovcertif) {
		this.rfcprovcertif = rfcprovcertif;
	}
	public String getFechatimbrado() {
		return fechatimbrado;
	}
	public void setFechatimbrado(String fechatimbrado) {
		this.fechatimbrado = fechatimbrado;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getSellocfd() {
		return sellocfd;
	}
	public void setSellocfd(String sellocfd) {
		this.sellocfd = sellocfd;
	}
	public static String getEtiquetaTimbrefiscaldigital() {
		return ETIQUETA_TIMBREFISCALDIGITAL;
	}
	public static String getEtiquetaTimbrefiscaldigitalVersion() {
		return ETIQUETA_TIMBREFISCALDIGITAL_VERSION;
	}
	public static String getEtiquetaTimbrefiscaldigitalSellosat() {
		return ETIQUETA_TIMBREFISCALDIGITAL_SELLOSAT;
	}
	public static String getEtiquetaTimbrefiscaldigitalNocertificadosat() {
		return ETIQUETA_TIMBREFISCALDIGITAL_NOCERTIFICADOSAT;
	}
	public static String getEtiquetaTimbrefiscaldigitalRfcprovcertif() {
		return ETIQUETA_TIMBREFISCALDIGITAL_RFCPROVCERTIF;
	}
	public static String getEtiquetaTimbrefiscaldigitalFechatimbrado() {
		return ETIQUETA_TIMBREFISCALDIGITAL_FECHATIMBRADO;
	}
	public static String getEtiquetaTimbrefiscaldigitalUuid() {
		return ETIQUETA_TIMBREFISCALDIGITAL_UUID;
	}
	public static String getEtiquetaTimbrefiscaldigitalSellocfd() {
		return ETIQUETA_TIMBREFISCALDIGITAL_SELLOCFD;
	}
	
	
}
