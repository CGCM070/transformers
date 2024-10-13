package org.iesvdm.ejercicios.ejercicio7;

public class LongCheck  implements Checker<String> {
    private int longitud;

    public LongCheck(int longitud){
        this.longitud = longitud;
    }

    @Override
    public boolean check(String obj) {
        return  obj.length() > longitud;
    }
}
