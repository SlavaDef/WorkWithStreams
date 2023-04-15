package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test14_limit {

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

        students.stream()
                .filter(st -> st.getAge()>18)// відфільтрує студентів тільки яким більше 18
                .limit(2) // встановили ліміт виводу 2 студентів
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        students.stream()
                .filter(st -> st.getAge()>17)// відфільтрує студентів тільки яким більше 18
                .skip(2) // пропусте перших двух і виведе залишившихся
                .forEach(System.out::println);
    }
}
