package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_9 {

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int n1 = 0; 
		int	n2 = 0, n3 = 0; 
		int	nr = 0;
		int	num_cert = 0;
		int  num_scert = 0;
		float pro_mayor = 0;
		float pro_menor = 100;
		String nombre = null, estado = "", continuar = "S";
		
		while (continuar.equals("S")|| continuar.equals("s")) {
			nr++;
			System.out.println("-------------------------------------------");
			System.out.println("----------- R E G I S T R O [" + nr + "]  ----------");
			System.out.println("-------------------------------------------");
			
			System.out.print("Nombre del alumno..: ");
			nombre = sc.nextLine();
			
			System.out.print("Nota 1: ");
			n1 = sc.nextInt();
			
			System.out.print("Nota 2: ");
			n2 = sc.nextInt();
			
			System.out.print("Nota 3: ");
			n3 = sc.nextInt();
			
			System.out.print("Ingrese números de asistencias [1-12].: ");
			float asistencia = sc.nextFloat();
			
			float promedio = n1 * 0.2f + n2 * 0.3f + n3 * 0.5f;
			float pa = (asistencia / 12) * 100;
			
			for(int i = 0; i < nr; i++);
				if (promedio > pro_mayor) { 
					pro_mayor = promedio;
				}
				
			for(int i = 0; i < nr; i++);
				if (promedio < pro_menor) { 
				pro_menor = promedio;
				}
					
			if (promedio >= 13 && pa >= 70 ) {
				estado = "Obtiene Certificado";
				num_cert++;
			}
			else {
				estado = "Sin certificado";
				num_scert++;
			}
			System.out.println("\n---------------------------------");
			System.out.println("------- R E S U L T A D O -------");
			System.out.println("---------------------------------");
			System.out.println("Promedio......: " + df.format(promedio));
			System.out.println("Asistencia....: " + df.format(pa) + "%");
			System.out.println("Estado........: " + estado);
			System.out.println("-------------------------------------------");
			
			sc.nextLine();
			
			System.out.print("\n¿Desea registrar otro alumno <S/N>: ");
			continuar = sc.nextLine();
			
		}
		System.out.println("\n---------------------");
		System.out.println("-- R E S U M E N --");
		System.out.println("Número de alumnos........: " + nr);
		
		System.out.println("Mayor promedio " + pro_mayor + " pertenece a: " + nombre);
		System.out.println("Menor promedio " + pro_menor + " pertenece a: " + nombre);
		System.out.println("Número de alumnos certificados...: " + num_cert);
		System.out.println("Número de alumnos sin certificado...: " + num_scert);
		
	
		

	}

}
