//CREADOR MAGOS
public class FabricaMago implements FabricaPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Mago(nombre);
    }
}
