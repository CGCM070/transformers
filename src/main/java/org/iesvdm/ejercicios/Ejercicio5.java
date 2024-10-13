package org.iesvdm.ejercicios;

import org.iesvdm.transformer.LispList;
import org.iesvdm.transformer.NumberAdder;
import org.iesvdm.transformer.Transformer;

import java.util.List;

import static org.iesvdm.transformer.Transformers.transformList;

public class Ejercicio5 {


    /**
     * Ejercicio 5
     * Escribe un método estático transformList para la clase Transformers
     * que tome un objeto Transformer y un LispList y devuelva el resultado de aplicar
     * el método transform del objeto Transformer a cada uno de los elementos en el LispList.
     * Escribe algo de código para demostrar su funcionamiento.
     *
     */

    public static void main(String[] args) {
        LispList<String> l = new LispList<>(new LispList.Cell<>("0", new LispList.Cell<>("1" ,new LispList.Cell<>("2", null))));
        Transformer<String> a = new NumberAdder(); // modifique el metodo cambiando el "("  por "-"
        List<String> lista = transformList(a, l);
        System.out.println(lista);

    }







}

