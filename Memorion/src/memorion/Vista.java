/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public final class Vista extends JFrame {

    private JPanel panelPrincipal;
    private Carta carta;
    private Logica logica;
    //private  ArrayList<Carta> cartas;

    private ArrayList<String> nombreCartas;
    private ControladorVista controladorVista;
    private final int NUM_CARTA = 6;

    public Vista() {

        inicializarVista();
        anadirPanel();
    }

    public void inicializarVista() {
        setSize(800, 800);

        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void anadirPanel() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(2, 3));
        panelPrincipal.setBackground(Color.BLUE);
        this.add(panelPrincipal);
    }

}
