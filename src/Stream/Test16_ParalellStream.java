package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test16_ParalellStream {

    // ParalellStream  - это возможность использования нескольких ядер процессора при
    // выполнении каких либо операций со стримом
    // нужно использовать когда очень много элементов

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResalt = list.stream()
                .reduce((acumulator, element ) -> acumulator+element).get();

        System.out.println("sumResalt = "+sumResalt);

// тут джава сама рещит сколько задействовать процессоров для выполнения задачи
        double sumResalt2 = list.parallelStream()
                .reduce((acumulator, element ) -> acumulator+element).get();

        System.out.println("sumResalt = "+sumResalt2);

        double divizionResalt = list.stream()
                .reduce((acumulator, element ) -> acumulator/element).get();

        System.out.println("sumResalt = "+divizionResalt);

        double divizionResalt2 = list.parallelStream()// тут результат будет не коректным
                .reduce((acumulator, element ) -> acumulator/element).get();

        System.out.println("sumResalt = "+divizionResalt2);
    }
}
