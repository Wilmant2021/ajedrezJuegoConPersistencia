package modelo;

import java.util.ArrayList;


public class Jugador {
    private boolean blanco;
    private ArrayList<Ficha> fichas;

    public Jugador(boolean bla) {
        this.blanco = bla;
        this.fichas = new ArrayList<Ficha>();
    }
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }
}
