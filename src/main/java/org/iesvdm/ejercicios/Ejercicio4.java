package org.iesvdm.ejercicios;


import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {

    /**
     * Escribe un método estático zipArrayLists para la clase Joiners que tome
     * dos ArrayLists y produzca un tercero uniendo sus contenidos según un argumento Joiner,
     * similar a la forma en que funciona zipLists. Escribe un código para demostrar su funcionamiento.
     */

    /**
     * Combina dos ArrayLists usando un Joiner.
     * <p>
     * 1. Declaramos un método estático y genérico.
     * 2. Inicializamos el ArrayList de resultados.
     * 3. Determinamos el tamaño de la lista más pequeña.
     * 4. Iteramos y combinamos elementos usando el Joiner.
     * 5. Retornamos el resultado combinado.
     */

    public class Joiners {
        public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> list1, ArrayList<T> list2) {
            ArrayList<T> result = new ArrayList<>();
            int size = Math.min(list1.size(), list2.size());
            System.out.println("zize :  " + size);
            for (int i = 0; i < size; i++) {
                result.add(joiner.join(list1.get(i), list2.get(i)));
            }
            return result;
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(5, 4, 3, 2));

        Joiner<Integer> adder = new JoinByAdding();
        ArrayList<Integer> result = Joiners.zipArrayLists(adder, l1, l2);

        System.out.println("Result: " + result);
    }


}

