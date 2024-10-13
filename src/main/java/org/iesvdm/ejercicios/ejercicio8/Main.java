package org.iesvdm.ejercicios.ejercicio8;

import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Joiners;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        /**
         * Ejercicio 8
         * crea una clase JoinerS que implemente Joiner<String> y que tenga un método join que concatene dos strings con un espacio en blanco.Ç
         * En caso de que se le pase una lista de strings, el método fold de Joiners debería devolver un string con todos los elementos concatenados con un espacio en blanco.
         * En caso de que se le pase una lista de enteros, el método fold de Joiners debería devolver un entero con la suma de todos los elementos.
         */

        ArrayList<String> list = new ArrayList<>(asList("Hola", "que", "tal", "estas"));
        JoinerS joiner = new JoinerS();
        System.out.println(Joiners.fold(joiner, list));

        ArrayList<Integer> list2 = new ArrayList<>(asList(1, 2, 3));
        Joiner joiner2 = new JoinByAdding();
        System.out.println(Joiners.fold(joiner2, list2));


    }
}
