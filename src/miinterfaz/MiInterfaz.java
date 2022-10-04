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
public class MiInterfaz { // nuestra clase principal

    public static void main(String[] args) { // nuestro metodo principal
        //instanciamos nuestros objetos para los cuales tenemos que crear una clase para cada objeto
        Gato m = new Gato();
        Perro p= new Perro();
        //mandamos a traer los diferentes metodos para cada objeto
        m.comer(); // se manda a traer cada metodo 
        m.mauyar();
        p.comer();
        p.mauyar();
        
      
    }
    
}
