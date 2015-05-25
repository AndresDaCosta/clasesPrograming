package Repaso;
import java.lang.reflect.Array;
import java.util.Scanner;


public class Notas {

	/*
	 * auth@r: jorge andres da costa ribeiro
	 * date: 25/05/2015
	 * hacer un metodo que equipare un numero del 1 al 10 (introducido por el user) a notas
	 * version: 1.0
	 * */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("introduzca el valor numerico de su nota: ");
		int nota = in.nextInt();
		switch (nota) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("su nota es: un insuficiente ");
			break;
		case 5:
			System.out.println("su nota es: un suficiente ");
			break;
		case 6:
			System.out.println("su nota es: un bien");
			break;
		case 8:
		case 7:
			System.out.println("su nota es: un notable");
		case 9:
		case 10:
			System.out.println("su nota es: un sobresaliente5");
		default:
			System.out.println("su nota no existe ");
			break;
		}
			
		
			
		}
		
	}
	

