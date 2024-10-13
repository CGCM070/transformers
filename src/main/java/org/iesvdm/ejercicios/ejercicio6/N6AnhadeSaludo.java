package org.iesvdm.ejercicios.ejercicio6;

import org.iesvdm.transformer.Transformer;

public class N6AnhadeSaludo implements Transformer<String> {

    /**
     * Ahora escribe una clase que generalice la clase HelloAdder permitiendo que los objetos de la clase añadan cualquier saludo a una cadena,
     * con el saludo especificado cuando se crean los objetos.
     * Escribe dos métodos de prueba que demuestren esto funcionando,
     * primero pasando objetos de esta nueva clase al método que escribiste en respuesta a la parte 2,
     * y segundo al método que escribiste en la parte 5.
     */

    private String saludo;

    public N6AnhadeSaludo(String saludo) {
        this.saludo = saludo;
    }

    @Override
    public String transform(String obj) {
        return saludo + " " + obj;
    }

}
