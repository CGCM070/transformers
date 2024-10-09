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
     */

    /**
     * The static method applyConst in the class Transformers works constructively. Add a static
     * method applyDest to the class Transformers which works similarly to applyConst but
     * destructively rather than constructively (that is, it changes its ArrayList argument rather than
     * constructing and returning a new one).
     */

    /**
     * We modify the ArrayList a in place, applying the transformation to each element.
     */
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        for (int i = 0; i < a.size(); i++)
            a.set(i, tran.transform(a.get(i)));
    }










}

