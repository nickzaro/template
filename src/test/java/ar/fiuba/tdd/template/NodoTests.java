package ar.fiuba.tdd.template;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NodoTests {

    @Test
    public void testGetDato() {
        Nodo nodo = new Nodo(5, null);
        assertEquals(nodo.getDato(), 5);
    }
}
