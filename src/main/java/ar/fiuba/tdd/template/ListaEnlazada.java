package ar.fiuba.tdd.template;

class ListaEnlazada {

    private class Nodo {
        Object dato;
        Nodo siguiente;

        Nodo() {
        }

        Nodo(Object objeto, Nodo sig) {
            dato = objeto;
            siguiente = sig;
        }

        Object getDato() {
            return dato;
        }
    }

    private Nodo primero = new Nodo();
    private int cantElementos = 0;

    ListaEnlazada() {
    }

    private Nodo ultimo() throws AssertionError {
        Nodo actual;
        for (actual = primero; actual.siguiente.siguiente != null; actual = actual.siguiente) {}
        return actual;
    }

    int tamanio() {
        return cantElementos;
    }

    void addPrimero(Object objeto) {
        primero = new Nodo(objeto, primero);
        cantElementos++;
    }

    Object dataUltimo() {
        return ultimo().getDato();
    }

    // remueve de la lista el primero que se agrego
    void removerUltimo() {
        ultimo().siguiente = null;
        cantElementos--;
    }
}

