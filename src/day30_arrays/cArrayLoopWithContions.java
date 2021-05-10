package day30_arrays;

public class cArrayLoopWithContions {
    public static void main(String[] args) {
        double[] prices={22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};;

  //print prices more than 100
        System.out.println("-------prices more than 100----------");
        for (double eachPrices:prices){
            if (eachPrices>100){
                System.out.print(eachPrices+" ");
            }
        }
        System.out.println("\n----prices between 10 and 70-----");
        for (double eachPrices:prices) {
            if (eachPrices <= 70 && eachPrices >= 10) {
                System.out.print(eachPrices + " ");
            }
        }
        System.out.println("\n-----count of the prices that are more than 50-----");
      int count=0;
        for (double eachPrices:prices) {
            if (eachPrices >= 50) {
                count++;
            }
        }
        System.out.print(count);

        System.out.println("\n------coutries with name lenght more than 7------");

        for (String each:countries) {
            if (each.length() >= 7) {
                System.out.print(each+" ");
            }
        }

    }
}
