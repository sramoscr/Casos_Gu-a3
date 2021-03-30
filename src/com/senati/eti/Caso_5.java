package com.senati.eti;

import java.util.Scanner;

public class Caso_5 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		int i = 1, num_menor = 9999, n = 0;
		
		while (i <= 5) {
			System.out.print("Ingrese número " + i + ": ");
			n= sc.nextInt();
			
			if (n < num_menor) num_menor = n;
			
			i++;
		}
		
		System.out.println("\nEl número menor es: " + num_menor);

	}

}