package Controlador;

import java.util.Scanner;
import static java.lang.String.format;

public class CalcuDefinitiva {

	public static void main(String[] args) {
		
		var lc = new Scanner(System.in);
		
		int notas[]=new int[3];
		double acumNotas=0.0,contNotas=0.0;
		double promNotas=0.0;
		
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite la nota numero "+(i+1));
			notas[i] = lc.nextInt();
			
			contNotas++;
		}
		acumNotas=notas[0]+notas[1]+notas[2];
		promNotas=acumNotas/contNotas;
		
		var definitiva =promNotas>=350?"Aprobado":"Reprobado" ; 
		System.out.println(definitiva);
		var mensaje= format("su nota es: %.2f",promNotas );
		System.out.println(mensaje);
		
		
		
	}

}
