package ar.fiuba.tdd.template;

class ListaEnlazada {

    private Nodo primero = new Nodo();
    private int cantElementos = 0;

    ListaEnlazada() {
    }

    private Nodo ultimo() throws AssertionError {
        Nodo actual;
        if (cantElementos > 0) {
            for (actual = primero; actual.siguiente.siguiente != null; actual = actual.siguiente) {
            }
            return actual;
        } else {
            throw new AssertionError();
        }
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

