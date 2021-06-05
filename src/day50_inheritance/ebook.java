package day50_inheritance;

public class ebook extends Book{
    int size;
    int page;

    public void readBook(){
        System.out.println("Ebook");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Size: "+size);
        System.out.println("Price is "+price);
    }
}
