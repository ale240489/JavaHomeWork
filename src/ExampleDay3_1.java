//Реализовать алгоритм сортировки слиянием
import java.util.*;

public class ExampleDay3_1 {
    public static void main(String[] args){
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(4, 6, 5));
        matrix.add(Arrays.asList(3, 2, 1));
        matrix.add(Arrays.asList(9, 8, 7));
        List<Integer>array = new ArrayList<>();
        System.out.println(matrix);

        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix.size(); j++) {
                array.add(matrix.get(i).get(j));
            };
        }
        Collections.sort(array);
        System.out.println(array);
    }
}
