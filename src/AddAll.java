import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static void main (String[] args){
        List<String> convertimos = new ArrayList<>();
        convertimos.add("Macareno");
        convertimos.add("Albacete");
        convertimos.add("Aguacate");
        convertimos.add("AdriElMojaTangas");
        List<String> añadimos = new ArrayList<>();
        añadimos.addAll(convertimos);
        System.out.println(añadimos);
    }
}
