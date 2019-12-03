/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Carta extends JLabel {
    /*
    // private final String RUTA="imgpractica/";
    //private final String EXTENSION_IMAGEN=".PNG";
    int posX;
    int posY;
    private ImageIcon cartaImagen;
    private String nombreCarta ;
    private boolean dadoVuelta = false;
    private ArrayList<String> imagenes= new ArrayList<String>();
    ControladorCarta controladorCarta;

    public ImageIcon getCartaImagen() {
        return cartaImagen;
    }

    public boolean isDadoVuelta() {
        return dadoVuelta;
    }

    public ArrayList<String> getImagenes() {
        return imagenes;
    }
    

    public Carta() {
        super();
       
        anadirImagenes();
        eligirImagenAlAzar();
        this.addMouseListener(controladorCarta);

    }

    public void pintarCarta(Graphics g) {
       
        super.paintComponents(g);
        g.setColor(Color.red);
        g.fillRect(0, 0, getWidth(), getHeight());
        if (dadoVuelta) {
            g.drawImage(cartaImagen.getImage(), 0, 0, this);
            
        }else{
            g.fillRect(0, 0, getWidth(), getHeight());
        }

    }

    public void anadirImagenes() {
       
       imagenes.add("imgpractica/Dhd.png");
       imagenes.add("imgpractica/Link.png");
       imagenes.add("imgpractica/Mario-Bros.png");
               
        
      

    }
    
    public void eligirImagenAlAzar(){
        int numeroAleatorio=(int) Math.floor(Math.random()*(imagenes.size()));
        String dondeEstaImagen=imagenes.get(numeroAleatorio);
        cartaImagen=new ImageIcon(getClass().getResource(dondeEstaImagen));
        
    }

    public void ocultarImagen(){
        if( !dadoVuelta ){
            repaint();
        }
    }
    
    
   */
    
    
    
    
   
    
    private int ancho=140;
    private int alto=140;
   private ImageIcon dorso = new ImageIcon(getClass().getResource("/imgpractica/dorso.PNG"));
    private ImageIcon carta;
    private String nombreCarta="";
    private boolean dadoVuelta=false;
    
     /** 
      * constructor de clase
      * @param name String El nomnbre de instancia
      */
    public Carta( String nombreCarta ){
        super();
        
        setName(nombreCarta);
        setSize( 100,100);
        
                    
        setIcon( dorso );
        setVisible(true);        
        setOpaque(true);
       
    }

    Carta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /** 
     * Muestra la imagen dentro del label
     * @return no tiene
     */
    public void mostarCarta(){
        setIcon( carta );
    }
    
    /**
     * Oculta la carta
     * @return no tiene
     */
    public void ocultarCarta(){
        if( !dadoVuelta ){
            setIcon( dorso );
        }
    }
    
    /**
     * Cuando una imagen es congelada, no se puede volver a ocultar hasta comenzar un nuevo juego
     * @param value boolean
     */
    public void congelarImagen(boolean valor){
        this.dadoVuelta=valor;
    }
    
    /**
     * Metodo que retorna el valor boolean de una casilla si este esta o no congelado
     * @return boolean 
     */
    public boolean isCongelado(){
        return this.dadoVuelta;
    }
    
    /**
     * Asigna la bandera que contendra la casilla
     * @param nombreCarta nombre de la bandera
     */
    public void setCarta( String nombreCarta ){
        this.nombreCarta = nombreCarta;
        if( !nombreCarta.equals("") ){            
            carta = new ImageIcon(getClass().getResource("imgpractica"+nombreCarta+".PNG"));        
        }        
    }
    
    /**
     * Devuelve el nombre de la carta y si no tiene devuelve una cadena vacia
     * 
     * @return String 
     */
    public String getNameBandera(){
        return nombreCarta;
    }

  
    
}

    
    

