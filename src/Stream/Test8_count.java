package Stream;

import java.util.stream.Stream;

public class Test8_count {

    // терминальный метод считает количество элементов в стриме, return long

    public static void main(String[] args) {
        Stream<Integer> stream  = Stream.of(6,7,8,9,10,7,8,9);
        // System.out.println(stream.count()); // return 8 because we have eight element
        Stream<String> streamNames = Stream.of("Kate", "Bob", "Tom", "Kate", "Sonia", "Bob");
        System.out.println(streamNames.count());
        // стрим после обработки нельзя использовать или получим исключение
        System.out.println(stream.distinct().count());// выведет сколько уникальных элементов в стриме
    }
}
