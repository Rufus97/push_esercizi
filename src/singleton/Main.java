package singleton;

public class Main {
    public static void main(String[] args) {
        User user = User.getUser();
        System.out.println(user);
        User user1 = User.getUser();
        user.setName("Ozzy");
        user.setSurname("bo");
        user.setAge(66);
        System.out.println(user1);
    }
}