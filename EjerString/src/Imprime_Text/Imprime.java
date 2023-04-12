package Imprime_Text;
import java.util.Scanner;

public class Imprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre");
		String nombre = sc.nextLine(); //Carmen
		
		System.out.println("Apellido");
		String apellido = sc.nextLine(); //Silva
		
		System.out.println("Dirección");
		String direccion = sc.nextLine(); //Los aguiluchos
		
		System.out.println("Número");
		int numeroDireccion = sc.nextInt(); //43
		
		System.out.println("Ciudad");
		String ciudad = sc.nextLine(); //Concepción
		
		System.out.println("Telefono");
		int telefono = sc.nextInt(); //562264895
				
		System.out.printf(
				"DE:%s %s\n"
				+ "Dirección: %s %d\n"
				+ "Ciudad: %s\n"
				+ "Contacto:%d\n",
				nombre, apellido, direccion, numeroDireccion, ciudad, telefono);
		sc.close();

		}
}
