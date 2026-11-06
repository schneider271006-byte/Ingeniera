import java.util.Random;

//Clase Abstracta Personaje
public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int maxDano;
    protected int minDano;

    public Personaje(String nombre, int puntosDeVida, int maxDano, int minDano) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.maxDano = maxDano;
        this.minDano = minDano;
    }

    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((this.maxDano - this.minDano) + 1) + this.minDano;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + 
                           " causando " + dano + " puntos de daño.");
    }

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
