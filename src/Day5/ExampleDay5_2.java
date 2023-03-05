package Day5;

import java.util.*;

//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
// Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
// Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу,
// которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
public class ExampleDay5_2 {
    public static void main(String[] args) {
        String names = "Иван Иванов,Светлана Петрова,Кристина Белова," +
                "Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов," +
                "Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова," +
                "Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";
        System.out.println(arrayNameStr(names));
        System.out.println(treeMap(arrayNameStr(names)));

    }
    public static ArrayList arrayNameStr (String names){
        String[] arrayNames = names.split(",");
        ArrayList<String>listNames = new ArrayList<>();
        for (int i = 0; i < arrayNames.length; i++) {
                listNames.add(arrayNames[i].split(" ")[0]);
        }

        return listNames;
    }
    public static Map treeMap(ArrayList names){
        Map<String,Integer> sortName = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            if(sortName.containsKey(names.get(i))){
                sortName.put((String) names.get(i), sortName.get(names.get(i))+1);
            }
            else {
                sortName.put((String) names.get(i),1);
            }
        }
        System.out.println(sortName);

        Map<Integer,ArrayList<String>>finList = new TreeMap<>(Comparator.reverseOrder());
            for (Map.Entry<String,Integer>entry:sortName.entrySet()){
                if(finList.containsKey(entry.getValue())){
                    List<String>list = finList.get(entry.getValue());
                    list.add(entry.getKey());
                }
                else{
                    ArrayList<String>list = new ArrayList<>();
                    list.add(entry.getKey());
                    finList.put(entry.getValue(),list );
                }
            }


        return  finList;
    }
}
