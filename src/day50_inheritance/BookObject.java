package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        Book book=new Book();
        book.title="Java";
        book.author="Savitch";
        book.type="Programming";
        book.price=85.9;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audiobook=new AudioBook();
        audiobook.title="Selenium";
        audiobook.author="Gurhan";
        audiobook.type="Programming";
        audiobook.lenght=2;
        audiobook.narrator="Irina";
        audiobook.price=11.81;
        audiobook.listen();

        ebook ebook=new ebook();
        ebook.title="Java data structure";
        ebook.author="Savitch";
        ebook.price=49.00;
        ebook.size=20;
        ebook.page=250;
        ebook.readBook();
    }
}
