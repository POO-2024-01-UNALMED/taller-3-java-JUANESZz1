package televisores;
public class TV {
    Marca marca;
	private int canal = 1;
	private int precio = 500;
	boolean estado;
	private int volumen =1;
	private int numTV = 0;
	 
	public TV(Marca marca, boolean estado) {
		System.out.println("Se ha creado un objeto de clase tv");
		
		    numTV = ++numTV;
			System.out.println("Se ha construido un nuevo objeto");
			System.out.println("Hay " + numTV + " objetos");
		}
		
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

public void setNumeroTV(int numero){
	this.numero = numeroTV;

} 
public int getNumeroTV(){
	return this.numeroTV;
}

public void turnOn(){
if (estado == false){
estado = true;
System.out.println("El tv se encendio correctamente");
}else{
	system.out.println("El TV ya estaba encendido");
}
public void turnOff(){
	if estado == true{
		estado == false
		System.out.println("El tv se apago correctamente");
	}else{
		System.out.println("El tv ya estaba apagado");
	}
}
}