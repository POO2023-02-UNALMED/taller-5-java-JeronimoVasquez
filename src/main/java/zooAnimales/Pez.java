package zooAnimales;

import java.util.ArrayList;


public class Pez extends Animal {
	
	private ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.sumarAnimales();
		this.listado.add(this);
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}

	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public int getSalmones() {
		return salmones;
	}

	public void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public int getBacalaos() {
		return bacalaos;
	}

	public void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		
		Pez.salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		
		Pez.bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}

	public int cantidadPeces() {
		return this.getBacalaos() + this.getSalmones();
	}
}
