package jcolonia.daw2020.mayo;

import java.util.Scanner;

public class VistaAgregar {
	
	/**
	 * Escanea los datos introducidos.
	 */
	private Scanner in;

	/**
	 * Inicializa el atributo {@link #in}.
	 * 
	 * @param in Scanner.
	 */
	public VistaAgregar(Scanner in) {
		this.in = in;
	}
		
	/**
	 * Pide al usuario un numero.
	 * 
	 * @param conjunto
	 * @throws SumatorioNumberException 
	 */
	public void agregarSumando(ListaNúmeros conjunto) throws SumatorioNumberException {

		boolean datosCorrectos = false;

		String entrada;

		do {

			mostrarTexto("Introduzca un nuevo valor:   ");
			entrada = in.nextLine();
			conjunto.add(entrada);
			datosCorrectos = true;

		} while (!datosCorrectos);
	}

	/**
	 * Muestra un texto determinado.
	 * 
	 * @param texto texto a imprimir.
	 */
	private void mostrarTexto(String texto) {
		System.out.print(texto);
	}
}
