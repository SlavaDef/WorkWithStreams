package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test3_forEach {

    public static void main(String[] args) {

        int [] arr = {66, 88, 55,22,13};
// из масива получаем стрим ->  Arrays.stream(arr)
        // forEach() вернет void в колекцию уже не запишем

        Arrays.stream(arr)
                .forEach(el -> { el *= 2; // логiка в forEach пишеться в {} скобках
                System.out.print(el+" ");}
                );

        Arrays.stream(arr)
                .forEach(el -> System.out.print(el+" ")); // просто вывод масива без цикла
        // аналогично можем упростить если переменная одна
        Arrays.stream(arr).forEach(System.out::print); // так же выведет каждый элемент стрима
        // тут уже передаем в стрим клас и его метод тобеж каждый элемент потока помести в метод
        // и заюзав метод выведи все это в результате добавим 5 к каждому элементу массива
        // как бы ссылка на метод metod referense
        Arrays.stream(arr).forEach(Utils::method);// or same variant forEach(el -> Utils.method(el))

    }
}

class Utils{

    public static void method(int a){
        a = a+5;
        System.out.println("Element = " + a);
    }
}
