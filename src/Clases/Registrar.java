package Clases;

public class Registrar {

	String email;
	String contraseña;
	
	public Registrar() {}

	public Registrar(String email, String contraseña) {
		
		this.email = email;
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public boolean ValidarUsuario(int id_usuario) {
		return true;
	}
}
