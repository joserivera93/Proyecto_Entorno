package Clases;

public class Vodka {

	String sabor;
	double precio;
	
	public Vodka() {}

	public Vodka(String sabor, double precio) {
		
		this.sabor = sabor;
		this.precio = precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setTipo(String sabor) {
		this.sabor = sabor;
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
