// Mago
public class Mago extends Personaje {
    public Mago(String nombre) {
        // El Mago tiene menos vida (80) pero hace más daño (15-40)
        super(nombre, 80, 40, 15); 
    }
}
