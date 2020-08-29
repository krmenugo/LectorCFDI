package mx.gob.asa.iverar.version3_3compNomina;

public class CFDI_3_3_C_Complemento {
	public final static String ETIQUETA_COMPLEMENTO = "Complemento";
	
	private CFDI_3_3_C_C_Nomina Nomina;
	private CFDI_3_3_C_C_TimbreFiscalDigital TimbreFiscalDigital;
	
	@Override
	public String toString() {
		return "CFDI_3_3_C_Complemento [Nomina=" + Nomina + ", TimbreFiscalDigital=" + TimbreFiscalDigital + "]";
	}
	
	public CFDI_3_3_C_C_Nomina getNomina() {
		return Nomina;
	}
	public void setNomina(CFDI_3_3_C_C_Nomina nomina) {
		Nomina = nomina;
	}
	public CFDI_3_3_C_C_TimbreFiscalDigital getTimbreFiscalDigital() {
		return TimbreFiscalDigital;
	}
	public void setTimbreFiscalDigital(CFDI_3_3_C_C_TimbreFiscalDigital timbreFiscalDigital) {
		TimbreFiscalDigital = timbreFiscalDigital;
	}
	public static String getEtiquetaComplemento() {
		return ETIQUETA_COMPLEMENTO;
	}
	
}