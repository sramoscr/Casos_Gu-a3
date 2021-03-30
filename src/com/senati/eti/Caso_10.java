package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {  //falta
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float ht = 0, th = 0, mt = 0, sueldob = 0, bon = 0, dsct = 0, sueldon = 0, ma= 0;
		float sueldon_ma = 0, sueldon_me = 0, mt_ma = 0;
		int nr = 0, cant_meta = 0; 
		String nombre = null, estado = "", continuar = "S";
		
		while (continuar.equals("S")|| continuar.equals("s")) {
			nr++;
			System.out.println("-------------------------------------------");
			System.out.println("         REGISTRO DE EMPLEADOS -" + nr + "-     ");
			System.out.println("-------------------------------------------");
			
			System.out.print("Empleado: ");
			nombre = sc.nextLine();
			
			System.out.print("Horas trabajadas: ");
			ht = sc.nextInt();
			
			System.out.print("Tarifa por horas: ");
			th = sc.nextInt();
			
			System.out.print("Minutos de tradanza: ");
			mt = sc.nextInt();
			System.out.println("-------------------------------------------");
			
			
			sueldob = ht * th;
			   
			
			if (ht > 50 && ht <= 60) 
				bon = sueldob * 0.02f;
			else if (ht > 60 && ht <= 70)
				bon = sueldob * 0.08f;
			else if (ht > 70 && ht <= 80)
				bon = sueldob * 0.13f;
			else if (ht >80)
				bon = sueldob * 0.15f;
			else
				bon = 0;
			
			
			if (mt > 15 && mt <= 30)
				dsct = sueldob - ((sueldob * 0.3f) / mt);
			else if (mt > 30)
				dsct = sueldob - (sueldob * 0.5f / mt);
			else
				dsct = 0;
			
			ma = (float)(ht / 80) * 100;
			
			if (ma > 90) {
				cant_meta++;
			}	
			
			
			if (mt > mt_ma) { 
				mt_ma = mt;
				mt_ma++;
			}
			
			for(int i = 0; i < nr; i++);
				if (sueldon > sueldon_ma) { 
					sueldon_ma = sueldon;
					sueldon++;
				}
			
			for(int i = 0; i < nr; i++);
				if (sueldon < sueldon_me) { 
					sueldon_me = sueldon;
					sueldon++;
				}
			
			System.out.println("\n---------------------------------");
			System.out.println("        R E S U L T A D O S       ");
			System.out.println("---------------------------------");
			System.out.println("Sueldo bruto......: " + df.format(sueldob));
			System.out.println("Bonificación....: " + bon);
			System.out.println("Descuento........: " + dsct);
			System.out.println("Sueldo neto......: " + (sueldob + bon - dsct));
			System.out.println("Meta alcanzada.........: " + df.format(ma) + " %");
			System.out.println("-------------------------------------------");
			
			sc.nextLine();
			
			System.out.print("\n¿Desea registrar otro alumno <S/N>: ");
			continuar = sc.nextLine();
			System.out.println("\n");
			
		}
		System.out.println("\n---------------------");
		System.out.println("-- R E S U M E N --");
		System.out.println("Número de alumnos........: " + nr);
		
		System.out.println("Sueldo neto mayor: " + sueldon_ma + " pertenece a: " + nombre);
		System.out.println("Sueldo neto menor: " + sueldon_me + " pertenece a: " + nombre);
		System.out.println("Empleado con la mayor cant. de min. de tardanza....: " + nombre + "(" + mt_ma + ")");
		System.out.println("Cantidad de empleados con más del 90% de la meta...: " + cant_meta);
		
	
		

	}

}