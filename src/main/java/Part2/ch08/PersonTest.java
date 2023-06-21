package Part2.ch08;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Tomas";
        person1.age = 37;
        person1.height = 180;
        person1.weight = 78;

        System.out.println(person1.showInfo());

        Person person2 = new Person("Tomas", 37,180,78);
        System.out.println(person2.showInfo());
    }
}
