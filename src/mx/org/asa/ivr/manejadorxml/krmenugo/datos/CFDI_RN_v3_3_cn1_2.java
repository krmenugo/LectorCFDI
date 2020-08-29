package mx.org.asa.ivr.manejadorxml.krmenugo.datos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://www.w3.org/2001/XMLSchema-instance", name="Comprobante")

public class CFDI_RN_v3_3_cn1_2 implements Serializable {
	//SERIALVERSIONUID= NÚMERO DE VERSIÓN, SE UTILIZA EN LA DESERIALIZACIÓN PARA VERIFICAR QUE EL EMISOR Y EL RECEPTOR DE UN OBJETO SERIALIZADO TENGAN CLASES CARGADAS PARA ESE OBJETO QUE SEAN COMPATIBLES CON LA SERIALIZACIÓN
	private static final long serialVersionUID = -6469097994345611888L;
	
	private String version;

	@XmlElement
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
