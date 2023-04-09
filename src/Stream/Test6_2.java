package Stream;

import java.util.stream.Stream;

public class Test6_2 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,1,2,3);
        stream1
                .filter(el -> { System.out.println("!!!!");
                    return el%2==0; // якщо на цьому все залишити то метод не обробиться бо тема термінального методу
        });

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3  = Stream.of(6,7,8,9,10);
        //concat як би обьеднує два стріма після нього не визиваються методи но він і не термінальний
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        stream4.forEach(el -> System.out.print(el + " "));
        // stream4.forEach(System.out::print); // чи так
    }


}
