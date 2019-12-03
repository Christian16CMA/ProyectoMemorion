/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorion;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Logica {
     //Logica
    
 
    ArrayList <Carta> cartas;
 

    public Logica(ControladorVista controladorVista) {
        cartas=new ArrayList();
    }
    
    
    public void iniciarJuego(Carta carta){
        carta=new Carta();
        cartas.add(carta);
    }
    
   
    
}
