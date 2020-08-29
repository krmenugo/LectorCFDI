package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_C_N_Receptor {
	public final static String ETIQUETA_NOMINA_RECEPTOR = "Receptor";
	public final static String ETIQUETA_NOMINA_RECEPTOR_TIPOREGIMEN= "TipoRegimen";
	public final static String ETIQUETA_NOMINA_RECEPTOR_TIPOJORNADA = "TipoJornada";
	public final static String ETIQUETA_NOMINA_RECEPTOR_TIPOCONTRATO = "TipoContrato";
	public final static String ETIQUETA_NOMINA_RECEPTOR_SINDICALIZADO = "Sindicalizado";
	public final static String ETIQUETA_NOMINA_RECEPTOR_SALARIODIARIOINTEGRADO = "SalarioDiarioIntegrado";
	public final static String ETIQUETA_NOMINA_RECEPTOR_SALARIOBASECOTAPOR = "SalarioBaseCotApor";
	public final static String ETIQUETA_NOMINA_RECEPTOR_RIESGOPUESTO = "RiesgoPuesto";
	public final static String ETIQUETA_NOMINA_RECEPTOR_PUESTO = "Puesto";
	public final static String ETIQUETA_NOMINA_RECEPTOR_PERIODICIDADPAGO = "PeriodicidadPago";
	public final static String ETIQUETA_NOMINA_RECEPTOR_NUMSEGURIDADSOCIAL = "NumSeguridadSocial";
	public final static String ETIQUETA_NOMINA_RECEPTOR_NUMEMPLEADO = "NumEmpleado";
	public final static String ETIQUETA_NOMINA_RECEPTOR_FECHAINICIORELLABORAL = "FechaInicioRelLaboral";
	public final static String ETIQUETA_NOMINA_RECEPTOR_DEPARTAMENTO = "Departamento";
	public final static String ETIQUETA_NOMINA_RECEPTOR_CURP = "Curp";
	public final static String ETIQUETA_NOMINA_RECEPTOR_CUENTABANCARIA = "CuentaBancaria";
	public final static String ETIQUETA_NOMINA_RECEPTOR_CLAVEENTFED = "ClaveEntFed";
	public final static String ETIQUETA_NOMINA_RECEPTOR_BANCO = "Banco";
	public final static String ETIQUETA_NOMINA_RECEPTOR_ANTIGÜEDAD = "Antigüedad";
	
	private String tipoRegimen;
	private String tipoJornada;
	private String tipoContrato;
	private String sindicalizado;
	private String salarioDiarioIntegrado;
	private String salarioBaseCotApor;
	private String riesgoPuesto;
	private String puesto;
	private String periodicidadPago;
	private String numSeguridadSocial;
	private String numEmpleado;
	private String fechaInicioRelLaboral;
	private String departamento;
	private String curp;
	private String cuentaBancaria;
	private String claveEntFed;
	private String banco;
	private String antigüedad;
	
	@Override
	public String toString() {
		return "Receptor_Nomina [tipoRegimen=" + tipoRegimen + ", tipoJornada=" + tipoJornada + ", tipoContrato="
				+ tipoContrato + ", sindicalizado=" + sindicalizado + ", salarioDiarioIntegrado="
				+ salarioDiarioIntegrado + ", salarioBaseCotApor=" + salarioBaseCotApor + ", riesgoPuesto="
				+ riesgoPuesto + ", puesto=" + puesto + ", periodicidadPago=" + periodicidadPago
				+ ", numSeguridadSocial=" + numSeguridadSocial + ", numEmpleado=" + numEmpleado
				+ ", fechaInicioRelLaboral=" + fechaInicioRelLaboral + ", departamento=" + departamento + ", curp="
				+ curp + ", cuentaBancaria=" + cuentaBancaria + ", claveEntFed=" + claveEntFed + ", banco=" + banco
				+ ", antigüedad=" + antigüedad + "]";
	}
	
	public String getTipoRegimen() {
		return tipoRegimen;
	}
	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}
	public String getTipoJornada() {
		return tipoJornada;
	}
	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public String getSindicalizado() {
		return sindicalizado;
	}
	public void setSindicalizado(String sindicalizado) {
		this.sindicalizado = sindicalizado;
	}
	public String getSalarioDiarioIntegrado() {
		return salarioDiarioIntegrado;
	}
	public void setSalarioDiarioIntegrado(String salarioDiarioIntegrado) {
		this.salarioDiarioIntegrado = salarioDiarioIntegrado;
	}
	public String getSalarioBaseCotApor() {
		return salarioBaseCotApor;
	}
	public void setSalarioBaseCotApor(String salarioBaseCotApor) {
		this.salarioBaseCotApor = salarioBaseCotApor;
	}
	public String getRiesgoPuesto() {
		return riesgoPuesto;
	}
	public void setRiesgoPuesto(String riesgoPuesto) {
		this.riesgoPuesto = riesgoPuesto;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getPeriodicidadPago() {
		return periodicidadPago;
	}
	public void setPeriodicidadPago(String periodicidadPago) {
		this.periodicidadPago = periodicidadPago;
	}
	public String getNumSeguridadSocial() {
		return numSeguridadSocial;
	}
	public void setNumSeguridadSocial(String numSeguridadSocial) {
		this.numSeguridadSocial = numSeguridadSocial;
	}
	public String getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public String getFechaInicioRelLaboral() {
		return fechaInicioRelLaboral;
	}
	public void setFechaInicioRelLaboral(String fechaInicioRelLaboral) {
		this.fechaInicioRelLaboral = fechaInicioRelLaboral;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public String getClaveEntFed() {
		return claveEntFed;
	}
	public void setClaveEntFed(String claveEntFed) {
		this.claveEntFed = claveEntFed;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAntigüedad() {
		return antigüedad;
	}
	public void setAntigüedad(String antigüedad) {
		this.antigüedad = antigüedad;
	}
	public static String getEtiquetaNominaReceptor() {
		return ETIQUETA_NOMINA_RECEPTOR;
	}
	public static String getEtiquetaNominaReceptorTiporegimen() {
		return ETIQUETA_NOMINA_RECEPTOR_TIPOREGIMEN;
	}
	public static String getEtiquetaNominaReceptorTipojornadal() {
		return ETIQUETA_NOMINA_RECEPTOR_TIPOJORNADA;
	}
	public static String getEtiquetaNominaReceptorTipocontrato() {
		return ETIQUETA_NOMINA_RECEPTOR_TIPOCONTRATO;
	}
	public static String getEtiquetaNominaReceptorSindicalizado() {
		return ETIQUETA_NOMINA_RECEPTOR_SINDICALIZADO;
	}
	public static String getEtiquetaNominaReceptorSalariodiariointegrado() {
		return ETIQUETA_NOMINA_RECEPTOR_SALARIODIARIOINTEGRADO;
	}
	public static String getEtiquetaNominaReceptorSalariobasecotapor() {
		return ETIQUETA_NOMINA_RECEPTOR_SALARIOBASECOTAPOR;
	}
	public static String getEtiquetaNominaReceptorRiesgopuesto() {
		return ETIQUETA_NOMINA_RECEPTOR_RIESGOPUESTO;
	}
	public static String getEtiquetaNominaReceptorPuesto() {
		return ETIQUETA_NOMINA_RECEPTOR_PUESTO;
	}
	public static String getEtiquetaNominaReceptorPeriodicidadpago() {
		return ETIQUETA_NOMINA_RECEPTOR_PERIODICIDADPAGO;
	}
	public static String getEtiquetaNominaReceptorNumseguridadsocial() {
		return ETIQUETA_NOMINA_RECEPTOR_NUMSEGURIDADSOCIAL;
	}
	public static String getEtiquetaNominaReceptorNumempleado() {
		return ETIQUETA_NOMINA_RECEPTOR_NUMEMPLEADO;
	}
	public static String getEtiquetaNominaReceptorFechainiciorellaboral() {
		return ETIQUETA_NOMINA_RECEPTOR_FECHAINICIORELLABORAL;
	}
	public static String getEtiquetaNominaReceptorDepartamento() {
		return ETIQUETA_NOMINA_RECEPTOR_DEPARTAMENTO;
	}
	public static String getEtiquetaNominaReceptorCurp() {
		return ETIQUETA_NOMINA_RECEPTOR_CURP;
	}
	public static String getEtiquetaNominaReceptorCuentabancaria() {
		return ETIQUETA_NOMINA_RECEPTOR_CUENTABANCARIA;
	}
	public static String getEtiquetaNominaReceptorClaveentfed() {
		return ETIQUETA_NOMINA_RECEPTOR_CLAVEENTFED;
	}
	public static String getEtiquetaNominaReceptorBanco() {
		return ETIQUETA_NOMINA_RECEPTOR_BANCO;
	}
	public static String getEtiquetaNominaReceptorAntigüedad() {
		return ETIQUETA_NOMINA_RECEPTOR_ANTIGÜEDAD;
	}
	
	
}
