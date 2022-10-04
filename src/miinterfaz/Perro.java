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
public class Perro implements Sonido{
    public Perro(){// constructor 
        
    }
//implementar metodos abstractos de la interfaz
    @Override
    public void mauyar() {
        System.out.println("guau");
    }

    @Override
    public void comer() {
            System.out.println("jajajdofjewp");
    }
    
}
