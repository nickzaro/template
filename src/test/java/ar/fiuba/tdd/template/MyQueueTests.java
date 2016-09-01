package ar.fiuba.tdd.template;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyQueueTests {
    @Test
    public void testIsEmpty(){
        MyQueue cola=new MyQueue();
        assertEquals(cola.isEmpty(),true);
    }

    @Test
    public void testSize(){
        MyQueue cola=new MyQueue();
        cola.add(1);
        cola.add(15);
        assertEquals(cola.size(),2);
    }

    @Test
    public void testAdd(){
        MyQueue cola=new MyQueue();
        cola.add(4);
        assertEquals(cola.top(),4);
    }
    @Test
    public void testTop(){
        MyQueue cola=new MyQueue();
        cola.add(1);
        cola.add(2);
        assertEquals(cola.top(),1);
    }
    @Test
    public void testRemove(){
        MyQueue cola=new MyQueue();
        cola.add(1);
        cola.add(2);
        cola.remove();
        assertEquals(cola.top(),2);
    }

}
