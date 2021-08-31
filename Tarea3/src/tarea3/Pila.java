/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pila extends Lista {

    Scanner input = new Scanner(System.in);
    int tope = -1;

    public Pila(ArrayList<Character> elementos) {
        super(elementos);
    }

    @Override
    void anula(Pila p) {
        p.elementos.clear();
    }

    @Override
    boolean vacia(Pila p) {
        boolean bool;
        bool = p.elementos.isEmpty();
        return bool;
    }

    @Override
    int tope(Pila p) {
        if (p.vacia(p)) {
            System.out.println("La pila esta vacia");
            return 0;
        } else {
            return p.elementos.size();
        }
    }

    @Override
    void saca(Pila p) {
        if (p.vacia(p)) {
            System.out.println("La pila esta vacia");
        } else {
            p.elementos.remove(p.elementos.size()-1);
        }
    }

    @Override
    void mete(char c, Pila p) {
        p.elementos.add(c);
    }

    @Override
    void imprime(Pila p) {
        String cad = "";
        if (!p.vacia(p)) {
            for (int i = 0; i < elementos.size(); i++) {
                cad += elementos.get(i).toString();
            }
            System.out.println(cad);
        }else{
            System.out.println("La Pila esta vacia");
        }
    }
}
