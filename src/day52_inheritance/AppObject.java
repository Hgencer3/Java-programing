package day52_inheritance;

public class AppObject {
    public static void main(String[] args) {
        MobileApp mobileApp=new MobileApp();
        mobileApp.name="Youtube";
        mobileApp.useTheApp(20);

        System.out.println();
        instagram instagram=new instagram();
        instagram.name="Instagram";
        instagram.useTheApp(20);

        System.out.println();
        Discord discord=new Discord();
        discord.name="Discord";
        discord.useTheApp(10);

    }
}
