package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_C_Nomina {
	public final static String ETIQUETA_NOMINA = "Nomina";
	public final static String ETIQUETA_NOMINA_VERSION = "Version";
	public final static String ETIQUETA_NOMINA_TOTALPERCEPCIONES = "TotalPercepciones";
	public final static String ETIQUETA_NOMINA_TOTALDEDUCCIONES = "TotalDeducciones";
	public final static String ETIQUETA_NOMINA_TIPONOMINA = "TipoNomina";
	public final static String ETIQUETA_NOMINA_NUMDIASPAGADOS= "NumDiasPagados";
	public final static String ETIQUETA_NOMINA_FECHAPAGO = "FechaPago";
	public final static String ETIQUETA_NOMINA_FECHAINICIALPAGO = "FechaInicialPago";
	public final static String ETIQUETA_NOMINA_FECHAFINALPAGO = "FechaFinalPago";
	
	private String version;
	private String totalPercepciones;
	private String totalDeducciones;
	private String tipoNomina;
	private String numDiasPagados;
	private String fechaPago;
	private String fechaInicialPago;
	private String fechaFinalPago;
	
	private CFDI_3_3_C_C_N_Emisor Emisor_Nomina;
	private CFDI_3_3_C_C_N_Receptor Receptor_Nomina;
    private CFDI_3_3_C_C_N_Percepciones Percepciones;
    private CFDI_3_3_C_C_N_Deducciones Deducciones;
    
	@Override
	public String toString() {
		return "Nomina [version=" + version + ", totalPercepciones=" + totalPercepciones + ", totalDeducciones="
				+ totalDeducciones + ", tipoNomina=" + tipoNomina + ", numDiasPagados=" + numDiasPagados
				+ ", fechaPago=" + fechaPago + ", fechaInicialPago=" + fechaInicialPago + ", fechaFinalPago="
				+ fechaFinalPago + ", Emisor_Nomina=" + Emisor_Nomina + ", Receptor_Nomina=" + Receptor_Nomina
				+ ", Percepciones=" + Percepciones + ", Deducciones=" + Deducciones + "]";
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTotalPercepciones() {
		return totalPercepciones;
	}
	public void setTotalPercepciones(String totalPercepciones) {
		this.totalPercepciones = totalPercepciones;
	}
	public String getTotalDeducciones() {
		return totalDeducciones;
	}
	public void setTotalDeducciones(String totalDeducciones) {
		this.totalDeducciones = totalDeducciones;
	}
	public String getTipoNomina() {
		return tipoNomina;
	}
	public void setTipoNomina(String tipoNomina) {
		this.tipoNomina = tipoNomina;
	}
	public String getNumDiasPagados() {
		return numDiasPagados;
	}
	public void setNumDiasPagados(String numDiasPagados) {
		this.numDiasPagados = numDiasPagados;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getFechaInicialPago() {
		return fechaInicialPago;
	}
	public void setFechaInicialPago(String fechaInicialPago) {
		this.fechaInicialPago = fechaInicialPago;
	}
	public String getFechaFinalPago() {
		return fechaFinalPago;
	}
	public void setFechaFinalPago(String fechaFinalPago) {
		this.fechaFinalPago = fechaFinalPago;
	}
	public CFDI_3_3_C_C_N_Emisor getEmisor_Nomina() {
		return Emisor_Nomina;
	}
	public void setEmisor_Nomina(CFDI_3_3_C_C_N_Emisor emisor_Nomina) {
		Emisor_Nomina = emisor_Nomina;
	}
	public CFDI_3_3_C_C_N_Receptor getReceptor_Nomina() {
		return Receptor_Nomina;
	}
	public void setReceptor_Nomina(CFDI_3_3_C_C_N_Receptor receptor_Nomina) {
		Receptor_Nomina = receptor_Nomina;
	}
	public CFDI_3_3_C_C_N_Percepciones getPercepciones() {
		return Percepciones;
	}
	public void setPercepciones(CFDI_3_3_C_C_N_Percepciones percepciones) {
		Percepciones = percepciones;
	}
	public CFDI_3_3_C_C_N_Deducciones getDeducciones() {
		return Deducciones;
	}
	public void setDeducciones(CFDI_3_3_C_C_N_Deducciones deducciones) {
		Deducciones = deducciones;
	}
	public static String getEtiquetaNomina() {
		return ETIQUETA_NOMINA;
	}
	public static String getEtiquetaNominaVersion() {
		return ETIQUETA_NOMINA_VERSION;
	}
	public static String getEtiquetaNominaTotalpercepciones() {
		return ETIQUETA_NOMINA_TOTALPERCEPCIONES;
	}
	public static String getEtiquetaNominaTotaldeducciones() {
		return ETIQUETA_NOMINA_TOTALDEDUCCIONES;
	}
	public static String getEtiquetaNominaTiponomina() {
		return ETIQUETA_NOMINA_TIPONOMINA;
	}
	public static String getEtiquetaNominaNumdiaspagados() {
		return ETIQUETA_NOMINA_NUMDIASPAGADOS;
	}
	public static String getEtiquetaNominaFechapago() {
		return ETIQUETA_NOMINA_FECHAPAGO;
	}
	public static String getEtiquetaNominaFechainicialpago() {
		return ETIQUETA_NOMINA_FECHAINICIALPAGO;
	}
	public static String getEtiquetaNominaFechafinalpago() {
		return ETIQUETA_NOMINA_FECHAFINALPAGO;
	}
    
}
