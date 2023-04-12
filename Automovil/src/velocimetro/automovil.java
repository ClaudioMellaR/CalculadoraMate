package velocimetro;
import java.util.Scanner;

public class automovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float distancia;
		float tiempo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la distancia en km: ");
		distancia = sc.nextFloat();
		System.out.println("Ingresa el tiempo en horas: ");
		tiempo = sc.nextFloat();
		
		float velocidad = distancia / tiempo;
		System.out.printf("La velocidad es: " +velocidad+ " km/h");
		

		sc.close();
		
	}

}      
