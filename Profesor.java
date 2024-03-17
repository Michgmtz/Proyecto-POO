import java.util.LinkedList;
import java.util.List;

public class Profesor{
    private String nombre;
    private static LinkedList <Profesor> listaprofesores= new LinkedList<>();

    public static void profesoralaLista(Profesor profesor){
        listaprofesores.add(profesor);
    }

    public static void imprimirListaProfesor(LinkedList <Profesor> listaprofesores){
        System.out.println("La lista de profesores es la siguiente");
        for(Profesor impresion: listaprofesores){
            System.out.println("Nombre: " + impresion.getNombreProfesor());
        }
    }
    public static LinkedList<Profesor> getListaProfesores(){
        return listaprofesores;
    }

    public Profesor(String nombre){
        this.nombre=nombre;

    }

    public String getNombreProfesor(){
        return nombre;
    }
    public void setNombreProfesor(String nombre){
        this.nombre=nombre;

    }
    
}

