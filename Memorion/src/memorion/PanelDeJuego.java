/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class PanelDeJuego extends JPanel {
     private ArrayList<String> nombreCartas;
  private  ControladorVista controladorVista;
  private  final int NUM_CARTA = 12;
  Carta carta;
  private int aciertos;
  boolean empezar;

    public PanelDeJuego() {
       
         int contador=0;
      controladorVista=new ControladorVista();
        for(int i=1;i<=(2*6);i++){
            carta = new Carta( String.valueOf(i) );            
            carta.setCarta( nombreCartas.get(contador) );
            contador++;
            contador = (contador>=nombreCartas.size())? 0:contador++;
            carta.mostarCarta();
            carta.addMouseListener( controladorVista);    
            this.add( carta );
        

    }
    }
    
    
    public void empezarJueo(){
          aciertos=0;
        empezar=true;
        Component[] componentes = this.getComponents();         
        //limpia banderas
        for( int i=0; i< componentes.length ;i++){
            ((Carta)componentes[i]).congelarImagen(false);
            ((Carta)componentes[i]).ocultarCarta();
            ((Carta)componentes[i]).setCarta( "" );
        }
        //coloca nuevo orden aleatorio de cartas
        for( int i=0; i< componentes.length ;i++){
            int n = (int) (Math.random()*(nombreCartas.size()));        
        } 
        
    }


private boolean existe( String bandera ){  
        int contador=0;
        Component[] componentes = this.getComponents(); 
        for( int i=0; i<componentes.length;i++ ) {
            if( componentes[i] instanceof Carta ) {
                if( ((Carta)componentes[i]).getNameBandera().equals( carta ) ) {
                    contador++;
                }
            }
        }        
        if(contador==2)
            return true;
        else
            return false;
    }

    public boolean isEmpezar() {
        return empezar;
    }


    
   
    
}
