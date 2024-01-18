import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertiraArray {
    public static void main(String[] args) {
        List<String> convertimos = new ArrayList<>();
        convertimos.add("Macareno");
        convertimos.add("Albacete");
        convertimos.add("Aguacate");
        convertimos.add("AdriElMojaTangas");

        String[] array = convertimos.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
    }
}