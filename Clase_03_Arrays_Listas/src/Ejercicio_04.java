import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] agrs){
        ArrayList<String> ciudades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nEnter para continuar...");
            scanner.nextInt();

            System.out.println("\nPlanificador de Viajes");
            System.out.println("1. Añadir ciudad al itinerario");
            System.out.println("2. Remover ciudad del itinerario");
            System.out.println("3. Mostrar itinerario");
            System.out.println("4. Calcular distancia total del viaje");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la ciudad a añadir");
                    String ciudadAñadir = scanner.nextLine();
                    ciudades.add(ciudadAñadir);
                    break;
                case 2:
                    System.out.println("ingrese el nombre de la ciudad a remover");
                    String ciudadRemover = scanner.nextLine();
                    if (ciudades.remove(ciudadRemover)){
                        System.out.println(ciudadRemover+" ha sido removida");
                    }else {
                        System.out.println("La ciudad no se encontro");
                    }
                    break;
                case 3:
                    System.out.println(Itinerario de viaje: );
                    for (String ciudad : ciudades){
                        System.out.println(ciudad);
                    }
                    break;
                case 4:
                    int distanciaTotal = (ciudades.size()-1)*100;
                    System.out.println("Distancia total estimada del viaje: " +distanciaTotal
                    + " km");
                    break;
                case 5:
                    System.out.println("gracias por utilizame");
            }
        }while (opcion !=5);

    }
}
