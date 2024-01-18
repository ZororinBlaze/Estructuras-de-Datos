import java.util.ArrayList;
import java.util.List;

public class Altura {
    public static int numeroAlumnos(){
        return Utilidades.leerEntero("Dime el número de alumnos");
    }
    public static List<Double> leerAlturas (List<Double> alturas, int numeroAlumnos){
        for (int i = 0; i < numeroAlumnos; i++) {
            alturas.add(Utilidades.leerDoble("Dime la altura del alumno:"));
        }
        return alturas;
    }
    public static Double calcularMedia(List<Double> alturas){
        Double suma = 0.0;
        for(Double numero : alturas){
            suma += numero;
        }
        return suma / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(Double calcularMedia, List<Double> alturas){
        int nAluAltSup = 0;
        for(Double numero : alturas){
            if (numero > calcularMedia){
                nAluAltSup++;
            }
        }
        return nAluAltSup;
    }
    public static int calcularAlumnosAlturaInferior(Double calcularMedia, List<Double> alturas){
        int nAluAltInf = 0;
        for(Double numero : alturas){
            if (numero < calcularMedia){
                nAluAltInf++;
            }
        }
        return nAluAltInf;
    }
    public static String mostrarResultados(List<Double> alturas, int numeroAlumnos, Double calcularMedia){
        return "Hay un total de " + numeroAlumnos + " de alumnos." +
                "\nSus alturas son: " + alturas + "." +
                "\nLa altura media es de: " + calcularMedia + "." +
                "\nHay un total de " + calcularAlumnosAlturaSuperior(calcularMedia, alturas) + " alumnos con altura superior a la media." +
                "\nHay un total de " + calcularAlumnosAlturaInferior(calcularMedia, alturas) + " alumnos con altura inferior a la media.";
    }
    public static void main(String [] args){
        int numeroAlumnos = numeroAlumnos();
        List<Double> alturas = new ArrayList<>();
        leerAlturas(alturas, numeroAlumnos);
        Double calcularMedia = calcularMedia(alturas);
        System.out.println(mostrarResultados(alturas, numeroAlumnos, calcularMedia));
    }
}
