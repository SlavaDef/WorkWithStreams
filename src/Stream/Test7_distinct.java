package Stream;

import java.util.stream.Stream;

public class Test7_distinct {

    // distinct определяет уникальные элементы с помощью equals

    public static void main(String[] args) {

        Stream<Integer> stream  = Stream.of(6,7,8,9,10,7,8,9);
          stream.distinct().forEach(System.out::println); // выведет уникальные элементы без повторов

        Stream<String> streamNames = Stream.of("Kate", "Bob", "Tom", "Kate", "Sonia", "Bob");
        streamNames.distinct().forEach(el -> System.out.print(el+" "));
    }
}
