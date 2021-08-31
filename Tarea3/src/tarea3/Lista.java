/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public abstract class Lista {

    public Lista(ArrayList<Character> elementos) {
        this.elementos = elementos;
    }
    public ArrayList<Character> elementos;
    abstract void anula(Pila p);
    abstract boolean vacia(Pila p);
    abstract int tope(Pila p);
    abstract void saca(Pila p);
    abstract void mete(char c, Pila p);    
    abstract void imprime(Pila p);
}
