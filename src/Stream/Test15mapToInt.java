package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test15mapToInt {

    public static void main(String[] args) {

        Student st1 = new Student("MaryM", 'f', 18, 2, 8.9);
        Student st2 = new Student("Bob", 'm', 19, 3, 6.9);
        Student st3 = new Student("Tom Soer", 'm', 20, 4, 7.8);
        Student st4 = new Student("Crag", 'm', 18, 2, 5.9);
        Student st5 = new Student("Sidni", 'f', 22, 5, 9.3);

        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> coursesNumber = students.stream()
                .mapToInt(st -> st.getCourse())// можем так же по необход юзать mapToDouble...
                .boxed()// метод конвертирует значение int to Integer без него не пройдет
                .collect(Collectors.toList());

        System.out.println(coursesNumber);

        int sum = students.stream().mapToInt(st -> st.getAge()).sum();
        System.out.println(sum);// выйдет сумма возростов всех студентов

        double avarage = students.stream().mapToInt(st -> st.getAge()).average().getAsDouble();
        System.out.println(avarage);// выйдет среднее орифметичное по годам студентов

        int[] numbers = {22,11,12,4,66,88};

        double avarage2 = Arrays.stream(numbers).average().getAsDouble();
        System.out.println(avarage2);

        int min = students.stream().mapToInt(st-> st.getAge()).min().getAsInt();
        System.out.println(min);// вернет минимальный возраст студента

        int max = students.stream().mapToInt(st-> st.getAge()).max().getAsInt();
        System.out.println(max);// вернет max возраст студента
    }
}
