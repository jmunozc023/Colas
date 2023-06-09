/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author josep
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola c =new Cola();
        c.insertar(8);
        c.insertar(9);
        c.insertar(7);
        
        System.out.println("El valor es: "+c.eliminar());
        c.insertar(10);
        System.out.println("El valor es: "+c.inicio.dato);
        System.out.println("El valor es: "+c.fin.dato);
        c.mostrarCola();
    }
    
}
