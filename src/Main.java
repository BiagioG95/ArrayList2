import java.util.ArrayList;

import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Biagio", 28));
        students.add(new Student("Mario", 25));
        students.add(new Student("Luigi", 22));
        students.add(new Student("Francesco", 21));
        students.add(new Student("Pippo", 23));
        students.add(new Student("Giuseppe", 31));
        students.add(new Student("Carlo", 27));
        students.add(new Student("Danilo", 40));
        students.add(new Student("Jacob", 35));
        students.add(new Student("Arianna", 18));
        students.add(new Student("Ettore", 33));
        students.add(new Student("Nicola", 20));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(" ");

        System.out.println("Lista studenti ordinata:");

        students.sort(Comparator.comparing(Student::getName));

        for (Student student : students) {
            System.out.println(student);
        }


    }
}