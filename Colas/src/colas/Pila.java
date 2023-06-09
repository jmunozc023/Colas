/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author josep
 */
public class Pila {
    private int cima;
    private int vectorPila[];
    public Pila(int tamano){
        vectorPila= new int[tamano];
        cima=0;
    }
    /*public void inicializarPila(int tamano){
        vectorPila=new int[tamano];
    }*/
    public void push(int dato){
        vectorPila[cima]=dato;
        cima++;
    }
    public int pop(){
        int eliminar =0;
        if (cima==0) {
            System.out.println("pila vacia");
        } else {
            eliminar = vectorPila[cima-1];
            cima--;
        }
        return eliminar;
    }
    public int tamano(){
        return vectorPila.length;
    }
    public boolean pilaVacia(){
        if (cima==0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean pilaLlena(int tamano){
        if (cima==tamano) {
            return true;
        } else {
            return false;
        }
    }
    public void mostrarPila(){
        while (pilaVacia()==false) {
            int aux= pop();
            System.out.println(aux);
        }
    }
    public void extFondo(){
        int aux=0;
        while (pilaVacia()==false) {
            aux= pop();
        }
        System.out.println(aux);
    }
    public void pasarDatos(){
        int aux=0;
        Pila pilaDos= new Pila(tamano());
        while (pilaVacia()==false) {
            aux= pop();
            if (pilaDos.pilaLlena(tamano())==false) {
                pilaDos.push(aux);
            } else {
                System.out.println("Esta llena");
            }
        }
    }

}
