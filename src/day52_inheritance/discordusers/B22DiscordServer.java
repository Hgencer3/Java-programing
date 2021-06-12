package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId("1234");
        user1.setName("Suluman");
        user1.setRole("student");

        Admin admin1 = new Admin();
        admin1.setId("4569");
        admin1.setName("Burak");
        admin1.setRole("Admin");

        System.out.println("user1 = " + user1);
        System.out.println("admin1 = " + admin1);

        Admin admin2=new Admin("Gulia", "1456");
        System.out.println(admin2);
    }

}
