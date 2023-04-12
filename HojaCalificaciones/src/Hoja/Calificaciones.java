package Hoja;
import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String nombreest;
	String asignatura;
	String docente;
	Float nota1;
	Float nota2;
	Float nota3;
	
	
	System.out.println("Ingrese Nombre Estudiante");
	nombreest = sc.nextLine(); /* Nombre Alumno */
	
	System.out.println("Asignatura");
	asignatura = sc.nextLine(); /* Asignatura */
	
	System.out.println("Docente");
	docente = sc.nextLine(); /* Docente */
	
	System.out.println("Nota 1");
	nota1 = sc.nextFloat(); /* Nota 1*/
	
	System.out.println("Nota 2");
	nota2 = sc.nextFloat(); /* Nota 2 */
	
	System.out.println("Nota 3");
	nota3 = sc.nextFloat(); /* Nota 3 */
	
	
	sc.close();
	
		
	}

}
