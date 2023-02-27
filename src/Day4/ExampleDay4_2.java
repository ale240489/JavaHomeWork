package Day4;

import java.lang.reflect.Array;
import java.util.*;

public class ExampleDay4_2 {
    public static void main(String[] args) {
        //Реализуйте очередь с помощью LinkedList со следующими методами:
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.
        MyQueue queue = new MyQueue();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10 );
        System.out.println(queue.first());
        queue.print();

    }
}
