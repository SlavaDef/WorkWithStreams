package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test11_collector {

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

        Student st11 = new Student("MaryM", 'f', 18, 2, 8.9);
        Student st12 = new Student("Bob", 'm', 19, 3, 6.9);
        Student st13 = new Student("Tom Soer", 'm', 20, 4, 7.8);
        Student st14 = new Student("Crag", 'm', 18, 2, 5.9);
        Student st15 = new Student("Sidni", 'f', 22, 5, 9.3);

        List<Student> students2 = new ArrayList<>();

        students2.add(st11);
        students2.add(st12);
        students2.add(st13);
        students2.add(st14);
        students2.add(st15);

        // задача имена сделать заглав буквами и отсортировать по курсам

      Map<Integer,List<Student>> map = students.stream() // map() поменяет на заглавные буквы имена
                .map(el -> { el.setName(el.getName().toUpperCase()); return el; } )
                // Collectors.groupingBy веренет мапу с ключем(курс) и значением - вся остальная инфа
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        System.out.println(map);
// или более красивый вывод
        for(Map.Entry<Integer,List<Student>> entry: map.entrySet() ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

// если тру добавит в лист студентов с хорошими оценками в другой лист с плохими
        Map<Boolean, List<Student>> map2 = students2.stream()// partitioningBy вернет булеан
                .collect(Collectors.partitioningBy(el->el.getAvgGrade()>7));

        for(Map.Entry<Boolean,List<Student>> entry: map2.entrySet() ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
