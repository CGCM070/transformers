package org.iesvdm.ejercicios.ejercicio7;

public class ParCheck implements Checker<Integer> {

    @Override
    public boolean check(Integer obj) {
        return obj % 2 == 0;
    }
}
