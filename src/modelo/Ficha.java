package modelo;

import javax.swing.*;

public class Ficha {
    public boolean fichaBlanca;
    public int id;// Tipo de ficha: 1 - Peón, 2 - Torre, 3 - Caballo, 4 - Alfil, 5 - Dama, 6 - Rey.
    public int tipo;
    public JButton casilla;
    public boolean seHaMovido = false;


    public Ficha(boolean fic, int id, int tip, JButton cas) {
        this.fichaBlanca = fic;
        this.id = id;
        this.tipo = tip;
        this.casilla = cas;
        poneImagenes(cas.getWidth(), cas.getHeight());
    }


    public void poneImagenes(int w, int h) {
        try {
            if (fichaBlanca) {
                if (tipo == 1) {
                    ImageIcon pB = new ImageIcon("src/imagenes/wp.png");
                    ImageIcon pB2 = new ImageIcon(pB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pB2);
                }
                if (tipo == 2) {
                    ImageIcon tB = new ImageIcon("src/imagenes/wr.png");
                    ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tB2);
                }
                if (tipo == 3) {
                    ImageIcon cB = new ImageIcon("src/imagenes/wn.png");
                    ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cB2);
                }
                if (tipo == 4) {
                    ImageIcon aB = new ImageIcon("src/imagenes/wb.png");
                    ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(aB2);
                }
                if (tipo == 5) {
                    ImageIcon dB = new ImageIcon("src/imagenes/wq.png");
                    ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dB2);
                }
                if (tipo == 6) {
                    ImageIcon rB = new ImageIcon("src/imagenes/wk.png");
                    ImageIcon rB2 = new ImageIcon(rB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rB2);
                }
            } else {
                if (tipo == 1) {
                    ImageIcon pN = new ImageIcon("src/imagenes/bp.png");
                    ImageIcon pN2 = new ImageIcon(pN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pN2);
                }
                if (tipo == 2) {
                    ImageIcon tN = new ImageIcon("src/imagenes/br.png");
                    ImageIcon tN2 = new ImageIcon(tN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tN2);
                }
                if (tipo == 3) {
                    ImageIcon cN = new ImageIcon("src/imagenes/bn.png");
                    ImageIcon cN2 = new ImageIcon(cN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cN2);
                }
                if (tipo == 4) {
                    ImageIcon aN = new ImageIcon("src/imagenes/bb.png");
                    ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(aN2);
                }
                if (tipo == 5) {
                    ImageIcon dN = new ImageIcon("src/imagenes/bq.png");
                    ImageIcon dN2 = new ImageIcon(dN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dN2);
                }
                if (tipo == 6) {
                    ImageIcon rN = new ImageIcon("src/imagenes/bk.png");
                    ImageIcon rN2 = new ImageIcon(rN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rN2);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al abrir la imagen: " + e.toString());
        }
    }


    public String toString(){
        return "Ficha blanca: "+fichaBlanca+" de tipo: "+tipo;
    }
}
