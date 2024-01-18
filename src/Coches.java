import java.util.ArrayList;
import java.util.Scanner;
public class Coches {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coches = new ArrayList<>();
        System.out.printf("Existen %d coches%n", coches.size());
        String opcion = "";
        String marca = "";
        System.out.println("Cuando quieras de introducir nombres de coches," +
                " introduce un espacio. Si quieres seguir, introduces cualquier cosa.");
        while (!opcion.equals(" ")){
            System.out.println("Dime la marca: ");
            marca = scanner.nextLine();
            coches.add(marca);
            marca = "";
            System.out.println("Quieres seguir?: ");
            opcion = scanner.nextLine();
        }
        System.out.printf("Existen %d coches%n", coches.size());
        for (String coche : coches) {
            System.out.println(coche);
        }
    }
}
