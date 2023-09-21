package zooAnimales;

import java.util.ArrayList;


public class Reptil extends Animal {
	
	private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas= colorEscamas;
		this.largoCola = largoCola;
		Reptil.sumarAnimales();
		this.listado.add(this);
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}

	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public int getIguanas() {
		return iguanas;
	}

	public void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public int getSerpientes() {
		return serpientes;
	}

	public void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static Animal crearIguana(String nombre, int edad, String genero) {
		
		Reptil.iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		
		Reptil.serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public int cantidadReptiles() {
		return this.getIguanas() + this.getSerpientes();
	}
	

}
