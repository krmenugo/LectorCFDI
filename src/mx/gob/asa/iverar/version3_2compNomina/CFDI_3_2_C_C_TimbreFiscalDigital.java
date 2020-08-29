package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_C_TimbreFiscalDigital {
	public final static String ETIQUETA_TIMBREFISCALDIGITAL = "TimbreFiscalDigital";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_VERSION = "version";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_SELLOSAT= "selloSAT";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_SELLOCFD = "selloCFD";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_NOCERTIFICADOSAT = "noCertificadoSAT";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_UUID = "UUID";
	public final static String ETIQUETA_TIMBREFISCALDIGITAL_FECHATIMBRADO = "FechaTimbrado";
	
	private String version;
	private String selloSAT;
	private String selloCFD;
	private String noCertificadoSAT;
	private String uuid;
	private String fechaTimbrado;


	@Override
	public String toString() {
		return "CFDI_3_2_C_C_TimbreFiscalDigital [version=" + version + ", selloSAT=" + selloSAT + ", selloCFD="
				+ selloCFD + ", noCertificadoSAT=" + noCertificadoSAT + ", uuid=" + uuid + ", fechaTimbrado="
				+ fechaTimbrado + "]";
	}
	//----------------------------------------------------------------------
	public String getVersion() {
		return version;
	}
	public String setVersion(String version) {
		return this.version = version;
	}
	//----------------------------------------------------------------------
	public String getSelloSAT() {
		return selloSAT;
	}
	public String setSelloSAT(String selloSAT) {
		return this.selloSAT = selloSAT;
	}
	//----------------------------------------------------------------------
	public String getSelloCFD() {
		return selloCFD;
	}
	public String setSelloCFD(String selloCFD) {
		return this.selloCFD = selloCFD;
	}
	//----------------------------------------------------------------------
	public String getNoCertificadoSAT() {
		return noCertificadoSAT;
	}
	public String setNoCertificadoSAT(String noCertificadoSAT) {
		return this.noCertificadoSAT = noCertificadoSAT;
	}
	//----------------------------------------------------------------------
	public String getUUID() {
		return uuid;
	}
	public String setUUID(String uUID) {
		return uuid = uUID;
	}
	//----------------------------------------------------------------------
	public String getFechaTimbrado() {
		return fechaTimbrado;
	}
	public String setFechaTimbrado(String fechaTimbrado) {
		return fechaTimbrado = fechaTimbrado;
	}
	//----------------------------------------------------------------------
	public static String getEtiquetaTimbrefiscaldigital() {
		return ETIQUETA_TIMBREFISCALDIGITAL;
	}
	public static String getEtiquetaTimbrefiscaldigitalVersion() {
		return ETIQUETA_TIMBREFISCALDIGITAL_VERSION;
	}
	public static String getEtiquetaTimbrefiscaldigitalSellosat() {
		return ETIQUETA_TIMBREFISCALDIGITAL_SELLOSAT;
	}
	public static String getEtiquetaTimbrefiscaldigitalSellocfd() {
		return ETIQUETA_TIMBREFISCALDIGITAL_SELLOCFD;
	}
	public static String getEtiquetaTimbrefiscaldigitalNocertificadosat() {
		return ETIQUETA_TIMBREFISCALDIGITAL_NOCERTIFICADOSAT;
	}
	public static String getEtiquetaTimbrefiscaldigitalUuid() {
		return ETIQUETA_TIMBREFISCALDIGITAL_UUID;
	}
	public static String getEtiquetaTimbrefiscaldigitalFechatimbrado() {
		return ETIQUETA_TIMBREFISCALDIGITAL_FECHATIMBRADO;
	}
	
}
