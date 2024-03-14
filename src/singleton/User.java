package singleton;

public class User {
    private String name = "John";
    private String surname = "Doe";
    private int age = 18;
    private static User user;

    private User() {}

    public static User getUser() {
        if (user == null){
            synchronized(User.class) {
                if (user == null) {
                    user = new User();
                }
            }
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}