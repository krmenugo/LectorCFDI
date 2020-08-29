package mx.gob.asa.iverar.conexiones;

public class Usuario {
	private int id_Usuario;
	private String user;
	private String pass;
	
	private static Usuario instance;
	
	@Override
	public String toString() {
		return "Usuario [id_Usuario=" + id_Usuario + ", user=" + user + ", pass=" + pass + "]";
	}

	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public static Usuario getInstance() {
        if (instance == null)
            instance = new Usuario();
        return instance;
    }
	
}
