package masa.cl;
import java.util.Scanner;

public class MasaCorporal {
static Scanner sn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	        
	       while(!salir){
	           
	    	   System.out.println("------------");
	    	   System.out.println("----Menú----");
	           System.out.println("1. EMC");
	           System.out.println("2. Presión");
	           System.out.println("3. Salir");
	           System.out.println("-------------");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   imc();
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   break;
	                case 3:
	                	salir=true;
		                break;                 
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	            
	       }
	}
	static void imc() { 
		float peso = 0;
		float altura = 0;
		float imc= 0;
		System.out.println("-----------------");
		System.out.println("Ingrese su peso");
		peso = sn.nextFloat();
		System.out.println("Ingrese su altura");
		altura = sn.nextFloat();
		imc = (float)(peso/Math.pow(altura, 2));
		System.out.println("Su ICM es "+ imc);
		evaluaimc(imc);
		
	}
	static void evaluaimc(float valor) { 
		if(valor < 18.5 && valor != 0f) { //Bajo peso
			System.out.println("Usted está bajo peso");
			}else if(valor >= 18.5 && valor <= 24.9) { 
			//Normal
			System.out.println("Usted está Normal");
			}else if(valor >= 25.0 && valor <= 29.9) { 
			//Sobrepeso
			System.out.println("Usted está sobrepeso");
			}else if(valor >= 30.0) {//Obeso
			System.out.println("Usted está Obeso");
			}
	}
	
}
