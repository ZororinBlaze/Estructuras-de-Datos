import java.util.ArrayList;
import java.util.List;

public class Existe {
    public static String existe (List<String> convertimos){
        String palabra = Utilidades.leerCadena("Dime la palabra y te diré si está contenida en el ArrayList: ");
        String resultado = "";
        if (convertimos.contains(palabra)){
            resultado = "Este elemento sí que existe en el ArrayList.";
        }else{
            resultado = "Este elemento no existe en el ArrayList.";
        }
        return resultado;
    }
    public static void main(String [] args){
        List<String> convertimos = new ArrayList<>();
        convertimos.add("Macareno");
        convertimos.add("Albacete");
        convertimos.add("Aguacate");
        convertimos.add("AdriElMojaTangas");
        System.out.println(existe(convertimos));
    }
}
