package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test13_min_max {

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

        Student min = students.stream()
                .min((x,y) -> x.getAge() - y.getAge()).get(); // принимает компоратор нужно указать критерии минимума
        Student max = students.stream()
                .max((x,y) -> x.getAge() - y.getAge()).get();

        System.out.println(min); // самый младший студент
        System.out.println(max); // самый старший студент
    }
}
