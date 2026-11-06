import java.util.Scanner;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del jugador 1 (Guerrero): ");
        String nombre1 = scanner.nextLine();
        FabricaPersonaje fabrica1 = new FabricaGuerrero();
        Personaje p1 = fabrica1.crearPersonaje(nombre1);

        System.out.print("Introduce el nombre del jugador 2 (Mago): ");
        String nombre2 = scanner.nextLine();
        FabricaPersonaje fabrica2 = new FabricaMago();
        Personaje p2 = fabrica2.crearPersonaje(nombre2);

        JuegoLucha juego = new JuegoLucha(p1, p2);
        juego.iniciarPelea();
        
        scanner.close();
    }
}
