package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2_Filter {

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
          // сортировка студентов + потом обратно збор в колекцию в сорте прописываем логику
        students = students.stream()
                .sorted()
                .collect(Collectors.toList());

        // задача 1 отфильтровать студентов возрост которых больше 18 и средняя оценка больше 7

        students = students.stream()
                .filter(st -> st.getAge()<19 && st.getAvgGrade()>5) // st как бы студент
                .collect(Collectors.toList());
        System.out.println(students);
        // фильтр в отличии от меп поменяет колекцию

        // стрим с нуля ->

        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
        // далее как в примере выще

    }
}
