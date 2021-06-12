package day52_inheritance;

public class instagram extends MobileApp{
    public void postPicture(){
        System.out.println("Posting photo on instagram");
    }


    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        System.out.println("Using to app features");
        postPicture();
    }
}
