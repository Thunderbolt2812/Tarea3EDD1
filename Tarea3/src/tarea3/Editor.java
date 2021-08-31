/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Editor {

    Pila p;

    public Editor(Pila p) {
        this.p = p;
    }

    void edita() {
        String str = "";
        for (int i = 0; i < p.elementos.size(); i++) {
            str += p.elementos.get(i).toString();
        }
        p.anula(p);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '#':
                    p.saca(p);
                    break;
                case '@':
                    p.anula(p);
                    break;
                default:
                    p.mete(c, p);
                    break;
            }
        }
        System.out.println("");
        System.out.println("Pila Editada");
        p.imprime(p);
    }
}
