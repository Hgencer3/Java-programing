package day34_void_methods;

public class aFirstMethod {
    public static void main(String[] args) {
        displayMassage();
        displayMassage();
        displayMassage();
        displayMassage();

        for (int i=1;i<=100;i++){
            System.out.print(i+"-");
            displayMassage();
        }
    }
    public static void displayMassage(){
        System.out.println("Hello B22 Friends!");
    }
}
