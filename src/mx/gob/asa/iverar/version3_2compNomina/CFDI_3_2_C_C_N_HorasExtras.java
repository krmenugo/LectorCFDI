package mx.gob.asa.iverar.version3_2compNomina;

public class CFDI_3_2_C_C_N_HorasExtras {
	public final static String ETIQUETA_HORASEXTRAS = "HorasExtras";
	public final static String ETIQUETA_HORASEXTRAS_TIPOHORAS = "TipoHoras";
	public final static String ETIQUETA_HORASEXTRAS_IMPORTEPAGADO = "ImportePagado";
	public final static String ETIQUETA_HORASEXTRAS_HORASEXTRA = "HorasExtra";
	public final static String ETIQUETA_HORASEXTRAS_DIAS = "Dias";
	
	private String tipoHoras;
	private String tmportePagado;
	private String horasExtra;
	private String dias;
	
	@Override
	public String toString() {
		return "CFDI_3_2_C_C_N_HorasExtras [tipoHoras=" + tipoHoras + ", tmportePagado=" + tmportePagado
				+ ", horasExtra=" + horasExtra + ", dias=" + dias + "]";
	}
	
	public String getTipoHoras() {
		return tipoHoras;
	}
	public void setTipoHoras(String tipoHoras) {
		this.tipoHoras = tipoHoras;
	}
	public String getTmportePagado() {
		return tmportePagado;
	}
	public void setTmportePagado(String tmportePagado) {
		this.tmportePagado = tmportePagado;
	}
	public String getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(String horasExtra) {
		this.horasExtra = horasExtra;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public static String getEtiquetaHorasextras() {
		return ETIQUETA_HORASEXTRAS;
	}
	public static String getEtiquetaHorasextrasTipohoras() {
		return ETIQUETA_HORASEXTRAS_TIPOHORAS;
	}
	public static String getEtiquetaHorasextrasImportepagado() {
		return ETIQUETA_HORASEXTRAS_IMPORTEPAGADO;
	}
	public static String getEtiquetaHorasextrasHorasextra() {
		return ETIQUETA_HORASEXTRAS_HORASEXTRA;
	}
	public static String getEtiquetaHorasextrasDias() {
		return ETIQUETA_HORASEXTRAS_DIAS;
	}
	
	

}
