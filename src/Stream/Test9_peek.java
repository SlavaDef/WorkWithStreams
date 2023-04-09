package Stream;

import java.util.stream.Stream;

public class Test9_peek {
    public static void main(String[] args) {
        Stream<Integer> stream  = Stream.of(6,7,8,9,10,7,8,9);
// peek практически аналог метода forEach нужен для просмотра промежуточных операций но
        // он не терминальный метод в отличии от forEach и на разных этапах может помоч просмотреть
        // что происходит в стриме
        System.out.println(stream.distinct().peek(System.out::print).count());
    }
}
