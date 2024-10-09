package org.iesvdm.ejercicios;


import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {

    /***
     * Write a static method zipArrayLists to go in class Joiners which takes
     * two ArrayLists and produces a third one joining their contents according to a Joiner argument,
     * similar to the way zipLists works. Write some code to demonstrate it working.
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

