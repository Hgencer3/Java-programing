package day55_abstraction.interfaces;

public interface WebDriver {
    public abstract void get(String url);

    public abstract void findElement(String locater);
    void quit();//it is automatically public abstract
    String getTitle();




}
