package day59_polymorphism_exception.polymorphism;

public class Link implements WebElement{
    public static final String TAG_NAME="a";

    public void getLinkHref(){
        System.out.println("https://java.com");
    }
    @Override
    public void sendKeys(String txt) {
        System.out.println("");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public String getText() {
        System.out.println("Getting link text");
        return "Oracle java";
    }

}
