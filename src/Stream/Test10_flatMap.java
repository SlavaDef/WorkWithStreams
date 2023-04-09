package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test10_flatMap {

    public static void main(String[] args) {

        Student st1 = new Student("MaryM", 'f', 18, 2, 8.9);
        Student st2 = new Student("Bob", 'm', 19, 3, 6.9);
        Student st3 = new Student("Tom Soer", 'm', 20, 4, 7.8);
        Student st4 = new Student("Crag", 'm', 18, 2, 5.9);
        Student st5 = new Student("Sidni", 'f', 22, 5, 9.3);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Programming");

        f1.addStudentToFaculty(st1); // перших трех студентів додаємо до першого факультету
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);

        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>(); // лист факультетів
        facultyList.add(f1); // додаємо факультети
        facultyList.add(f2);

        // метод flatMap юзаємо коли нам треба попрацювати з листом листів
// як єлемент передаємо faculty із faculty отримуємо інший лист і вже на листі конкретних студентів
        // факультета визиваємо метод стрім і вже конкретні імя стідентів на цьому факультеті
        // спочатку працюємо со студнтами першого потоку після обробки з другим потоком
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty()
                .stream()).forEach(el -> System.out.println(el.getName())) ;
    }
}
class Faculty {
    String nameFac;
    List<Student> studentsOnFaculty;

    public Faculty(String nameFac) {
        this.nameFac = nameFac;
        studentsOnFaculty = new ArrayList<>();// в кострукторе создаем аррай листа студентов
    }
    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty; // просто вернет нам лист студентов
    }
    public void addStudentToFaculty(Student student){ // метод додає студентів до факультету
        studentsOnFaculty.add(student);
    }
}
