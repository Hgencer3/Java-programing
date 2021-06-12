package day52_inheritance;

public class AppObject {
    public static void main(String[] args) {
        MobileApp mobileApp=new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.setVersion("123.1234");
        mobileApp.useTheApp(20);
        mobileApp.download();

        System.out.println();
        instagram instagram=new instagram();
        instagram.setName("Instagram");
        instagram.setVersion("0.02.023");
        instagram.useTheApp(20);
        instagram.download();

        System.out.println();
        Discord discord=new Discord();
        discord.setName("Discord");
        discord.useTheApp(10);
        discord.download();

    }
}
