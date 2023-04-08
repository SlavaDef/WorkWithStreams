package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5_sorted {

    public static void main(String[] args) {

        int[] arr = {22,99,55,44,11,77,66,88};
// sorted() сортирует, toArray() возврат обратно из стрима в массив
        int [] arr2 = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr2));

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
        // тобеж по какому критерию сортировать
        // також можемо відсортувати по іншим параметрам -> sex, age, course чи avg
        students = students.stream()
                .sorted((x,y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());

        System.out.println(students);
    }
}
