/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miinterfaz;

/**
 *
 * @author Tony
 */
public class Gato implements Sonido{ // esta clase implementa los metodos abstractois de la interfaz sonido
    public Gato(){ //constructor
        
        
        
    }

    //implementa los metodos abstractos 
    public void mauyar() {
        System.out.println("Miaw");
        
    }

   
    public void comer() {
        System.out.println("Crunch crunch");
        
    }
}
