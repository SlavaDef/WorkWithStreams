package Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test6_MethodChaining { // цепочка методов

    public static void main(String[] args) {


        int[] arr2 = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int[] arr = {22, 99, 55, 44, 11, 77, 66, 88, 111, 222, 444, 33, 55};
        // задача отфильтровать так чтобы остались только четные числа деленные на три и посчитать их сумму

        int res = Arrays.stream(arr2)
                .filter(el -> el % 2 == 1) // відфільтровуемо нечетні цифри
                .map(el -> {
                    if (el % 3 == 0) { //тільки ті числа які діляться на три
                        el = el / 3;
                    }
                    return el;
                })
                .reduce((a,e) -> a+e) // додаємо всі єлементи
                .getAsInt();

        System.out.println(res);


        // задача имена сделать заклавными буквами, отфильтровать только девушек + сортировка по
        //  возрасту и вывод всего этого на экран

        List<Student> students = Arrays.asList(
                new Student("MaryM", 'f', 18, 2, 8.9),
                 new Student("Bob", 'm', 19, 3, 6.9),
           new Student("Tom Soer", 'm', 20, 4, 7.8),
           new Student("Crag", 'm', 18, 2, 5.9),
           new Student("Sidni", 'f', 22, 5, 9.3),
                new Student("Sonia", 'f', 20, 2, 8.5));

        students.stream()
                .map(el -> { el.setName(el.getName().toUpperCase()); // як би назнач імя возведи до верхнього регістру
                return el; } ) // і поверни його
                .filter(el -> el.getSex()=='f') // відфільтровали по sex
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(el ->System.out.println(el));


    }
}