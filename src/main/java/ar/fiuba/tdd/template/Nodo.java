package ar.fiuba.tdd.template;

class Nodo {
    private Object dato;
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

