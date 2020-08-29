package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_C_Nomina {
	public final static String ETIQUETA_NOMINA = "nomina";
	public final static String ETIQUETA_NOMINA_VERSION = "Version";
	public final static String ETIQUETA_NOMINA_TIPOREGIMEN = "TipoRegimen";
	public final static String ETIQUETA_NOMINA_REGISTROPATRONAL = "RegistroPatronal";
	public final static String ETIQUETA_NOMINA_PUESTO = "Puesto";
	public final static String ETIQUETA_NOMINA_PERIODICIDADPAGO = "PeriodicidadPago";
	public final static String ETIQUETA_NOMINA_NUMSEGURIDADSOCIAL = "NumSeguridadSocial";
	public final static String ETIQUETA_NOMINA_NUMEMPLEADO = "NumEmpleado";
	public final static String ETIQUETA_NOMINA_NUMDIASPAGADOS = "NumDiasPagados";
	public final static String ETIQUETA_NOMINA_FECHAPAGO = "FechaPago";
	public final static String ETIQUETA_NOMINA_FECHAINICIORELLABORAL = "FechaInicioRelLaboral";
	public final static String ETIQUETA_NOMINA_FECHAINICIALPAGO = "FechaInicialPago";
	public final static String ETIQUETA_NOMINA_FECHAFINALPAGO = "FechaFinalPago";
	public final static String ETIQUETA_NOMINA_DEPARTAMENTO = "Departamento";
	public final static String ETIQUETA_NOMINA_CURP = "CURP";
	public final static String ETIQUETA_NOMINA_CLABE = "CLABE";
	public final static String ETIQUETA_NOMINA_BANCO = "Banco";

	private String version;
	private String tipoRegimen;
	private String registroPatronal;
	private String puesto;
	private String periodicidadPago;
	private String numSeguridadSocial;
	private String numEmpleado;
	private String numDiasPagados;
	private String fechaPago;
	private String fechaInicioRelLaboral;
	private String fechaInicialPago;
	private String fechaFinalPago;
	private String departamento;
	private String curp;
	private String clabe;
	private String banco;
	
	private CFDI_3_2_C_C_N_Percepciones percepciones;
	private CFDI_3_2_C_C_N_Deducciones deducciones;
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_C_Nomina [version=" + version + ", tipoRegimen=" + tipoRegimen + ", registroPatronal="
				+ registroPatronal + ", puesto=" + puesto + ", periodicidadPago=" + periodicidadPago
				+ ", numSeguridadSocial=" + numSeguridadSocial + ", numEmpleado=" + numEmpleado + ", numDiasPagados="
				+ numDiasPagados + ", fechaPago=" + fechaPago + ", fechaInicioRelLaboral=" + fechaInicioRelLaboral
				+ ", fechaInicialPago=" + fechaInicialPago + ", fechaFinalPago=" + fechaFinalPago + ", departamento="
				+ departamento + ", curp=" + curp + ", clabe=" + clabe + ", banco=" + banco + ", percepciones="
				+ percepciones + ", deducciones=" + deducciones + "]";
	}

	public String getVersion() {
		return version;
	}

	public String setVersion(String version) {
		return this.version = version;
	}

	public String getTipoRegimen() {
		return tipoRegimen;
	}

	public String setTipoRegimen(String tipoRegimen) {
		return this.tipoRegimen = tipoRegimen;
	}

	public String getRegistroPatronal() {
		return registroPatronal;
	}

	public String setRegistroPatronal(String registroPatronal) {
		return this.registroPatronal = registroPatronal;
	}

	public String getPuesto() {
		return puesto;
	}

	public String setPuesto(String puesto) {
		return this.puesto = puesto;
	}

	public String getPeriodicidadPago() {
		return periodicidadPago;
	}

	public String setPeriodicidadPago(String periodicidadPago) {
		return this.periodicidadPago = periodicidadPago;
	}

	public String getNumSeguridadSocial() {
		return numSeguridadSocial;
	}

	public String setNumSeguridadSocial(String numSeguridadSocial) {
		return this.numSeguridadSocial = numSeguridadSocial;
	}

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public String setNumEmpleado(String numEmpleado) {
		return this.numEmpleado = numEmpleado;
	}

	public String getNumDiasPagados() {
		return numDiasPagados;
	}

	public String setNumDiasPagados(String numDiasPagados) {
		return this.numDiasPagados = numDiasPagados;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public String setFechaPago(String fechaPago) {
		return this.fechaPago = fechaPago;
	}

	public String getFechaInicioRelLaboral() {
		return fechaInicioRelLaboral;
	}

	public String setFechaInicioRelLaboral(String fechaInicioRelLaboral) {
		return this.fechaInicioRelLaboral = fechaInicioRelLaboral;
	}

	public String getFechaInicialPago() {
		return fechaInicialPago;
	}

	public String setFechaInicialPago(String fechaInicialPago) {
		return this.fechaInicialPago = fechaInicialPago;
	}

	public String getFechaFinalPago() {
		return fechaFinalPago;
	}

	public String setFechaFinalPago(String fechaFinalPago) {
		return this.fechaFinalPago = fechaFinalPago;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String setDepartamento(String departamento) {
		return this.departamento = departamento;
	}

	public String getCurp() {
		return curp;
	}

	public String setCurp(String curp) {
		return this.curp = curp;
	}

	public String getClabe() {
		return clabe;
	}

	public String setClabe(String clabe) {
		return this.clabe = clabe;
	}

	public String getBanco() {
		return banco;
	}

	public String setBanco(String banco) {
		return this.banco = banco;
	}

	public CFDI_3_2_C_C_N_Percepciones getPercepciones() {
		return percepciones;
	}

	public void setPercepciones(CFDI_3_2_C_C_N_Percepciones percepciones) {
		this.percepciones = percepciones;
	}

	public CFDI_3_2_C_C_N_Deducciones getDeducciones() {
		return deducciones;
	}

	public void setDeducciones(CFDI_3_2_C_C_N_Deducciones deducciones) {
		this.deducciones = deducciones;
	}

	public static String getEtiquetaNomina() {
		return ETIQUETA_NOMINA;
	}

	public static String getEtiquetaNominaVersion() {
		return ETIQUETA_NOMINA_VERSION;
	}

	public static String getEtiquetaNominaTiporegimen() {
		return ETIQUETA_NOMINA_TIPOREGIMEN;
	}

	public static String getEtiquetaNominaRegistropatronal() {
		return ETIQUETA_NOMINA_REGISTROPATRONAL;
	}

	public static String getEtiquetaNominaPuesto() {
		return ETIQUETA_NOMINA_PUESTO;
	}

	public static String getEtiquetaNominaPeriodicidadpago() {
		return ETIQUETA_NOMINA_PERIODICIDADPAGO;
	}

	public static String getEtiquetaNominaNumseguridadsocial() {
		return ETIQUETA_NOMINA_NUMSEGURIDADSOCIAL;
	}

	public static String getEtiquetaNominaNumempleado() {
		return ETIQUETA_NOMINA_NUMEMPLEADO;
	}

	public static String getEtiquetaNominaNumdiaspagados() {
		return ETIQUETA_NOMINA_NUMDIASPAGADOS;
	}

	public static String getEtiquetaNominaFechapago() {
		return ETIQUETA_NOMINA_FECHAPAGO;
	}

	public static String getEtiquetaNominaFechainiciorellaboral() {
		return ETIQUETA_NOMINA_FECHAINICIORELLABORAL;
	}

	public static String getEtiquetaNominaFechainicialpago() {
		return ETIQUETA_NOMINA_FECHAINICIALPAGO;
	}

	public static String getEtiquetaNominaFechafinalpago() {
		return ETIQUETA_NOMINA_FECHAFINALPAGO;
	}

	public static String getEtiquetaNominaDepartamento() {
		return ETIQUETA_NOMINA_DEPARTAMENTO;
	}

	public static String getEtiquetaNominaCurp() {
		return ETIQUETA_NOMINA_CURP;
	}

	public static String getEtiquetaNominaClabe() {
		return ETIQUETA_NOMINA_CLABE;
	}

	public static String getEtiquetaNominaBanco() {
		return ETIQUETA_NOMINA_BANCO;
	}
	
}
