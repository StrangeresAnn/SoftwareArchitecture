package task5;

public class Main {
    public static void main(String[] args) {
        UserDTO user = new UserDTO("Ann", "ann@example.com", 24);
        System.out.println(user);

        // Изменение значения полей
        user.setUsername("Kate");
        user.setEmail("kate@example.com");
        user.setAge(25);
        System.out.println(user);
    }
}
