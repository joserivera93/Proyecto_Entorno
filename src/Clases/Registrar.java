package Clases;

public class Registrar {

	String email;
	String contrase�a;
	
	public Registrar() {}

	public Registrar(String email, String contrase�a) {
		
		this.email = email;
		this.contrase�a = contrase�a;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrase�a() {
		return this.contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public boolean ValidarUsuario(int id_usuario) {
		return true;
	}
}
