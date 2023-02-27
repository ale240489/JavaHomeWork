package Day4;

import java.util.LinkedList;

public class MyQueue {
    ////Реализуйте очередь с помощью LinkedList со следующими методами:
    //        // enqueue() - помещает элемент в конец очереди,
    //        // dequeue() - возвращает первый элемент из очереди и удаляет его,
    //        // first() - возвращает первый элемент из очереди, не удаляя.
    LinkedList<Integer>my_list = new LinkedList<>();

    void enqueue(int num){
        my_list.add(num);
    }

    int dequeue(){
        return my_list.pop();
    }

    int first(){
        return my_list.getFirst();
    }

    public void print(){
        System.out.println(my_list);;
        }

}
