package Clases;

public class Legendario {

	String tipo;
	double precio;
	
	public Legendario() {}

	public Legendario(String tipo, double precio) {
		
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean comprar(String Bebida) {
		return true;
	}
	public boolean registrar (String Bebida) {
		return true;
	}
}
