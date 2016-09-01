package ar.fiuba.tdd.template;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ListaEnlazadaTests {

    @Test
    public void testVacia() {
        ListaEnlazada lista = new ListaEnlazada();
        assertEquals(lista.tamanio(), 0);
    }

    @Test
    public void testAgregarPrimero() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.addPrimero(1);
        lista.addPrimero(2);
        assertEquals(lista.dataUltimo(), 1);
    }

    @Test
    public void testDataUltimo() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.addPrimero(10);
        assertEquals(lista.dataUltimo(), 10);
    }

    @Test
    public void testRemoverUltimo() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.addPrimero(1);
        lista.addPrimero(2);
        lista.addPrimero(3);
        lista.removerUltimo();
        lista.removerUltimo();
        assertEquals(lista.dataUltimo(), 3);

    }
}
