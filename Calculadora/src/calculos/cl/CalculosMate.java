package calculos.cl;

import java.util.Scanner;

public class CalculosMate {
static Scanner sc = new Scanner(System.in); //Variable de clase
static int num1 = 0;
static int num2 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		
		//Ciclo do while para desplegar menú
			
			do {
				System.out.println("--------------------");
				System.out.println("      MENÚ          ");
				System.out.println("--------------------");
				System.out.println("1.-Sumar");
				System.out.println("2.-Restar");
				System.out.println("3.-Multiplicar");
				System.out.println("4.-Dividir");
				System.out.println("5.-Salir");
				System.out.println("Ingrese una opción");
				op = sc.nextInt();
				
				
				
				switch (op) {
				
				case 1:
					sumar();
					break;
				case 2:
					restar(num1,num2);
					break;
				case 3:
					multiplicar(num1,num2);
					break;
				case 4:
					dividir(num1,num2);
					break;
				case 5:
					salir();
					op = 5;
					break;
				default:
					System.out.println("Opción inválida");
				}
			}while(op!=5);
	}
		
			static void sumar() {
			//int resultado = valor1+valor2;
			ingreso();
			System.out.println("Resultado Suma = "+(num1+num2));
		}
			static void restar(int valor1, int valor2) {
				//int resultado = valor1+valor2;
				System.out.println("Resultado resta = "+(valor1-valor2));
			
			}
			static void multiplicar(int valor1, int valor2) {
				int resultado = valor1*valor2;
				System.out.println("Resultado multiplicación = "+resultado);
			
			}
			static void dividir(int valor1, int valor2) {
				//int resultado = valor1+valor2;
				System.out.println("Resultado División = "+(valor1/valor2));
			
			}
			static void salir() {
				//int resultado = valor1+valor2;
				System.exit(0);
				sc.close();
				}
			static void ingreso() {
				System.out.println("Ingreso número 1");
				num1 = sc.nextInt();
				System.out.println("Ingreso número 2");
				num2 = sc.nextInt();
			}
}