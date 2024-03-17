import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Grupo{
    private String profesor;
    private String materia;
    private int clavemateria;
    private int semestre;
    private static int numerodegrupos=0;
    private int clave;
    private String horario;
    private Set<Integer> alumnosinscritos=new HashSet<>();
     //almacena los numeros de cuenta de los alumnos inscritos
    private static HashMap <Integer, Grupo> listagrupos1= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos2= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos3= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos4= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos5= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos6= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos7= new HashMap<>();
    private static HashMap <Integer, Grupo> listagrupos8= new HashMap<>();
    private static int alumnosengrupo=0;
    

    public Grupo(String profesor, String materia, int semestre, int horario, int clavemateria){
        this.profesor=profesor;
        this.materia=materia;
        this.semestre=semestre;
        this.clavemateria=clavemateria;
        setnumerodeGrupos();
        this.clave=setClaveGrupo();
        switch(horario){
            case 1:
                this.horario="9-11h";
            break;
            case 2:
                this.horario="11-13h";

            break;
            case 3:
                this.horario="13-15h";

            break;
            case 4:
                this.horario="15-17h";
            break;
            case 5:
                this.horario="17-19h";
            break;
            case 6:
                this.horario= "19-21h";
            break;
            
            default:
            System.out.println("Opción inválida");
            break;

        }
     }

     public static HashMap<Integer, Grupo> getTablas(int semestre){
        switch(semestre){
            case 1:
                return listagrupos1;
            
            case 2:
                return listagrupos2;
            
            case 3:
                return listagrupos3;
            
            case 4:
                return listagrupos3;
            
            case 5:
                return listagrupos5;
            
            case 6:
                return listagrupos6;
            
            case 7: 
                return listagrupos7;
            
            case 8: 
                return listagrupos8; 
            default:
                System.out.println("Opción inválida, intenta nuevamente");
                return new HashMap <Integer,Grupo>();
                
            
        }

     } 
     public static void imprimirGrupos(int semestre){// agregar instrucciones para imprimir la lista dada de alta por sesmestre
       List <Map.Entry< Integer, Grupo>> imprimir; 
        switch(semestre){
            case 1:
                 imprimir= new ArrayList<>(listagrupos1.entrySet());
                for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                System.out.println("Clave del grupo: " + imprimirmaterias.getValue().getClave());
                System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                System.out.println("Horario: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                }
                break;
            case 2:
                imprimir= new ArrayList<>(listagrupos2.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                    }
                 break;
            case 3:
                    imprimir= new ArrayList<>(listagrupos3.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                    }
                    break;
            case 4:
                    imprimir= new ArrayList<>(listagrupos4.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                    }
                    break;
            case 5:
                    imprimir= new ArrayList<>(listagrupos5.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                    }
                    break;
            case 6:
                    imprimir= new ArrayList<>(listagrupos6.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                    }
                    break;
            case 7:
                    imprimir= new ArrayList<>(listagrupos7.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                }
                    break;
            case 8:
                    imprimir= new ArrayList<>(listagrupos8.entrySet());
                    for(Map.Entry<Integer, Grupo> imprimirmaterias: imprimir){
                    System.out.println("Clave: " + imprimirmaterias.getValue().getClave());
                    System.out.println("Clave de la materia: " + imprimirmaterias.getValue().getClaveMateria());
                    System.out.println("Materia: " + imprimirmaterias.getValue().getMateria());
                    System.out.println("Profesor de asignatura: " + imprimirmaterias.getValue().getProfesor());
                    System.out.println("Semestre: " + imprimirmaterias.getValue().getSemestre());
                    System.out.println("Número de alumnos inscritos: " + imprimirmaterias.getValue().getNumerodeAlumnos());
                    System.out.println("Horario: " + imprimirmaterias.getValue().getHorario());
                    }
                     break;
            
        
     }
    }
     public static void añadirGrupo(Grupo grupo, int semestre, int clave){
        switch(semestre){
            case 1:
                listagrupos1.put(clave,grupo);
            break;
            case 2:
                listagrupos2.put(clave,grupo);
            break;
            case 3:
                listagrupos3.put(clave,grupo);
            break;
            case 4:
                listagrupos4.put(clave,grupo);
            break;
            case 5:
                listagrupos5.put(clave,grupo);

            break;
            case 6:
                listagrupos6.put(clave,grupo);
            break;
            case 7:
                listagrupos7.put(clave,grupo);
            break;
            case 8:
                listagrupos8.put(clave,grupo);
            break;

        }
        
    }

    public void añadirAlumno(int clavealumno){
        
        alumnosinscritos.add(clavealumno);
        boolean verificar= alumnosinscritos.add(clavealumno);
        if(verificar==false){
            System.out.println("Ya te encuentras inscrito en el grupo, verifica tus datos");
        }
        else {
            System.out.println("Fuiste inscrito exitosamente");
            alumnosengrupo++;
        }
        
    }
    public static void setnumerodeGrupos(){
        numerodegrupos++;
    }
    public int setClaveGrupo(){
        int clave1=100;
        clave1+=numerodegrupos;
        return clave1;

    }
    public  void setSemestre(int semestre){
        this.semestre=semestre;
    }
    public void setProfesor(String profesor){
        this.profesor=profesor;
    }
    public void setMateria(String materia){
        this.materia=materia;   
    }
    public void setClaveMateria(int clavemateria){
        this.clavemateria=clavemateria;
    }
    public int getSemestre(){
        return semestre;
    }
    public String getProfesor(){
        return profesor;
    }
    public String getMateria(){
        return materia;
    }
    public int getClave(){
        return clave;
    }
    public int getNumerodeAlumnos(){
        return alumnosengrupo;
    }
    public String getHorario(){
        return horario;
    }
    public int getClaveMateria(){
        return clavemateria;
    }
    
    
}

