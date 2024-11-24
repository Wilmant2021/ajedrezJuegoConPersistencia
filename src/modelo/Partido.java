
package modelo;

import javax.swing.*;
import java.awt.*;


public class Partido {
    private Jugador blanco;
    private Jugador negro;
    private JButton tablero[][];
    private boolean turnoBlanco;

    public Partido(Jugador b, Jugador n, JButton[][] t){
        this.blanco = b;
        this.negro = n;
        this.turnoBlanco = true;
        this.tablero = new JButton[8][8];
        this.tablero = t;
    }

    public void cambiarTurno(){
        if(this.turnoBlanco){
            this.turnoBlanco = false;
        }else{
            this.turnoBlanco = true;
        }
    }

    public boolean casillaOcupada(JButton casilla, Jugador jugador) {
        boolean ocupada = false;
        for(int i=0; i<jugador.getFichas().size(); i++){
            if(casilla.equals(jugador.getFichas().get(i).casilla)){
                ocupada = true;
            }
        }
        return ocupada;
    }

    public boolean comer(Jugador rival, Ficha eliminada){
        boolean acabado = false;
        for(int i=0; i<rival.getFichas().size(); i++){
            if(rival.getFichas().get(i).equals(eliminada)){
                if(rival.getFichas().get(i).tipo == 6){
                    acabado = true;
                }
                rival.getFichas().remove(i);
            }
        }
        return acabado;
    }

    public void calcularPosicionesCaballo(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x;
        int j = y;
        if (turnoBlanco) {
            i = x - 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x - 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x - 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x - 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
        } else {
            i = x - 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x - 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x - 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x - 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
            i = x + 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                } else {
                    if (!casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.green);
                    }
                }
            }
        }

    }

    public void calcularPosicionesAlfil(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x - 1;
        int j = y - 1;
        boolean ocupada = false;
        if (turnoBlanco) {
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if(!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)){
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j--;
            }
            ocupada = false;
            i = x + 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j++;
            }
            ocupada = false;
            i = x + 1;
            j = y - 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j--;
            }
            ocupada = false;
            i = x - 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], negro)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j++;
            }
        } else {
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j--;
            }
            ocupada = false;
            i = x + 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j++;
            }
            ocupada = false;
            i = x + 1;
            j = y - 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j--;
            }
            ocupada = false;
            i = x - 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                } else {
                    ocupada = true;
                    if (casillaOcupada(tablero[i][j], blanco)) {
                        tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j++;
            }
        }
    }

    public void calcularPosicionesDama(int posicion, boolean turnoBlanco) {
        calcularPosicionesAlfil(posicion, turnoBlanco);
        calcularPosicionesTorre(posicion, turnoBlanco);
    }

    public void calcularPosicionesTorre(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x - 1;
        int j = y;
        boolean ocupada = false;
        while ((i >= 0) && (i < 8) && !ocupada) {
            if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                tablero[i][j].setBackground(Color.green);
            } else {
                ocupada = true;
                if (turnoBlanco && casillaOcupada(tablero[i][j], negro) || !turnoBlanco && casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
            i--;
        }
        i = x + 1;
        j = y;
        ocupada = false;
        while ((i >= 0) && (i < 8) && !ocupada) {
            if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                tablero[i][j].setBackground(Color.green);
            } else {
                ocupada = true;
                if (turnoBlanco && casillaOcupada(tablero[i][j], negro) || !turnoBlanco && casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
            i++;
        }
        i = x;
        j = y + 1;
        ocupada = false;
        while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
            if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                tablero[i][j].setBackground(Color.green);
            } else {
                ocupada = true;
                if (turnoBlanco && casillaOcupada(tablero[i][j], negro) || !turnoBlanco && casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
            j++;
        }
        i = x;
        j = y - 1;
        ocupada = false;
        while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
            if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                tablero[i][j].setBackground(Color.green);
            } else {
                ocupada = true;
                if (turnoBlanco && casillaOcupada(tablero[i][j], negro) || !turnoBlanco && casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
            j--;
        }
    }
    public void calcularPosicionesRey(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x;
        int j = y;
        if (turnoBlanco) {
            for(i=x-1; i<x+2; i++){
                for(j=y-1; j<y+2; j++){
                    if((i != x) || (j != y)){
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (casillaOcupada(tablero[i][j], negro)) {
                                tablero[i][j].setBackground(Color.red);
                            } else {
                                if (!casillaOcupada(tablero[i][j], blanco)) {
                                    tablero[i][j].setBackground(Color.green);
                                }
                            }
                        }
                    }
                }
            }
        }else{
            for(i=x-1; i<x+2; i++){
                for(j=y-1; j<y+2; j++){
                    if((i != x) || (j != y)){
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (casillaOcupada(tablero[i][j], blanco)) {
                                tablero[i][j].setBackground(Color.red);
                            } else {
                                if (!casillaOcupada(tablero[i][j], negro)) {
                                    tablero[i][j].setBackground(Color.green);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void calcularPosicionesPeon(int posicion, boolean turnoBlanco, boolean primerTurno) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i, j;

        // Movimiento hacia arriba para las blancas
        if (turnoBlanco) {
            i = x - 1; j = y;
            if ((i >= 0) && (j >= 0) && (j < 8)) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);
                    if (primerTurno) {
                        int i2 = x - 2;
                        if ((i2 >= 0) && !casillaOcupada(tablero[i2][j], negro) && !casillaOcupada(tablero[i2][j], blanco)) {
                            tablero[i2][j].setBackground(Color.green);
                        }
                    }
                }
            }
            i = x - 1; j = y - 1;
            if ((i >= 0) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
            i = x - 1; j = y + 1;
            if ((i >= 0) && (j < 8)) {
                if (casillaOcupada(tablero[i][j], negro)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
        } else { // Movimiento hacia abajo para las negras
            // Una casilla adelante
            i = x + 1; j = y;
            if ((i < 8) && (j >= 0) && (j < 8)) {
                if (!casillaOcupada(tablero[i][j], negro) && !casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.green);

                    // Dos casillas adelante (si es el primer turno)
                    if (primerTurno) {
                        int i2 = x + 2; // Segunda casilla adelante
                        if ((i2 < 8) && !casillaOcupada(tablero[i2][j], negro) && !casillaOcupada(tablero[i2][j], blanco)) {
                            tablero[i2][j].setBackground(Color.green);
                        }
                    }
                }
            }
            i = x + 1; j = y - 1;
            if ((i < 8) && (j >= 0)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
            i = x + 1; j = y + 1;
            if ((i < 8) && (j < 8)) {
                if (casillaOcupada(tablero[i][j], blanco)) {
                    tablero[i][j].setBackground(Color.red);
                }
            }
        }
    }

    public void realizarEnroque(boolean turnoBlanco, boolean enroqueCorto) {
        // Determinar las filas base para las piezas blancas y negras
        int filaBase = turnoBlanco ? 7 : 0;

        // Posiciones iniciales y finales del rey y la torre
        int columnaReyInicial = 4;
        int columnaReyFinal = enroqueCorto ? 6 : 2;
        int columnaTorreInicial = enroqueCorto ? 7 : 0;
        int columnaTorreFinal = enroqueCorto ? 5 : 3;

        // Mover el rey
        JButton casillaReyInicial = tablero[filaBase][columnaReyInicial];
        JButton casillaReyFinal = tablero[filaBase][columnaReyFinal];
        Ficha rey = obtenerFichaPorCasilla(casillaReyInicial);
        if (rey != null) {
            rey.casilla = casillaReyFinal;
            casillaReyFinal.setIcon(casillaReyInicial.getIcon());
            casillaReyInicial.setIcon(null);
        }

        // Mover la torre
        JButton casillaTorreInicial =tablero[filaBase][columnaTorreInicial];
        JButton casillaTorreFinal = tablero[filaBase][columnaTorreFinal];
        Ficha torre = obtenerFichaPorCasilla(casillaTorreInicial);
        if (torre != null) {
            torre.casilla = casillaTorreFinal;
            casillaTorreFinal.setIcon(casillaTorreInicial.getIcon());
            casillaTorreInicial.setIcon(null);
        }
    }
    private Ficha obtenerFichaPorCasilla(JButton casilla) {
        for (Ficha ficha : blanco.getFichas()) {
            if (ficha.casilla == casilla) {
                return ficha;
            }
        }
        for (Ficha ficha : negro.getFichas()) {
            if (ficha.casilla == casilla) {
                return ficha;
            }
        }
        return null; // No se encontró ninguna ficha en la casilla
    }

    public void realizarCapturaAlPaso(Ficha seleccionada, boolean turnoBlanco, int filaDestino, int columnaDestino) {
        int filaPeonCapturado = turnoBlanco ? filaDestino + 1 : filaDestino - 1;

        JButton casillaPeonCapturado = tablero[filaPeonCapturado][columnaDestino];

        Ficha peonCapturado = obtenerFichaPorCasilla(casillaPeonCapturado);

        if (peonCapturado != null && peonCapturado.tipo == 1) { // Verifica que es un peón
            peonCapturado.casilla.setIcon(null);
            peonCapturado.casilla = null;

            if (turnoBlanco) {
                negro.getFichas().remove(peonCapturado);
            } else {
                blanco.getFichas().remove(peonCapturado);
            }
        }

        JButton casillaPeonCapturador = tablero[filaDestino][columnaDestino];
        JButton casillaOrigen = seleccionada.casilla;
        casillaPeonCapturador.setIcon(casillaOrigen.getIcon());
        casillaOrigen.setIcon(null);

        seleccionada.casilla = casillaPeonCapturador;
    }




    public Jugador getNegro() {
        return negro;
    }

    public Jugador getBlanco() {
        return blanco;
    }

    public JButton[][] getTablero() {
        return tablero;
    }

    public boolean esTurnoBlanco() {
        return turnoBlanco;
    }
}
