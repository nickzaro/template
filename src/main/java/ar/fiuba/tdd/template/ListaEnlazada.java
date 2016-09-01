package ar.fiuba.tdd.template;

class ListaEnlazada {

    private class Nodo{
        Object dato;
        Nodo siguiente;
        Nodo(){}

        Nodo(Object o, Nodo sig){dato=o; siguiente=sig;}
        Object getDato() {
            return dato;
        }
    }

    private Nodo primero=new Nodo();
    private int cantElementos=0;

    ListaEnlazada(){}

    private Nodo ultimo()throws AssertionError {
        Nodo actual;
        for ( actual = primero; actual.siguiente.siguiente != null ; actual = actual.siguiente);
        return actual;
    }

    int tamaño() {
        return cantElementos;
    }

    void addPrimero(Object o) {
        primero = new Nodo( o, primero );
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

