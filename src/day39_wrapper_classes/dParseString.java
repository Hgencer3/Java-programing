package day39_wrapper_classes;

public class dParseString {
    public static void main(String[] args) {
        String strPrice="345";
        int price=Integer.parseInt(strPrice);
        System.out.println("price = " + price);

        String strPrice2="123.4";
        double price2=Double.parseDouble(strPrice2);
        if (price2>100){
            System.out.println(" expensive ");
        }
        String sentence="I write 100 lines of code";
        String[] sentArr=sentence.split(" ");
        
        int linesofCodes=Integer.parseInt(sentArr[2]);
        System.out.println("linesofCodes = " + linesofCodes);
    }
}
