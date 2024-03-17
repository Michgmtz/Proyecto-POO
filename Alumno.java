import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Alumno{
	
	private String nombre;
	private int numerodecuenta;
	private String carrera;
	private int semestre; 
	private float promedio;
	private static int numerodealumnos=0;
	private static LinkedList<Alumno> listalumnos= new LinkedList<>();
	private static HashMap<Integer, Alumno> tablaAlumnos= new HashMap<>();
	private HashMap<Integer, String> materiasinscritas= new HashMap<>();
	private Set<Integer> clavesmaterias= new HashSet<>();
	//private List<String> materiasporsemestre// quiero crear una base de datos con las materias de cada semestre correspondiente a 3 carreras 

public Alumno(String nombre, String carrera, int semestre, float promedio){
	this.nombre=nombre;
	this.carrera=carrera;
	this.semestre=semestre;
	this.promedio=promedio;
	setNumerodeAlumnos();
	setNumerodeCuenta();
}

public static void tablaHashAlumnos(int cuenta, Alumno alumno ){
	tablaAlumnos.put(cuenta, alumno);

}
public static HashMap<Integer, Alumno> getTabla(){
	return tablaAlumnos;
}

public static boolean revisarTabla(int cuenta){
	boolean checa= tablaAlumnos.containsKey(cuenta);
	return checa;

}
public static void llenarListaAlumnos(Alumno alumno){
	listalumnos.add(alumno);
	
}
public static List<Alumno> getListaAlumnos(){
	return listalumnos;
}


public static void setNumerodeAlumnos(){
	numerodealumnos++;

}
public int getNumerodeAlumnos(){
	return numerodealumnos;
}
public void setNumerodeCuenta(){
	int alumnos=numerodealumnos;
	alumnos+=3000;
	this.numerodecuenta=alumnos;
	
}
public void setNombre(String nombre){
	this.nombre=nombre;
}
public void setCarrera(String carrera){
	this.carrera=carrera;
}
public void setSemestre(int semestre){
	this.semestre=semestre;

}
public void setPromedio(float promedio){
	this.promedio=promedio;
}
public void setMateriasInscritas(int semestre, int clavemateria, int clavegrupo){
	HashMap<Integer, Grupo> materias=new HashMap<>();
	materias=Grupo.getTablas(semestre);
	Grupo grupo = materias.get(clavegrupo);
	String nombremateria= grupo.getMateria();

	boolean verificar=clavesmaterias.add(clavemateria);
	if(verificar==false){
		System.out.println("No puedes inscribir dos veces la misma materia, prueba de nuevo ");

	}
	else{
		materiasinscritas.put(clavemateria, nombremateria );
	}
	

}

public static List<Alumno> getListadeAlumnos(){
	return listalumnos;
}
public static void imprimirListadeAlumnos(List<Alumno> alumnos){
	System.out.println("La lista de alumnos es la siguiente: ");
	for (Alumno imprimir: alumnos){
		System.out.println("Nombre: " + imprimir.getNombre());
		System.out.println("Número de cuenta: " + imprimir.getNumerodeCuenta());
		System.out.println("Carrera: " + imprimir.getCarrera());
		System.out.println("Semestre: " + imprimir.getSemestre());
	}

}

public int getNumerodeCuenta(){
	return numerodecuenta;
}
public String getNombre(){
	return nombre;
}
public String getCarrera(){
	return carrera;
}
public int getSemestre(){
	return semestre;
}
public float getPromedio(){
	return promedio;
}
public HashMap<Integer, String> getMateriasInscritas(){
	return materiasinscritas;
}

public static void imprimirListaMaterias(HashMap<Integer, String> listamaterias){
	List<Map.Entry<Integer, String>> impresionmaterias;
	impresionmaterias= new ArrayList<>(listamaterias.entrySet());
	for(Map.Entry<Integer, String> impresion: impresionmaterias){
		System.out.println(impresion.getKey()+ "\t" + impresion.getValue());
	}

}






}