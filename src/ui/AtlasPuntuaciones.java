/**
 * Programa que gestiona un sistema de puntuaciones para jugadores en rondas
 * permite registrar jugadores, asignarles puntajes en varias rondas y mostrar los resultados finales
 *
 * Entradas:
 * Numero de jugadores (int)
 *  Numero de rondas (int)
 *  Puntajes de cada jugador por ronda (int)
 *
 * Salidas:
 * Lista de jugadores con sus puntajes finales (String)
 *
 * Eje:
 *   ---------------------------------------------------
Por favor ingrese la cantidad de jugadores (Max 10)
---------------------------------------------------
1
-----------------------------------------------
Por favor ingrese la cantidad de rondas (Max 5)
-----------------------------------------------
2
--------------------------------------------------------------------------------
Ingrese el puntaje de Jugador1 en la ronda 1 (0 - 100)
--------------------------------------------------------------------------------
23
--------------------------------------------------------------------------------
Ingrese el puntaje de Jugador1 en la ronda 2 (0 - 100)
--------------------------------------------------------------------------------
24
------------------
Resultados finales
------------------
***********************************************
Jugador1 / Puntaje total: 47
***********************************************
 */

 package ui;

 import java.util.Scanner;
 
 public class AtlasPuntuaciones {
 
	 private Scanner escaner;
 
	 // Declaración de constantes
	 final int MAX_JUGADORES = 10;
	 final int MAX_RONDAS = 5;
 
	 private AtlasPuntuaciones() {
		 escaner = new Scanner(System.in);
	 }
 
	 public void run() {
		 // Declaración de variables
		 int numJugadores = numJugadores();
		 int rondas = numRondas();
		 String[] jugadores = asignarJugadores(numJugadores);
		 int[] puntajes = asignarPuntajes(numJugadores, rondas);
		 mostrarResultados(jugadores, puntajes);
	 }
 
	 /**
	  * Solicita al usuario el número de jugadores permitiendo solo valores entre 1 y 10
	  * @return número de jugadores ingresado
	  */
	 public int numJugadores() {
		 int r = 0;
		 boolean valido = false;
 
		 while (!valido) {
			 System.out.println("---------------------------------------------------");
			 System.out.println("Por favor ingrese la cantidad de jugadores (Max " + MAX_JUGADORES + ")");
			 System.out.println("---------------------------------------------------");
			 n = escaner.nextInt();
			 if (n >= 1 && n <= MAX_JUGADORES) {
				 valido = true; // La entrada es válida
			 } else {
				 System.out.println("Invalido. Intente de nuevo.");
			 }
		 }
		 return n;
	 }
 
	 /**
	  * Solicita al usuario el número de rondas permitiendo solo valores entre 1 y 5
	  * @return número de rondas ingresado
	  */
	 public int numRondas() {
		 int r = 0;
		 boolean valido = false;
		 while (!valido) {
			 System.out.println("--------------");
			 System.out.println("Por favor ingrese la cantidad de rondas (Max " + MAX_RONDAS + ")");
			 System.out.println("--------------");
			 r = escaner.nextInt();
			 if (r >= 1 && r <= MAX_RONDAS) {
				 valido = true; // La entrada es válida
			 }  else {
				 System.out.println("Invalido. Intente de nuevo.");
			 }
		 }
		 return r;
	 }
 
	 /**
	  * Genera un arreglo con los nombres de los jugadores
	  * @param n cantidad de jugadores
	  * @return arreglo con los nombres de los jugadores
	  */
	 public String[] asignarJugadores(int n) {
		 String[] jugadores = new String[n];
		 for (int i = 0; i < n; i++) {
			 jugadores[i] = "Jugador" + (i + 1);
		 }
		 return jugadores;
	 }
 
	 /**
	  * Solicita al usuario los puntajes de cada jugador en cada ronda y los almacena en un arreglo
	  * @param numJugadores cantidad de jugadores
	  * @param rondas cantidad de rondas
	  * @return arreglo con los puntajes totales de cada jugador
	  */
	 public int[] asignarPuntajes(int numJugadores, int rondas) {
		 int[] puntajes = new int[numJugadores];
		 for (int i = 0; i < numJugadores; i++) {
			 int totalPuntaje = 0;
			 for (int j = 0; j < rondas; j++) {
				 int puntaje;
				 boolean valido = false;
				 while (!valido) {
					 System.out.println("-");
					 System.out.println("Ingrese el puntaje de " + "Jugador" + (i + 1) + " en la ronda " + (j + 1) + " (0 - 100)");
					 System.out.println("-");
					 puntaje = escaner.nextInt();
			 if (puntaje >= 0 && puntaje <= 100 ) {
				 valido = true; 
			  }  else {
				 System.out.println("Invalido. Intente de nuevo.");
			  }
			}
		 }
		 puntajes[i]=totalPuntaje;

		/**
	  * muestra en la consola el puntaje total del jugador 
	  * @param jugadores arreglo del nombre de los jugadores
	  * @param puntajes arreglo del  puntaje de los jugadores 
	  */
	  public void mostrarResultados(String[] jugadores, int[] puntajes) {
		       System.out.println("-");
		      System.out.println("Resultados finales");
		       System.out.println("-");
		        for (int i = 0; i < jugadores.length; i++) {
		            System.out.println(jugadores[i] + " / Puntaje total: " + puntajes[i]); 
		        }
		   }
		
		    public static void main(String[] args) {
		       Atlas2 mainApp = new Atlas2();
	        mainApp.run();
	    }


	

	}