package Day4;

import java.util.Collections;
import java.util.LinkedList;

public class ExampleDay4_1 {
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.
        // Постараться не обращаться к листу по индексам.

        LinkedList<Integer> my_ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            my_ll.add(i + 1);
        }
        System.out.println(my_ll);
        System.out.println(revers(my_ll));

    }
    static LinkedList revers (LinkedList my_ll){
        Collections.reverse(my_ll);
        return my_ll;
    }
}
