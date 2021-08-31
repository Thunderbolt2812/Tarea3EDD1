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
public class Tarea3 {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Character> elementos = new ArrayList<>();
        Pila P = new Pila(elementos);
        System.out.println("Ingrese la cadena de caracteres");
        String cad = input.nextLine();
        for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            P.mete(c, P);
        }
        Editor E = new Editor(P);
        E.edita();
    }
}
