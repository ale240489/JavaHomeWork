import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class ExampleDay3_2 {
    public static void main(String[] args){
        Random rnd = new Random();
        ArrayList<Integer>array = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            int num = rnd.nextInt(2, 100);
            array.add(num);
        }
        System.out.println(array);

        for(int i = 0; i < array.size(); i++)
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        System.out.println(array);
    }

}

