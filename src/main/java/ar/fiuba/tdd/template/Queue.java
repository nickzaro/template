package ar.fiuba.tdd.template;

interface Queue {

        boolean isEmpty();
        int size();
        void add(Object item); // agrega un item a la cola
        Object top(); // retornar el primer item, o lanzar exception si esta vacío
        void remove(); // remover el primer item, o lanzar exception si esta vacío
}
