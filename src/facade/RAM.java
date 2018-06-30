package facade;

import java.util.ArrayList;
import java.util.List;

public class RAM {

	private List<Software> programas = new ArrayList<>();
	
	public void encender() {
		System.out.println("Encendiendo RAM");
	}
	
	public void apagar() {
		System.out.println("Apagando RAM");
	}
	
	public void cargarSoftware(Software software) {
		System.out.println("Añadiendo el software: " + software.toString());
		programas.add(software);
	}
	
	public List<Software> getPrograma(){
		return programas;
	}
	
	public void verificar() {
		System.out.println("Verificando RAM...");
	}
}
