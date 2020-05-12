package Clases;

public class Factura {

	double precio;
	int id_cliente;
	
	public Factura() {}

	public Factura(double precio, int id_cliente) {
		
		this.precio = precio;
		this.id_cliente = id_cliente;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId_cliente() {
		return this.id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public boolean DescargarFactura(int id_Factura) {
		return true;
	}
}
