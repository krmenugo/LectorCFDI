package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_E_RegimenFiscal {
	public final static String ETIQUETA_REGIMENFISCAL = "RegimenFiscal";
	public final static String ETIQUETA_REGIMENFISCAL_REGIMEN = "Regimen";

	private String regimen;

	@Override
	public String toString() {
		return "CFDI_3_2_C_E_RegimenFiscal [regimen=" + regimen + "]";
	}

	public String getRegimen() {
		return regimen;
	}

	public void setRegimen(String regimen) {
		regimen = regimen;
	}

	public static String getEtiquetaRegimenfiscal() {
		return ETIQUETA_REGIMENFISCAL;
	}

	public static String setEtiquetaRegimenfiscal() {
		return ETIQUETA_REGIMENFISCAL_REGIMEN;
	}

	
	
}
