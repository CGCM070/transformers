package org.iesvdm.ejercicios.ejercicio8;

import org.iesvdm.transformer.Joiner;

public class JoinerS implements Joiner<String> {


    @Override
    public String join(String obj1, String obj2) {
        return obj1 + " " + obj2;
    }
}
