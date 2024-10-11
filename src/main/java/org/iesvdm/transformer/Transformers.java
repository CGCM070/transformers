package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers {

    /**
     * Exercise N1
     * Modify the class Transformers so that it contains a static method applyConst
     * which takes a Transformer object and an ArrayList object as arguments and returns a new
     */
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<>();
        for (T t : a)
            b.add(tran.transform(t));
        return b;
    }



    /**
     * Exercise N2
     *
     * El método estático applyConst en la clase Transformers funciona de manera constructiva. Agrega un método estático
     * applyDest a la clase Transformers que funcione de manera similar a applyConst pero de manera destructiva en lugar de constructiva
     * (es decir, que cambie su argumento ArrayList en lugar de construir y devolver uno nuevo).
     */

    /**
     * Modificamos el ArrayList a en su lugar, aplicando la transformación a cada elemento.
     */

    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        for (int i = 0; i < a.size(); i++)
            a.set(i, tran.transform(a.get(i)));
    }


    /***
     * Exercise N3 -> La explicación de este ejercicio se encuentra en la clase Ejercicio3.java
     */

}

