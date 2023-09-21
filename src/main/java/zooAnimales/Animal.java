package zooAnimales;

import gestion.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.sumarAnimales();
		
	}
	
	public static String totalPorTipo() {
		
		return "Mamiferos: " + Mamifero.getTotalAnimales()+ "\n" + "Aves: " + Ave.getTotalAnimales()
				+ "\n" + "Reptiles: " + Reptil.getTotalAnimales() + "\n" + "Peces: " + Pez.getTotalAnimales()
				+ "\n" + "Anfibios: " + Anfibio.getTotalAnimales();
	}
	
	public String toString() {
		if (this.zona == null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en "
				+ this.habitat + " y mi genero es " + this.genero;
		}
		else {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en "
					+ this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona
					+ ", en el " + this.zona.getZoo();
		}
		
	
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public static void sumarAnimales() {
		Animal.totalAnimales++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	

}
