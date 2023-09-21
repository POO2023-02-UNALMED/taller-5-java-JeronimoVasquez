package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private Boolean pelaje;
	private int patas;
	
	public Mamifero() {
		Mamifero.listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		
		Mamifero.listado.add(this);
	}
	public ArrayList<Mamifero> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}
	public int getLeones() {
		return leones;
	}
	public void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	public Boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(Boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		
		Mamifero.caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero) {
		
		Mamifero.leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public int cantidadMamiferos() {
		return this.getCaballos() + this.getLeones();
	}
	
	public static int getCantidad() {
		return Mamifero.listado.size();
	}


}
