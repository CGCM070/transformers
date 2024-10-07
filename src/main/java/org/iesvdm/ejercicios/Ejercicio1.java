package org.iesvdm.ejercicios;

import org.iesvdm.transformer.TenTimes;
import org.iesvdm.transformer.Transformer;
import org.iesvdm.transformer.Transformers;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Exercise N1
         * Modify the class Transformers so that it contains a static method applyConst
         * which takes a Transformer object and an ArrayList object as arguments and returns a new
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++)
            a.add(new Integer(numbers[i]));
        System.out.println("The numbers are stored in an ArrayList: " + a);
        Transformer<Integer> trans = new TenTimes();
        ArrayList<Integer> b = Transformers.applyConst(trans, a);
        System.out.println("Multiplying the contents by 10 gives: " + b);


    }
}
