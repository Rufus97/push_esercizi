package deisgnPatternBuilder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("John", "Doe")
                .age(30)
                .address("123 Street")
                .build();

        Person person2 = new Person.Builder("Jane", "Smith")
                .age(25)
                .build();

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}
