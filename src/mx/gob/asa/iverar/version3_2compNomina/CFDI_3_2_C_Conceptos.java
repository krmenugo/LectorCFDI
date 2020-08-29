package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Conceptos {
	public final static String ETIQUETA_CONCEPTOS_CONCEPTOS = "Conceptos";

	private CFDI_3_2_C_Cs_Concepto Concepto;

	@Override
	public String toString() {
		return "CFDI_3_2_C_Conceptos [Concepto=" + Concepto + "]";
	}

	public CFDI_3_2_C_Cs_Concepto getConcepto() {
		return Concepto;
	}

	public void setConcepto(CFDI_3_2_C_Cs_Concepto concepto) {
		Concepto = concepto;
	}

	public static String getEtiquetaConceptosConceptos() {
		return ETIQUETA_CONCEPTOS_CONCEPTOS;
	}

}
