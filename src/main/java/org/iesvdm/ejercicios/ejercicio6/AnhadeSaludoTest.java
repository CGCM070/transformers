package org.iesvdm.ejercicios.ejercicio6;

import org.iesvdm.transformer.LispList;
import org.iesvdm.transformer.Transformers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnhadeSaludoTest {

    /**
     * La clase N6AnhadeSaludo implementa la interfaz Transformer.
     * que añade un saludo a una cadena.
     * lista esperada = ["Hola Juan", "Hola Pedro", "Hola Luis"]
     * @param = "Hola"
     * @result listaAnhadida = ["Hola Juan", "Hola Pedro", "Hola Luis"]
     */

    @Test
    public void testTransformList() {
        LispList<String> l = new LispList<>(new LispList.Cell<>("Juan", new LispList.Cell<>("Pedro", new LispList.Cell<>("Luis", null))));
        N6AnhadeSaludo saludo = new N6AnhadeSaludo("Hola");
        List<String> listaAnhadida = Transformers.transformList(saludo, l);
        assertEquals(Arrays.asList("Hola Juan", "Hola Pedro", "Hola Luis"), listaAnhadida);
    }

}