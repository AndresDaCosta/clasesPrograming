package Repaso;
import java.util.Scanner;


public class TablaDeMultiplicar {

	/*
	 * auth@r: jorge andres da costa ribeiro
	 * date: 15/5/2015
	 * version: 1.0
	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("introduzca el numero del que quieres saber su tabla de multiplicar: ");
		int n = in.nextInt();
		//declaro que se setee un nuemero introducido por el user
		
	for (int i = 0; i <= 10; i++) {
		
		System.out.println(i*n);
		
	}
		
		
	}
	
	
	
	
}
