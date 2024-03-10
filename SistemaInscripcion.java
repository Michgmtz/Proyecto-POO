import java.util.Scanner;
import java.util.Random;

public class SistemaInscripcion{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		Random random= new Random();
		boolean exit = true;
		int option=0, option2=0;
		int clave=0;


		System.out.println("###\t Bienvenido al sistema de inscripciones \t###");
		while(exit){
			System.out.println("\nIngresa la información solicitada, porfavor:");
			System.out.println("Presiona 1) si eres alumno");
			System.out.println("Presiona 2) si eres personal administrativo");
			System.out.println("Presiona 3) si deseas salir");
			option= scanner.nextInt();

			switch(option){
			case 1:
			//esta opción es en caso de que sea un alumno quien desea ingresar
			System.out.println("ingresaste como alumno");
			System.out.println("Presiona 1) si ya estás dado de alta en el sistema");
			System.out.println("Presiona 2) si deseas registrarte");
			int op=scanner.nextInt();
			scanner.nextLine();
			switch(op){
				case 1:
					System.out.println("Ingresa tu número de cuenta: ");
					int numerodecuenta= scanner.nextInt();
					System.out.println("Ingresa tu nombre completo comenzando por apellidos");
					String nombredelalumno= scanner.nextLine();
				break;
				case 2:
					
				breaK;
				default:
				System.out.println("Opción inválida, intente de nuevo");
				break;
					
			}
				break;
			
			case 2: 
				System.out.println("Está intentando ingresar como personal administrativo...");
				System.out.println("Presione 1) si ya cuenta con clave de usuario");
				System.out.println("Presione 2) para tramitar clave de usuario");
				System.out.println("Presione 3) si desea regresar al menú anterior");
				option2= scanner.nextInt();
				switch(option2){
				case 1:
					System.out.println("Ingrese clave de usuario");
					clave= scanner.nextInt();
					if(clave==false){
						System.out.println("La clave es incorrecta"); // hay que implementar una validación para la clave
					}
					else{
					PersonalAdministrativo personaladministrativo= new PersonalAdministrativo();
					}

					break;
				case 2:
					System.out.println("Vamos a generar su clave:");
					System.out.println("Ingrese su nombre completo");
					System.out.println("Vamos a generar su clave:");
					break;
				default:
					System.out.println("La opción ingresada no es válida, intente de nuevo");
					break;
				case 3: 
					break;
				}
				break;
			default:
				System.out.println("Opción inválida, intente de nuevo porfavor");
				break;
			case 3:
				System.out.println("Saliendo...");
				exit=false;

			}






		}



	}	
}