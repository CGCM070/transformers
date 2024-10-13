package org.iesvdm.ejercicios.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        /**
         *ParCheck es un Checker<Integer> que elimina los elementos de un ArrayList<Integer> que no sean pares.
         * LongCheck es un Checker<String> que elimina los elementos de un ArrayList<String> que no tengan una longitud mayor que un valor dado.
         * CheckUtils es una clase que contiene un método estático check que recibe un Checker
         * y un ArrayList y elimina los elementos que no cumplan la condición del Checker.
         */


        ArrayList<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<String> listaStrings = new ArrayList<>(Arrays.asList("FreddyMercury", "BrianMay", "RogerTaylor", "JohnDeacon"));

        CheckUtils.check(new ParCheck(), listaEnteros);
        CheckUtils.check(new LongCheck(10), listaStrings);

        System.out.println(listaEnteros);
        System.out.println(listaStrings);



    }
}
