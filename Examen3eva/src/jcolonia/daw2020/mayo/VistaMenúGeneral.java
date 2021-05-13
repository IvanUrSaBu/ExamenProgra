package jcolonia.daw2020.mayo;

import java.util.Arrays;
import java.util.Scanner;


public class VistaMenúGeneral{
	/**
	 * Título a mostrar en la vista.
	 */
	private String título;
	/**
	 * Texto de las opciones del menú.
	 */
	private String[] opciones;
	
	/**
	 * Número de respustas.
	 */
	private static int númRespuestas = 0;

	/**
	 * Escanea los datos introducidos.
	 */
	private Scanner in;

	/**
	 * Prepara el menú para ser mostrado por pantalla.
	 * 
	 * @param opcionesMenú opciones del menú.
	 * @param scEntrada {@link #in}
	 */
	public VistaMenúGeneral(String títuloMenúPrincipal, String[] opcionesMenúPrincipal, Scanner in2) {
		título = títuloMenúPrincipal;
		opciones = Arrays.copyOfRange(opcionesMenúPrincipal, 0, opcionesMenúPrincipal.length);

		in = in2;
	}
	
	/**
	 * Controla las opciones para elegir.
	 * 
	 * @return la opción elegida.
	 */
	public int elegirOpción() {
		String s;
		int entrada = -1;
		boolean salir = false;
		
		do {
			mostrarMenú();
			mostrarInvitación();
			s = in.nextLine();
			entrada = Integer.parseInt(s);

				salir = true;

		} while (!salir);
		return entrada;
	}	
	/**
	 * Muestra el menú por pantalla.
	 */
	public void mostrarMenú() {
		final String FORMATO_OPCIONES = " %d) %s%n";

		System.out.println(título);

		for (int i = 1; i <= opciones.length; i++) {
			System.out.printf(FORMATO_OPCIONES, i, opciones[i - 1]);
		}
		System.out.printf(FORMATO_OPCIONES, 0, "SALIR");
	}

		/**
		 * Prepara y muestra un mensaje.
		 * 
		 * @param mensaje
		 */
	public void mostrarMensaje(String mensaje) {
		System.out.printf("%n *** %s%n%n", mensaje);
	}

	
	/**
	 * Muestra una invitacion para pedir la opción al usuario.
	 */
	public void mostrarInvitación() {
		System.out.printf("%n Escriba la opción elegida → ");
	}

	public static  int getNúmRespuestas() {
		return númRespuestas;
	}
	

}
