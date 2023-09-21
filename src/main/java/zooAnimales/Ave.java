package zooAnimales;

import java.util.ArrayList;


public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		Ave.listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		
		Ave.listado.add(this);
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	public ArrayList<Ave> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public int getHalcones() {
		return halcones;
	}
	public void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	public int getAguilas() {
		return aguilas;
	}
	public void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		
		Ave.halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	public static Animal crearAguila(String nombre, int edad, String genero) {
		
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public int cantidadAves() {
		return this.getAguilas() + this.getHalcones();
	}
	
	public static int getCantidad() {
		return Ave.listado.size();
	}


}
