package Repaso;
import java.io.InputStream;
import java.util.Scanner;


public class NumerosPares {
	/*
	 * auth@r: jorge andres da costa
	 * date: 25/05/2015
	 * crear un mini programa que te diga si un numero ("N") es par o impar.
	 * 
	 * */

		private static Scanner in;
		private static boolean resultado;

		public static void main(String[] args) {
			for (int i = 0; i < 1000; i++) {
				//declaro un bucle para que me pregunte sin parar.
					in = new Scanner(System.in);
					
					//declaro una variable de entrada 
					
						System.out.println("introduzca el numero: ");
						int n = in.nextInt();
						
						//con este metodo declaro que la entrada me lameta en una variable de memoria 
						//llamada n
						
							boolean resultado = (n % 2 == 0);
							
							//declaro un booleano para que me retorne un true o false.
							
								if (resultado == true) {
									System.out.println("el numero es par");
					
								}
								else {
									System.out.println("el numero no es par");
									
									//comparo el boolean para si es par o no y los muestro en pantalla
								}	
				}
		}
								
	}
	
		

