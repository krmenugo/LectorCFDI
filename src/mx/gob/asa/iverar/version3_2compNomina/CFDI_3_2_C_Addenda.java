package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_Addenda {
	public final static String ETIQUETA_ADDENDA = "Addenda";
	public final static String ETIQUETA_ADDENDA_OBSERVACIONES = "OBSERVACIONES";

	private String observaciones;

	@Override
	public String toString() {
		return "CFDI_3_2_C_Addenda [observaciones=" + observaciones + "]";
	}

	public String getOBSERVACIONES() {
		return observaciones;
	}

	public void setOBSERVACIONES(String oBSERVACIONES) {
		observaciones = oBSERVACIONES;
	}

	public static String getEtiquetaAddenda() {
		return ETIQUETA_ADDENDA;
	}

	public static String getEtiquetaAddendaObservaciones() {
		return ETIQUETA_ADDENDA_OBSERVACIONES;
	}

}
