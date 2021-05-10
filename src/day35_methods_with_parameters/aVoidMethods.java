package day35_methods_with_parameters;

public class aVoidMethods {
    public static void main(String[] args) {
        displayFlag();
        for (int i=0;i<=10;i++){
            System.out.println();
            printAToZ();
     }
    }
    public static void printAToZ() {
        for (char alphabet='A';alphabet<='Z';alphabet++){
            System.out.print(alphabet+" ");
        }
    }
    public static void displayFlag() {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
