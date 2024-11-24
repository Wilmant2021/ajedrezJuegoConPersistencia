
package vista;

import modelo.Ficha;
import modelo.creadorArchivoPGN;
import controlador.ControladorAjedrez;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class VistaAjedrez extends JFrame {

    private JButton A1;
    private JButton A2;
    private JButton A3;
    private JButton A4;
    private JButton A5;
    private JButton A6;
    private JButton A7;
    private JButton A8;
    private JButton B1;
    private JButton B2;
    private JButton B3;
    private JButton B4;
    private JButton B5;
    private JButton B6;
    private JButton B7;
    private JButton B8;
    private JButton C1;
    private JButton C2;
    private JButton C3;
    private JButton C4;
    private JButton C5;
    private JButton C6;
    private JButton C7;
    private JButton C8;
    private JButton D1;
    private JButton D2;
    private JButton D3;
    private JButton D4;
    private JButton D5;
    private JButton D6;
    private JButton D7;
    private JButton D8;
    private JButton E1;
    private JButton E2;
    private JButton E3;
    private JButton E4;
    private JButton E5;
    private JButton E6;
    private JButton E7;
    private JButton E8;
    private JButton F1;
    private JButton F2;
    private JButton F3;
    private JButton F4;
    private JButton F5;
    private JButton F6;
    private JButton F7;
    private JButton F8;
    private JButton G1;
    private JButton G2;
    private JButton G3;
    private JButton G4;
    private JButton G5;
    private JButton G6;
    private JButton G7;
    private JButton G8;
    private JButton H1;
    private JButton H2;
    private JButton H3;
    private JButton H4;
    private JButton H5;
    private JButton H6;
    private JButton H7;
    private JButton H8;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel panelCasillas;
    private JTextField tfTurno;
    private JButton[][] MatrizCasillas;
    private JPanel panelDerecho;
    private JTextArea textArea;
    private creadorArchivoPGN pgnCreater;
    private JButton btnGuardar;
    private JTextField textoGuardar;


    public VistaAjedrez() {
        initComponents();
        pgnCreater = new creadorArchivoPGN("Jugador Blanco", "Jugador Negro", textArea);

        MatrizCasillas = new JButton[8][8];
        JButton ArrayButtons[] = {A1, B1, C1, D1, E1, F1, G1, H1,
                A2, B2, C2, D2, E2, F2, G2, H2,
                A3, B3, C3, D3, E3, F3, G3, H3,
                A4, B4, C4, D4, E4, F4, G4, H4,
                A5, B5, C5, D5, E5, F5, G5, H5,
                A6, B6, C6, D6, E6, F6, G6, H6,
                A7, B7, C7, D7, E7, F7, G7, H7,
                A8, B8, C8, D8, E8, F8, G8, H8};
        int n = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++, n++) {
                MatrizCasillas[i][j] = ArrayButtons[n];
            }
        }
        pintarCasillasNormal(MatrizCasillas);
        this.setBackground(Color.yellow);
        tfTurno.setText("BLANCO");
        tfTurno.setBackground(Color.WHITE);
        tfTurno.setForeground(Color.BLACK);
    }



    public void pintarCasillasNormal(JButton[][] MatrizCasillas) {
        int i, j;
        for (i = 0; i < 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6) {
                for (j = 0; j < 8; j += 2) {
                    MatrizCasillas[i][j].setBackground(Color.WHITE);
                }
            } else {
                for (j = 1; j < 8; j += 2) {
                    MatrizCasillas[i][j].setBackground(Color.WHITE);
                }
            }
        }
        for (i = 0; i < 8; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7) {
                for (j = 0; j < 8; j += 2) {
                    this.MatrizCasillas[i][j].setBackground(Color.PINK);
                }
            } else {
                for (j = 1; j < 8; j += 2) {
                    this.MatrizCasillas[i][j].setBackground(Color.PINK);
                }
            }
        }
    }



    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelCasillas = new JPanel();
        A1 = new JButton();
        B1 = new JButton();
        C1 = new JButton();
        D1 = new JButton();
        E1 = new JButton();
        F1 = new JButton();
        G1 = new JButton();
        H1 = new JButton();
        A2 = new JButton();
        B2 = new JButton();
        C2 = new JButton();
        D2 = new JButton();
        E2 = new JButton();
        F2 = new JButton();
        G2 = new JButton();
        H2 = new JButton();
        A3 = new JButton();
        B3 = new JButton();
        C3 = new JButton();
        D3 = new JButton();
        E3 = new JButton();
        F3 = new JButton();
        G3 = new JButton();
        H3 = new JButton();
        A4 = new JButton();
        B4 = new JButton();
        C4 = new JButton();
        D4 = new JButton();
        E4 = new JButton();
        F4 = new JButton();
        G4 = new JButton();
        H4 = new JButton();
        A5 = new JButton();
        B5 = new JButton();
        C5 = new JButton();
        D5 = new JButton();
        E5 = new JButton();
        F5 = new JButton();
        G5 = new JButton();
        H5 = new JButton();
        A6 = new JButton();
        B6 = new JButton();
        C6 = new JButton();
        D6 = new JButton();
        E6 = new JButton();
        F6 = new JButton();
        G6 = new JButton();
        H6 = new JButton();
        A7 = new JButton();
        B7 = new JButton();
        C7 = new JButton();
        D7 = new JButton();
        E7 = new JButton();
        F7 = new JButton();
        G7 = new JButton();
        H7 = new JButton();
        A8 = new JButton();
        B8 = new JButton();
        C8 = new JButton();
        D8 = new JButton();
        E8 = new JButton();
        F8 = new JButton();
        G8 = new JButton();
        H8 = new JButton();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jPanel3 = new JPanel();
        panelDerecho = new JPanel();
        textArea = new JTextArea();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        tfTurno = new JTextField();
        textoGuardar = new JTextField();
        btnGuardar = new JButton("Guardar");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajedrez");
        setResizable(false);

        panelCasillas.setPreferredSize(new java.awt.Dimension(400, 400));
        panelCasillas.setRequestFocusEnabled(false);
        panelCasillas.setLayout(new java.awt.GridLayout(8, 8));

        panelCasillas.add(A1);
        panelCasillas.add(B1);
        panelCasillas.add(C1);
        panelCasillas.add(D1);
        panelCasillas.add(E1);
        panelCasillas.add(F1);
        panelCasillas.add(G1);
        panelCasillas.add(H1);
        panelCasillas.add(A2);
        panelCasillas.add(B2);
        panelCasillas.add(C2);
        panelCasillas.add(D2);
        panelCasillas.add(E2);
        panelCasillas.add(F2);
        panelCasillas.add(G2);
        panelCasillas.add(H2);
        panelCasillas.add(A3);
        panelCasillas.add(B3);
        panelCasillas.add(C3);
        panelCasillas.add(D3);
        panelCasillas.add(E3);
        panelCasillas.add(F3);
        panelCasillas.add(G3);
        panelCasillas.add(H3);
        panelCasillas.add(A4);
        panelCasillas.add(B4);
        panelCasillas.add(C4);
        panelCasillas.add(D4);
        panelCasillas.add(E4);
        panelCasillas.add(F4);
        panelCasillas.add(G4);
        panelCasillas.add(H4);
        panelCasillas.add(A5);
        panelCasillas.add(B5);
        panelCasillas.add(C5);
        panelCasillas.add(D5);
        panelCasillas.add(E5);
        panelCasillas.add(F5);
        panelCasillas.add(G5);
        panelCasillas.add(H5);
        panelCasillas.add(A6);
        panelCasillas.add(B6);
        panelCasillas.add(C6);
        panelCasillas.add(D6);
        panelCasillas.add(E6);
        panelCasillas.add(F6);
        panelCasillas.add(G6);
        panelCasillas.add(H6);
        panelCasillas.add(A7);
        panelCasillas.add(B7);
        panelCasillas.add(C7);
        panelCasillas.add(D7);
        panelCasillas.add(E7);
        panelCasillas.add(F7);
        panelCasillas.add(G7);
        panelCasillas.add(H7);
        panelCasillas.add(A8);
        panelCasillas.add(B8);
        panelCasillas.add(C8);
        panelCasillas.add(D8);
        panelCasillas.add(E8);
        panelCasillas.add(F8);
        panelCasillas.add(G8);
        panelCasillas.add(H8);

        panelDerecho = new JPanel();

        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("8");
        jPanel1.add(jLabel8);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("7");
        jPanel1.add(jLabel7);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("6");
        jPanel1.add(jLabel6);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("5");
        jPanel1.add(jLabel5);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("4");
        jPanel1.add(jLabel4);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("3");
        jPanel1.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("2");
        jPanel1.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("1");
        jPanel1.add(jLabel1);


        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("a");
        jPanel3.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("b");
        jPanel3.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("c");
        jPanel3.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("d");
        jPanel3.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("e");
        jPanel3.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel14.setText("f");
        jPanel3.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel15.setText("g");
        jPanel3.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel16.setText("h");
        jPanel3.add(jLabel16);

        // Configuración del panel derecho
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
        panelDerecho.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 2),
                "Información",
                TitledBorder.CENTER,
                TitledBorder.DEFAULT_POSITION,
                new Font("Arial", Font.BOLD, 14)));
        panelDerecho.setBackground(Color.WHITE);

// Configuración del JTextArea con un JScrollPane
        textArea.setEditable(false);
        textArea.setText("Información del juego:\n");
        textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        textoGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textoGuardar.setMaximumSize(new Dimension(200, 30));

        btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnGuardar.setBackground(new Color(0, 153, 255));
        btnGuardar.setForeground(Color.WHITE);

        panelDerecho.add(Box.createVerticalStrut(10));
        panelDerecho.add(scrollPane);
        panelDerecho.add(Box.createVerticalStrut(20));

        JLabel labelGuardar = new JLabel("Nombre del archivo:");
        labelGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panelDerecho.add(labelGuardar);

        panelDerecho.add(textoGuardar);
        panelDerecho.add(Box.createVerticalStrut(10)); // Espaciado
        panelDerecho.add(btnGuardar);
        panelDerecho.add(Box.createVerticalGlue()); // Rellena el espacio inferior
        // Ajustar el diseño principal
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfTurno)
                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelCasillas, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelDerecho, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfTurno, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelCasillas, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelDerecho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    public void addController(ControladorAjedrez controlador) {
        A1.addActionListener(controlador);
        B1.addActionListener(controlador);
        C1.addActionListener(controlador);
        D1.addActionListener(controlador);
        E1.addActionListener(controlador);
        F1.addActionListener(controlador);
        G1.addActionListener(controlador);
        H1.addActionListener(controlador);

        A2.addActionListener(controlador);
        B2.addActionListener(controlador);
        C2.addActionListener(controlador);
        D2.addActionListener(controlador);
        E2.addActionListener(controlador);
        F2.addActionListener(controlador);
        G2.addActionListener(controlador);
        H2.addActionListener(controlador);

        A3.addActionListener(controlador);
        B3.addActionListener(controlador);
        C3.addActionListener(controlador);
        D3.addActionListener(controlador);
        E3.addActionListener(controlador);
        F3.addActionListener(controlador);
        G3.addActionListener(controlador);
        H3.addActionListener(controlador);

        A4.addActionListener(controlador);
        B4.addActionListener(controlador);
        C4.addActionListener(controlador);
        D4.addActionListener(controlador);
        E4.addActionListener(controlador);
        F4.addActionListener(controlador);
        G4.addActionListener(controlador);
        H4.addActionListener(controlador);

        A5.addActionListener(controlador);
        B5.addActionListener(controlador);
        C5.addActionListener(controlador);
        D5.addActionListener(controlador);
        E5.addActionListener(controlador);
        F5.addActionListener(controlador);
        G5.addActionListener(controlador);
        H5.addActionListener(controlador);

        A6.addActionListener(controlador);
        B6.addActionListener(controlador);
        C6.addActionListener(controlador);
        D6.addActionListener(controlador);
        E6.addActionListener(controlador);
        F6.addActionListener(controlador);
        G6.addActionListener(controlador);
        H6.addActionListener(controlador);

        A7.addActionListener(controlador);
        B7.addActionListener(controlador);
        C7.addActionListener(controlador);
        D7.addActionListener(controlador);
        E7.addActionListener(controlador);
        F7.addActionListener(controlador);
        G7.addActionListener(controlador);
        H7.addActionListener(controlador);

        A8.addActionListener(controlador);
        B8.addActionListener(controlador);
        C8.addActionListener(controlador);
        D8.addActionListener(controlador);
        E8.addActionListener(controlador);
        F8.addActionListener(controlador);
        G8.addActionListener(controlador);
        H8.addActionListener(controlador);
        btnGuardar.addActionListener(controlador);
    }


    public void promocionarPeon(JButton boton, boolean turnoBlanco, Ficha seleccionada) {
        String[] opciones = {"Torre", "Caballo", "Alfil", "Dama"};
        int n = JOptionPane.showOptionDialog(rootPane,
                "Tu peón llego al final del tablero, ¿en qué nueva figura quieres convertirla?",
                "Level UP", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);

        if (n >= 0 && n <= 3) {
            String color = turnoBlanco ? "w" : "b";
            String[] figuras = {"r", "n", "b", "q"};
            seleccionada.tipo = n + 2; // Torre: 2, Caballo: 3, Alfil: 4, Dama: 5
            ImageIcon icono = new ImageIcon("src/imagenes/" + color + figuras[n] + ".png");
            boton.setIcon(new ImageIcon(icono.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1)));
        }
    }


    public JTextField getTfTurno() {
        return tfTurno;
    }

    public JButton getA7() {
        return A7;
    }

    public JButton getA1() {
        return A1;
    }

    public JButton getA2() {
        return A2;
    }

    public JButton getA3() {
        return A3;
    }

    public JButton getA4() {
        return A4;
    }

    public JButton getA5() {
        return A5;
    }

    public JButton getA6() {
        return A6;
    }

    public JButton getA8() {
        return A8;
    }
    public JButton getB1() {
        return B1;
    }

    public JButton getB2() {
        return B2;
    }

    public JButton getB3() {
        return B3;
    }

    public JButton getB4() {
        return B4;
    }

    public JButton getB5() {
        return B5;
    }

    public JButton getB6() {
        return B6;
    }


    public JButton getB7() {
        return B7;
    }

    public JButton getB8() {
        return B8;
    }


    public JButton getC1() {
        return C1;
    }

    public JButton getC2() {
        return C2;
    }

    public JButton getC3() {
        return C3;
    }

    public JButton getC4() {
        return C4;
    }

    public JButton getC5() {
        return C5;
    }

    public JButton getC6() {
        return C6;
    }

    public JButton getC7() {
        return C7;
    }

    public JButton getC8() {
        return C8;
    }

    public JButton getD1() {
        return D1;
    }

    public JButton getD2() {
        return D2;
    }

    public JButton getD3() {
        return D3;
    }

    public JButton getD4() {
        return D4;
    }

    public JButton getD5() {
        return D5;
    }

    public JButton getD6() {
        return D6;
    }

    public JButton getD7() {
        return D7;
    }

    public JButton getD8() {
        return D8;
    }

    public JButton getE1() {
        return E1;
    }

    public JButton getE2() {
        return E2;
    }

    public JButton getE3() {
        return E3;
    }

    public JButton getE4() {
        return E4;
    }

    public JButton getE5() {
        return E5;
    }

    public JButton getE6() {
        return E6;
    }

    public JButton getE7() {
        return E7;
    }

    public JButton getE8() {
        return E8;
    }

    public JButton getF1() {
        return F1;
    }

    public JButton getF2() {
        return F2;
    }

    public JButton getF3() {
        return F3;
    }

    public JButton getF4() {
        return F4;
    }

    public JButton getF5() {
        return F5;
    }

    public JButton getF6() {
        return F6;
    }

    public JButton getF7() {
        return F7;
    }

    public JButton getF8() {
        return F8;
    }

    public JButton getG1() {
        return G1;
    }

    public JButton getG2() {
        return G2;
    }

    public JButton getG3() {
        return G3;
    }

    public JButton getG4() {
        return G4;
    }

    public JButton getG5() {
        return G5;
    }

    public JButton getG6() {
        return G6;
    }

    public JButton getG7() {
        return G7;
    }

    public JButton getG8() {
        return G8;
    }

    public JButton getH1() {
        return H1;
    }

    public JButton getH2() {
        return H2;
    }


    public JButton getH3() {
        return H3;
    }


    public JButton getH4() {
        return H4;
    }

    public JButton getH5() {
        return H5;
    }


    public JButton getH6() {
        return H6;
    }

    public JButton getH7() {
        return H7;
    }


    public JButton getH8() {
        return H8;
    }



    public JButton[][] getMatrizCasillas() {
        return MatrizCasillas;
    }


    public JTextArea getTextArea() {
        return textArea;
    }


    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JTextField getTextoGuardar(){
        return textoGuardar;
    }
}
