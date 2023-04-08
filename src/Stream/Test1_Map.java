package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1_Map {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("World");
        list.add("on");
        list.add("fire");
        list.add("and");
        list.add("woter");

        System.out.println(list);

      /*  for(int i =0; i<list.size();i++){ // вместо текста теперь лист содержит длинну этого слова
            list.set( i, String.valueOf(list.get(i).length()) );// String.valueOf поможет представить число как строку
        }
        System.out.println(list); */
        // или так с помощью стримов

// map()  поочередно возмет каждый эдемент колекции и применит к нему действия прописанные в лямде
// получиться поток (сразу присвоить не выйдет) затем мы преобразуем этот поток в колекцию
// благодаря методу collect() и потом во что нужно Collectors.toList(), String, map....
// стримы и методы не меняют колекцию а создаеться новая

        List<Integer> list2 =  list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list2);

        int[] arr = {3, 5, 7, 9, 12};

       arr =  Arrays.stream(arr) // получаем таким образом стрим из массива и далее юзаем методы стрима
                .map(elm -> { if(elm % 3 == 0){ // пишем лямду, если элемент делиться на три
                   elm = elm/3; // делим его на 3 и присваевыем нов значение
                }
                return elm;
                        }).toArray();
       System.out.println(Arrays.toString(arr)); // вывод изменившегося масива


        Set<String> set = new TreeSet<>(); // три сет отсортирует
        set.add("one2");
        set.add("two");
        set.add("three");
        set.add("six4444");
        System.out.println(set); // будет отсортирован по буквам [one, six, three, two]

        Set<Integer> set2 = set.stream()
                .map(el -> el.length()) //в методе добываем длянну каждого элемента
                .collect(Collectors.toSet());// собираем в колекцию
        System.out.println(set2);

        List<Integer> list5 = set.stream()
                .map(el -> el.length()) //в методе добываем длянну каждого элемента
                .collect(Collectors.toList());// собираем в колекцию уже в лист
        System.out.println(list5);

    }

  /* public int sum(int n){
       Integer resalt = Stream.iterate(0, i -> i+n).limit(n);


        return resalt;
    } */
}
