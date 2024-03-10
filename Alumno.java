import java.util.ArrayList;
import java.util.List;


public class Alumno{
	
	private String nombre;
	private int numerodecuenta;
	private String carrera;
	private int semestre; 
	private float promedio;
	private static int numerodealumnos=0;
	//private List<String> materiasporsemestre// quiero crear una base de datos con las materias de cada semestre correspondiente a 3 carreras 

public Alumno(String nombre, String carrera, int semestre, float promedio){
	this.nombre=nombre;
	this.carrera=carrera;
	this.semestre=semestre;
	this.promedio=promedio;
}

public static void setNumerodeAlumnos(){
	numerodealumnos++;

}
public int getNumerodeAlumnos(){
	return numerodealumnos;
}
public setNumerodeCuenta(){
	int alumnos=numerodealumnos;
	alumnos+=3000;
	
}




}