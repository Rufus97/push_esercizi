package deisgnPatternBuilder;

public class Person {
	
    private String firstName;
    private String lastName;
    private int age;
    private String address;

  
    public Person(Costruttore builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Costruttore {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public Costruttore(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Costruttore age(int age) {
            this.age = age;
            return this;
        }

        public Costruttore address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}


 