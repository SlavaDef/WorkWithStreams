package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test12_findFirst {

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

       Student first = students.stream()
                .map(el -> { el.setName(el.getName().toUpperCase()); // як би назнач імя возведи до верхнього регістру
                    return el; } ) // і поверни його
                .filter(el -> el.getSex()=='f') // відфільтровали по sex
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get(); // findFirst() вернет первое вхождение

       System.out.println(first);


    }
}
