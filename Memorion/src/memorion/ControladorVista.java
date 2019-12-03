/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author User
 */
public class ControladorVista implements MouseListener {
    
    private Vista vista;
    private PanelDeJuego panelDeJuego;
            Carta carta1;
            Carta carta2;
                int c=0;


    public ControladorVista() {
        
    }
    
    

    

    @Override
    public void mouseClicked(MouseEvent me) {
        if( panelDeJuego.empezar ){
                c++;//lleva la cuenta de los click realizados en las casillas            
                if( c==1 ){ //primer click
                    carta1=((Carta) me.getSource()); //obtiene objeto
                    if( !carta1.isCongelado() ){
                        carta1.mostarCarta();
                      //  System.out.println("Primera Bandera: " + c1.getNameBandera() );    
                    }else{//no toma en cuenta
                      c=0;   
                    }                
                }else if( c==2 && !carta1.getName().equals( ((Carta) me.getSource()).getName() ) ){//segundo click
                    carta2=((Carta) me.getSource()); 
                    if( !carta2.isCongelado() ){
                        carta2.mostarCarta();
                       // System.out.println("Segunda Bandera: " + c2.getNameBandera() );    
                        //compara imagenes
                       // Animacion ani = new Animacion( c1, c2 );
                        //ani.execute();
                    }
                    c=0;//contador de click a 0
                }else{ //mas de 2 clic consecutivos no toma en cuenta
                    c=0; 
                }
            }else{
                System.out.println("aaa");
            }
            
            
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
