package ar.fiuba.tdd.template;

class MyQueue implements Queue {
    private ListaEnlazada lista;

    MyQueue(){
        lista =new ListaEnlazada();
    }

    public boolean isEmpty(){
        return (lista.tamaño()==0);
    }
    public int size(){
        return lista.tamaño();
    }
    public void add(Object item){
        lista.addPrimero(item);
    }
    public Object top(){
        return lista.dataUltimo();
    }
    public void remove(){
        lista.removerUltimo();
    }
}
