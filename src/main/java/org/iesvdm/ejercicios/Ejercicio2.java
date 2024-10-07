package org.iesvdm.ejercicios;

import org.iesvdm.transformer.TenTimes;
import org.iesvdm.transformer.Transformer;
import org.iesvdm.transformer.Transformers;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /**
         *Exercise 2: Modify the main method of the class UseTransformers1 so that it reads a line of
         */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input2.nextLine();
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<>();
        for (String number : numbers) {
            a.add(Integer.parseInt(number));
        }
        System.out.println("The numbers are stored in an ArrayList: " + a);

        Transformer<Integer> trans = new TenTimes();
        Transformers.applyDest(trans, a);
        System.out.println("Multiplying the contents by 10 gives: " + a);

        /**
         *         public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
         *             for (int i = 0; i < a.size(); i++)
         *             a.set(i, tran.transform(a.get(i)));
         *         }
         */
    }

}

