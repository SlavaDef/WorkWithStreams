package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4_reduse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        // acumulator - акамулирует в себя сумму которая далее с помощью метода get() помещаеться в resalt

        int resalt = list.stream().reduce((acumulator, elm) -> acumulator + elm).get();
        System.out.println(resalt);

        List<Integer> list22 = new ArrayList<>(); // пустий лист
        Optional<Integer> o  = list22.stream().reduce((acumulator, elm) -> acumulator + elm);

           if(o.isPresent()){ // якщо є числа то друкуемо їх, ні так еррор
          System.out.println(o.get());
         }
           else {
               System.out.println("Error");
           }
// теперь добавив 1 elm = первому значению из листа, а не нулю как в прошлом примере
        // .get() не используеться уже
        int resalt2 = list.stream().reduce(1,(acumulator, elm) -> acumulator + elm);
        System.out.println(resalt2);

        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("from");
        list3.add("the");
        list3.add("Kiev");

// в цьому прикладі сконтатенируем строки з листа

        String res = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(res);


 System.out.println(new Test4_reduse().sum(6));
    }
    public int sum(int n){ // метод поверне суму чисел від 0 до n
         return  IntStream.rangeClosed(0,n).sum();
       // return IntStream.range(1,n+1).sum();
    }
}
