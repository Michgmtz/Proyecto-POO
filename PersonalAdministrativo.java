import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;


public class PersonalAdministrativo{
	public static Scanner scanner;


	public static void MenuAdministrativo(){
			scanner=new Scanner(System.in);
			util.crearCarreraComputación();
			int optionextra=0,materiadicional1=0, semestre=0, option=0,  clave=0;
			float promedio=0;
			String nombre, nombreprofesor, materiadicional;
			boolean exit= true;
			System.out.println("Bienvenido");
			while(exit){
			System.out.println("Selecciona la opción que deseas llevar a cabo");
			System.out.println("1)Agregar una asignatura en determinado semestre, además de las ya existentes");
			System.out.println("2)Dar de alta alumno en el sistema");
			System.out.println("3)Dar de alta a un profesor");
			System.out.println("4)Crear un grupo(Primero debes dar de alta a los profesores)");
			System.out.println("5)Salir");
			option= scanner.nextInt();
			scanner.nextLine();
			switch(option){
				case 1:
					System.out.println("Seleccionaste agregar una asignatura extra al plan de estudios");
					System.out.println("Ingresa el semestre en el que quieres agregar una materia extra:");
					optionextra= scanner.nextInt();
					scanner.nextLine();
					if(optionextra<1 || optionextra>8){
						System.out.println("Opción fuera de rango");
					}
					else{
						System.out.println("Ingresa los datos de la materia");
						System.out.println("Clave:");
						materiadicional1=scanner.nextInt();
						scanner.nextLine();
						System.out.println("Nombre de la asignatura:");
						materiadicional=scanner.nextLine();
						util.agregarMaterias(optionextra, materiadicional1, materiadicional);


					}

				break;
				case 2:
					System.out.println("Seleccionaste dar de alta un alumno en el sistema");
					System.out.println("Vamos a ingresar algunos datos del alumno");
					System.out.println("Ingresa el nombre completo:");
					nombre= scanner.nextLine();
					Alumno.setNumerodeAlumnos();
					String carrera="Ingeniería en computación";
					System.out.println("Ingresa el semestre en el que se encuentra el alumno (números enteros 1-8)");
					System.out.println("Recuerda que la carrera consta de 8 semestres");
					semestre= scanner.nextInt();
					System.out.println("Ingresa el promedio del alumno");
					promedio= scanner.nextFloat();
					scanner.nextLine();
					Alumno alumno= new Alumno(nombre, carrera, semestre, promedio);
					Alumno.llenarListaAlumnos(alumno);
					int cuenta=alumno.getNumerodeCuenta();
					Alumno.tablaHashAlumnos(cuenta, alumno);
					
					



				break;
				case 3:
					System.out.println("Seleccionaste dar de alta un profesor");
					System.out.println("Ingresa el nombre completo del profesor comenzando por apellidos:");
					nombreprofesor= scanner.nextLine();
					Profesor profesor=new Profesor(nombreprofesor);
					Profesor.profesoralaLista(profesor);





				break;
				case 4:
					LinkedList<Profesor> checarvacio= new LinkedList<>();
					checarvacio=Profesor.getListaProfesores();
					System.out.println("Seleccionaste crear un grupo");
					if(checarvacio.isEmpty()==true){
						System.out.println("Primero debes ingresar profesores a la lista");
						break;
					}
					else{
						System.out.println("Indica el semestre para el cual quieres crear un grupo (enteros entre 1 y 8) ");
						semestre=scanner.nextInt();
						if(semestre<1 || semestre>8){
							System.out.println("Opción inválida, intenta de nuevo");
						}
						else{
						System.out.println("Las materias de ese semestre y sus claves son las siguientes:");
						util.imprimirMaterias(semestre);
						System.out.println("Los profesores dados de alta en el sistema son los siguientes:");
						for(Profesor imprimirProfesores: checarvacio){
							System.out.println(imprimirProfesores.getNombreProfesor());
						}
						System.out.println("Para crear el grupo ingresa la clave de la materia, el nombre de la misma y el nombre del profesor");
						System.out.println("Clave:");
						clave=scanner.nextInt();
						scanner.nextLine();
						System.out.println("Nombre de la materia:");
						String materia1= scanner.nextLine();
						System.out.println("Profesor:");
						nombreprofesor=scanner.nextLine();
						System.out.println("Ingresa una opción para el horario en el que se impartirá la materia");

						System.out.println("1)9-11h\n2)11-13h\n3)13-15h\n4)15-17h\n5)17-19h\n6)19-21");//checar que no se pueda meter la misma materia con el mismo profe en el mismo horario
						int choise=scanner.nextInt();
						scanner.nextLine();
						if(choise<1 || choise >6){
							System.out.println("Opción inválida");
						}
						else{
							String horary=".";
							switch(choise){
								case 1:
									horary="9-11h";
									
								break;
								case 2:
								horary="11-13h";
								break;
								case 3:
								horary="13-15h";
								break;
								case 4:
								horary="15-17h";
								break;
								case 5:
								horary="17-19h";
								break;
								case 6:
								horary="19-21h";
								break;
							}
							HashMap <Integer, Grupo> comparar= new HashMap<>(); 
							comparar= Grupo.getTablas(semestre);
							boolean confirmacion=false;
							for (Map.Entry<Integer, Grupo> comp: comparar.entrySet()){
								if(comp.getValue().getProfesor().equals(nombreprofesor) && comp.getValue().getHorario().equals(horary) && comp.getValue().getClave()==clave){//utilizar equals()
									confirmacion=true;
								}
							}
							if(confirmacion==true ){
								System.out.println("No puedes dar de alta un grupo con la misma materia, el mismo profesor y a la misma hora");
							}
							else{
						Grupo grupo=new Grupo(nombreprofesor,materia1, clave, semestre, choise );
						Grupo.añadirGrupo(grupo, semestre, clave);
						System.out.println("Se agregó el grupo correctamente");
						Grupo.imprimirGrupos(semestre); 	
							}
						}
						
					}
				}
				break;
				default:
				System.out.println("Opción inválida");
				break;
				case 5: 
					System.out.println("Saliendo...");
					exit=false;
	}
	}



	}

}