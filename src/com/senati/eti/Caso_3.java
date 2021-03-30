package com.senati.eti;

import java.util.Scanner;

public class Caso_3 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número......: ");
		int n= sc.nextInt();
		
		int i = 1, fac = 1;
		String ms = "El número es superior a 7";
		
		if (n > 7)
			System.out.print(ms);
		else
			while (i <= n) {	
				fac = fac * i;
				if (i < n)
					System.out.print(i  + " * " ); 
				else 
					System.out.print(i  + " = " + fac); 
			
				i++;
			}
		
	}

}
