// Guerrero
public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        // El Guerrero tiene más vida (120) pero el daño estándar (10-30)
        super(nombre, 120, 30, 10);
    }
}
