package Day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор
public class ExampleDay4_3 {
    public static void main(String[] args) {
        LinkedList<Integer> my_linkList = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            my_linkList.add(rnd.nextInt(1, 20));
        }
        System.out.println(my_linkList);
        System.out.println(sumList(my_linkList));
        System.out.println(my_linkList);
    }

    public static int sumList (LinkedList my_list){
        int sum = 0;
        Iterator<Integer> iter = my_list.iterator();
        while (iter.hasNext()){
            sum += iter.next();
        }
        return sum;
    }
}
