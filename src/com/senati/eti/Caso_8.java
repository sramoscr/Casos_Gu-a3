package com.senati.eti;

import java.util.Scanner;

public class Caso_8 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese número....: ");
		int n = sc.nextInt(); 
		
		System.out.println("TABLA DEL " + n);
		System.out.println("============");
		
		for (int i = 1; i <= 15; i++)
			System.out.println(n + " x " + i + " = " + (n*i));
		
		System.out.println("\n");
		
		// multiplicar por pares
		for (int i = 2; i <= 16; i+=2) {
			if (i % 3 == 0) // ----> solo para que aparezca los múltiplos de 3
				            // ----> sin esto apareceran solo pares 
				System.out.println(n + " x " + i + " = " + (n*i)); 
		}
			 
			
		

	}

}