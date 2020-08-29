package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Complemento {
	public final static String ETIQUETA_COMPLEMENTO = "Complemento";

	private CFDI_3_2_C_C_TimbreFiscalDigital timbreFiscalDigital;
	private CFDI_3_2_C_C_Nomina nomina;

	@Override
	public String toString() {
		return "CFDI_3_2_C_Complemento [timbreFiscalDigital=" + timbreFiscalDigital + ", nomina=" + nomina + "]";
	}

	public CFDI_3_2_C_C_TimbreFiscalDigital getTimbreFiscalDigital() {
		return timbreFiscalDigital;
	}

	public void setTimbreFiscalDigital(CFDI_3_2_C_C_TimbreFiscalDigital timbreFiscalDigital) {
		this.timbreFiscalDigital = timbreFiscalDigital;
	}

	public CFDI_3_2_C_C_Nomina getNomina() {
		return nomina;
	}

	public void setNomina(CFDI_3_2_C_C_Nomina nomina) {
		this.nomina = nomina;
	}

	public static String getEtiquetaComplemento() {
		return ETIQUETA_COMPLEMENTO;
	}

}
