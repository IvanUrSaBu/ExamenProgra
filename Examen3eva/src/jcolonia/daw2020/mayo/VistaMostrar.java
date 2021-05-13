package jcolonia.daw2020.mayo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author admin
 *
 */
public class VistaMostrar {
	
	/**
	 * Escanea los datos introducidos.
	 */
	private Scanner in;

	/**
	 * Inicializa el atributo {@link #in}.
	 * 
	 * @param in Scanner.
	 */
	public VistaMostrar(Scanner in) {
		this.in = in;
	}


	/**
	 * Constructor
	 * 
	 * @param conjunto
	 */
	public VistaMostrar(ListaNúmeros conjunto) {
		
	}

	/**
	 * Muestra la lista de los números.
	 * 
	 * @param lista la lista.
	 */
	public void mostrarLista(ArrayList <String> lista) {
		String titulo;
		titulo = String.format("Lista de sumandos\n");
		System.out.println(titulo);
		for (int i =0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
	}

	/**
	 * Muestra la lista de los números.
	 * 
	 * @param string lista la lista.
	 */
	public void mostrarSuma(String suma) {
		System.out.println(suma.toString());
		
	}
}
