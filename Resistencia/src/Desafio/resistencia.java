package Desafio;
import java.util.Scanner;
import java.util.InputMismatchException;

public class resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float resi1 = 0;
		float resi2 = 0;
		float resi3 = 0;
		boolean estado;
		
		do { 
			estado = false;
		    try {
                System.out.println("Ingrese Valor Resistencia 1");
    		    resi1 = sc.nextFloat(); /*  */
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número");
                estado = true;
                sc.next();
            }
		}while(estado);
		do {
		    System.out.println("Ingrese Valor Resistencia 2");
		    resi2 = sc.nextFloat(); /*  */
		}while(resi2 <=0);
		do {
		    System.out.println("Ingrese Valor Resistencia 3");
		    resi3 = sc.nextFloat(); /*  */
		}while(resi3 <=0);
		
		float resultado = (1/((1/resi1)+(1/resi2)+(1/resi3)));
		System.out.println("El valor de la resistencia es: " + resultado);

		sc.close();
	}

}
