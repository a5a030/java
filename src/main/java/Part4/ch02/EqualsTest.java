package Part4.ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student studentLee = new Student(100, "Lee");
        Student studentKim = new Student(100, "Kim");

        System.out.println(studentLee==studentKim);
        System.out.println(studentLee.equals(studentLee));

        System.out.println(studentLee.hashCode());
        System.out.println(studentKim.hashCode());

        System.out.println(System.identityHashCode(studentLee));
        System.out.println(System.identityHashCode(studentKim));

        studentLee.setStudentName("Kim");
        Student copyStudent = (Student) studentLee.clone();
        System.out.println(copyStudent);
    }
}
