/* Uso de diferentes métodos y parámetros para suma de dos números enteros*/


package cl.emanuelsandez; 

import java.util.Scanner;

public class SumaNumero {

	public static int n1, n2, resultadoSuma;  // declaración de datos globales
	
	public static void main(String[] args) { //método principal que realiza la llamada de distintos métodos
		// TODO Auto-generated method stub
		
		capturaDatos();
		resultadoSuma();
		//sumar();
	}

	public static int sumar (int a, int b) { //método que realiza la operación de suma
		int resultado;
		resultado = a + b;
		return resultado;
		
		
	}
	
	public static void resultadoSuma () {  //método que muestra resultado de la suma en pantalla
		
		resultadoSuma = sumar(n1,n2);
		System.out.printf("El resultado de la suma es %d " , resultadoSuma);
		
		}
	
	public static void capturaDatos () { // método que realiza la captura de datos desde el teclado
		
		Scanner tecla = new Scanner(System.in);
		System.out.println("Ingrese el primer número:");
		n1=tecla.nextInt();
		
		System.out.println("Ingrese el segundo número:");
		n2=tecla.nextInt();
		
		
		tecla.close();
		
		}
	
	
}
