package org.iesvdm.ejercicios;


import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Joiners;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {

    /**
     * Combina dos ArrayLists usando un Joiner.
     * <p>
     * 1. Declaramos un método estático y genérico.
     * 2. Inicializamos el ArrayList de resultados.
     * 3. Determinamos el tamaño de la lista más pequeña.
     * 4. Iteramos y combinamos elementos usando el Joiner.
     * 5. Retornamos el resultado combinado.
     */


    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> l1, ArrayList<T> l2) {
        ArrayList<T> result = new ArrayList<>();
        int size = Math.min(l1.size(), l2.size());
        for (int i = 0; i < size; i++) {
            result.add(joiner.join(l1.get(i), l2.get(i)));
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(5, 4, 3, 2));

        Joiner<Integer> adder = new JoinByAdding();
        ArrayList<Integer> result = Joiners.zipArrayLists(adder, l1, l2);

        System.out.println("Result: " + result);
    }


}

