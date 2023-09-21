package gestion;
import zooAnimales.*;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList <Zona>();
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for(int i = 0; i < zonas.size(); i++) {
			total = total + zonas.get(i).cantidadAnimales();
		}
		return total;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

}
