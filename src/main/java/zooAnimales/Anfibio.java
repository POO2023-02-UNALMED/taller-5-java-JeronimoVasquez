package zooAnimales;

import java.util.ArrayList;


public class Anfibio extends Animal {
	

	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private Boolean venenoso;
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
		
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	
	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public int getRanas() {
		return ranas;
	}
	public void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}
	public int getSalamandras() {
		return salamandras;
	}
	public void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public Boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(Boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static int getCantidad() {
		return Anfibio.listado.size();
	}

	
	
	public static Animal crearRana(String nombre, int edad, String genero) {
		
		Anfibio.ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}

	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		
		Anfibio.salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	public int cantidadAnfibios() {
		return this.getRanas() + this.getSalamandras();
	}
}
