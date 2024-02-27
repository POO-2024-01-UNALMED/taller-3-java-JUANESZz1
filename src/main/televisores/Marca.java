package televisores;

public class Marca {
private String nombre;
public Marca(String nombre) {
	this.nombre = nombre;
	System.out.println("Se ha creado una marca con nombre " + nombre);
}
public String getNombre() {
	return this.nombre;
}
public void setNombre(String n) {
 this.nombre = n;	
}
	

}
