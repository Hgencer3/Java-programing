package day07_aritmetic_operators_casting;

public class aWarmUpAritmeticOperators {
    public static void main(String[] args){
        String city1 = "Chicago";
        String city2 = "Atlanta";
        Double ticketPrice = 216.80;
        System.out.println("From "+ city1+ " to "+city2+ " is "+ "$" + ticketPrice);
        System.out.println("From "+ city1+ " to "+city2+ " is $"+ ticketPrice);

        String sentence = "From "+ city1+ " to "+city2+ " is $"+ ticketPrice;
        System.out.println(sentence);
    }
}
