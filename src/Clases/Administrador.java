package Clases;

public class Administrador {

	String nombre;
	String permisos;
	
	public Administrador() {}
	public Administrador(String nombre, String permisos) {
		
		this.nombre = nombre;
		this.permisos = permisos;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPermisos() {
		return this.permisos;
	}
	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
	
	public void AñadirBebida(String Bebida) {
		
	}
	public void EliminarUusario(int Id_Usuario) {
		
	}
}
