/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author josep
 */
public class Cola {

    NodoCola inicio, fin;
    int tama;

    public void limpiarCola() {
        inicio = fin = null;
        tama = 0;
    }

    public boolean ColaVacia() {
        return inicio == null;
    }

    public void insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (ColaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }

    public int eliminar() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tama--;
        return aux;
    }

    public int inicioCola() {
        return inicio.dato;
    }
    public int finCola(){
        return fin.dato;
    }

    public int tamanoCola() {
        return tama;
    }
    
    public void mostrarCola(){
        while (ColaVacia()==false) {            
            int aux = inicioCola();
            eliminar();
            System.out.println(aux);
        }
    }
    public void mostrarColaDos(){
        NodoCola recorrido= inicio;
        while (recorrido != null) {            
            System.out.println(recorrido.dato);
            recorrido=recorrido.siguiente;
        }
    }

}
