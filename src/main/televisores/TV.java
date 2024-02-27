package televisores;
public class TV {
    Marca marca;
	private int canal = 1;
	private int precio = 500;
	boolean estado;
	private int volumen =1;
	
	 
	public TV(Marca marca, boolean estado) {
		
		
		
		System.out.println("Se ha creado un objeto de clase tv");
		;
		System.out.println("Hay " + getNumero());
		
	}
	
	public int getCanal() {
	return this.canal;
	}
	
	public void setCanal(int c) {
		this.canal = c;
	}
	
public int getPrecio() {
	return this.precio;
}
public void setPrecio(int p) {
	this.precio = p;
}
public boolean getEstado() {
	return this.estado;
}
public void setEstado(boolean e) {
	this.estado = e;
}

}
