import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.ArrayList;


public class util {

    public static HashMap <Integer, String > semestre1=new HashMap<>();
    public static HashMap <Integer, String > semestre2=new HashMap<>();
    public static HashMap <Integer, String > semestre3=new HashMap<>();
    public static HashMap <Integer, String > semestre4=new HashMap<>();
    public static HashMap <Integer, String > semestre5=new HashMap<>();
    public static HashMap <Integer, String > semestre6=new HashMap<>();
    public static HashMap <Integer, String > semestre7=new HashMap<>();
    public static HashMap <Integer, String > semestre8=new HashMap<>();


    public static HashMap<Integer,String> crearSemestre1(){
  
    semestre1.put(1000, "Cálculo diferencial y geometría analítica");
    semestre1.put(1001, "Fundamentos de programación");
    semestre1.put(1002, "Álgrebra");
      
        return semestre1;
    }
    
    public static HashMap<Integer, String> crearSemestre2(){
        
        semestre2.put(2000, "Álgebra lineal");
        semestre2.put(2001, "Cálculo integral");
        semestre2.put(2002, "Estructura de datos y algoritmos");
       return semestre2;

    }   
    public static HashMap<Integer, String> crearSemestre3(){
        
        semestre3.put(3001, "Estructura de datos y algoritmos 2");
        semestre3.put(3002, "Programación orientada a objtos");
        semestre3.put(3003, "Ecuaciones diferenciales");
        semestre3.put(3004, "Probabilidad");
        return semestre3;
    }
    public static HashMap<Integer, String> crearSemestre4(){
        
        semestre4.put(4001, "EyM");
        semestre4.put(4002, "Análisis numérico");
        semestre4.put(4003, "Estructuras discretas");
        semestre4.put(4004, "Estadística");
        return semestre4;

    }
    public static HashMap<Integer, String> crearSemestre5(){
        
        semestre5.put(5000,"Lenguajes Formales y autómatas");
        semestre5.put(5001,"Dispositivos electrónicos");
        semestre5.put(5002,"Ingeniería de Software");
        semestre5.put(5003 ,"Estructura y programación de computadoras");
        return semestre5;
    }
    public static HashMap<Integer, String> crearSemestre6(){
       
        semestre6.put(6000,"Sistemas operativos");
        semestre6.put(6001,"Bases de datos");
        semestre6.put(6002,"Circuitos eléctricos");
        semestre6.put(6003,"Diseño digital moderno");
        return semestre6;
    }
    public static HashMap<Integer, String> crearSemestre7(){
       
        semestre7.put(7000,"Diseño digital");
        semestre7.put(7001,"Inteligencia Artificial");
        semestre7.put(7002,"Compiladores");
        semestre7.put(7003,"Sistemas de comunicaciones");
        return semestre7;
    }
    public static HashMap<Integer, String> crearSemestre8(){
       
        semestre8.put(8000,"Microcomputadoras");
        semestre8.put(8001,"Redes de datos seguras");
        semestre8.put(8002,"Computación gráfica e interacción humano computadora");
        semestre8.put(8003,"Optativa");
        return semestre8;
    }


    public static void agregarMaterias(int option, int clave, String nombremateria){
        switch(option){
            case 1:
                semestre1.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 2:
                semestre2.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 3:
                semestre3.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 4:
                semestre4.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 5:
                semestre5.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 6:
                semestre6.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 7:
                semestre7.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
            case 8:
                semestre8.put(clave, nombremateria);
                imprimirMaterias(option);
            break;
        }

        
    }

    public static void crearCarreraComputación(){
        crearSemestre1();
        crearSemestre2();
        crearSemestre3();
        crearSemestre4();
        crearSemestre5();
        crearSemestre6();
        crearSemestre7();
        crearSemestre8();
    }

    public static void imprimirMaterias(int option){
        
        List <Map.Entry<Integer, String>> impresionMaterias;
        switch(option){
            

            case 1:
                    impresionMaterias= new ArrayList<>(semestre1.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }

                    break;
            case 2:
                    impresionMaterias= new ArrayList<>(semestre2.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }

                    break;
            case 3:
                    impresionMaterias= new ArrayList<>(semestre3.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }
                    break;
            case 4:
                    impresionMaterias= new ArrayList<>(semestre4.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }
                    break;
            case 5:
                    impresionMaterias= new ArrayList<>(semestre5.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }
                    break;
            case 6:
                    impresionMaterias= new ArrayList<>(semestre6.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }
                    break;
            case 7:
                    impresionMaterias= new ArrayList<>(semestre7.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }
                    break;
            case 8:
                    impresionMaterias= new ArrayList<>(semestre8.entrySet());
                    System.out.println("Clave de inscripción    Nombre de la asignatura");
                    for (Map.Entry<Integer, String> impresion: impresionMaterias){
                        System.out.println(impresion.getKey() + "\t\t\t\t\t" + impresion.getValue());
                    }
                    break;
        }
    
    }

    
}
