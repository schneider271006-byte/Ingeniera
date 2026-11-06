//CREADOR GUERREROS
public class FabricaGuerrero implements FabricaPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}
