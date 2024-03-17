import java.util.Scanner;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;



public class SistemaInscripcion{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		
		String nombre;
		boolean exit = true, continuar= true, continuar3=true;
		int option=0, option2=0, option3=0, semestre;
		int clave=0;
		float promedio;
		HashMap <Integer, Alumno> tablaAlumnos=new HashMap<>();


		System.out.println("###\t Bienvenido al sistema de inscripciones \t###");
		
		while(exit){
			System.out.println("\nIngresa la información solicitada, porfavor:");
			System.out.println("Presiona 1) si eres alumno");
			System.out.println("Presiona 2) si eres personal administrativo");
			System.out.println("Presiona 3) si deseas salir");
			option= scanner.nextInt();

			switch(option){
			case 1: //Se crea el Alumno
				System.out.println("Seleccionó ingresar al sistema como alumno");
				while (continuar){
				System.out.println("Presione 1) si ya tiene número de cuenta asignado");
				System.out.println("Presione 2) si es la primera vez que ingresa al sistema");
				System.out.println("Presione 3) se desea salir");
				option3= scanner.nextInt();
				scanner.nextLine();
					switch(option3){
						case 1:
							System.out.println("Ingrese su número de cuenta");
							int cuenta= scanner.nextInt();
							scanner.nextLine();
							boolean checa= Alumno.revisarTabla(cuenta);
							if (checa == false){
								System.out.println("No estás inscrito, debes registrarte primero o ingresa de nuevo tus datos");
							}
							else {
								tablaAlumnos= Alumno.getTabla();
								Alumno alumno=tablaAlumnos.get(cuenta);
								
								System.out.println("Bienvenido " + alumno.getNombre());

								int semes= alumno.getSemestre();
								int option4;
								boolean continuar2=true;
								while(continuar2){
								System.out.println("Ingresa la opción deseada");
								System.out.println("1) Inscribirte en un grupo");//verificar en la tabla hash de grupos en cuales se encuentra el numero de cuenta del alumno
								System.out.println("2) Salir");
								option4=scanner.nextInt();
								scanner.nextLine();
								switch(option4){
									case 1:
									System.out.println("Los grupos de las materias que puedes inscribir dado tu semestre son las siguientes:");
									Grupo.imprimirGrupos(semes);
									System.out.println("Ingresa la CLAVE de la MATERIA a inscribir(Verifica que sea clave de la materia, no del grupo)");
									int clavemateria=scanner.nextInt();
									System.out.println("Ingresa la CLAVE del GRUPO en el cual te quieres inscribir:");
									int clavegrupo=scanner.nextInt();
									HashMap <Integer, Grupo> inscripcion= new HashMap<>();
									inscripcion= Grupo.getTablas(semes);
	
									if(inscripcion.containsKey(clavegrupo)){
										Grupo inscribiragrupo= inscripcion.get(clavegrupo);
										inscribiragrupo.añadirAlumno(cuenta);
										alumno.setMateriasInscritas(semes, clavemateria, clavegrupo);

										System.out.println("Presiona 1) si deseas ver tu tira de materias");
										int option5=scanner.nextInt();
										scanner.nextLine();
										if(option!=1){
											System.out.println("Opción inválida");
										}
										else{
											HashMap <Integer, String> impresion= alumno.getMateriasInscritas();
											Alumno.imprimirListaMaterias(impresion);

										}
	
									}
	
									else{
										System.out.println("Opción inválida, intenta nuevamente");
									}
									break;
									case 2:

									System.out.println("Saliendo...");
									continuar2=false;
									break;
									default:
										System.out.println("Opción inválida");
										break;
									

								}
								
								

							}
						}

						break;
						case 2:
							System.out.println("Seleccionaste ingresar por primera vez, te daremos de alta para asignar un número de cuenta");
							System.out.println("Vamos a ingresar algunos datos");
							System.out.println("Ingresa tu nombre completo:");
							nombre= scanner.nextLine();
							Alumno.setNumerodeAlumnos();
							String carrera="Ingeniería en computación";
							System.out.println("Ingresa el semestre que cursarás (números enteros 1-8)");
							System.out.println("Recuerda que la carrera consta de 8 semestres");
							semestre= scanner.nextInt();
							System.out.println("Ingresa tu promedio ");
							promedio= scanner.nextFloat();
							scanner.nextLine();
							Alumno alumno= new Alumno(nombre, carrera, semestre, promedio);
							Alumno.llenarListaAlumnos(alumno);
							int cuenta2=alumno.getNumerodeCuenta();
							Alumno.tablaHashAlumnos(cuenta2, alumno);
							System.out.println("Tu número de cuenta es: " + cuenta2);
							System.out.println("Ya puedes ingresar al sistema con ella");
						break;
						default:
							System.out.println("Opción inválida");
						break;
						case 3:
							System.out.println("Saliendo...");
							continuar=false;
						

					}
				}
			
			break;
			
			case 2: 
				System.out.println("Está ingresando como personal administrativo...");
				while(continuar3){
				System.out.println("Presione 1) para gestionar alumnos, grupos y profesores");
				System.out.println("Presione 2) para imprimir la lista de alumnos dados de alta en el sistema");
				System.out.println("Presione 3) para imprimir los grupos dados de alta en el sistema");
				System.out.println("Presione 4) para imprimir los profesores registrados en el sistema");
				System.out.println("Presione 5) Salir");

				option2= scanner.nextInt();
				switch(option2){
				case 1:
					PersonalAdministrativo.MenuAdministrativo();
					break;
				case 2:
					List<Alumno> impresion= Alumno.getListadeAlumnos();
					if (impresion.isEmpty()==true){
						System.out.println("La lista está vacía, ingresa alumnos primero");
					}
					else{
						Alumno.imprimirListadeAlumnos(impresion);
					}
					break;
				default:
					System.out.println("La opción ingresada no es válida, intente de nuevo");
					break;
				case 3: 
					for(int i=1;i<9;i++){
						Grupo.imprimirGrupos(i);
					}
					break;
				case 4:
					LinkedList <Profesor> imprimir= Profesor.getListaProfesores();
					Profesor.imprimirListaProfesor(imprimir);
					break;
				case 5:
					System.out.println("Saliendo...");
					continuar3=false;
				}
				
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