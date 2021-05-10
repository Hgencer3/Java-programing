package day32_arrays_split;

public class aMallShopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("------FIND THE INDEX OF 'Gloves' in items array--------");

        for (int a=0; a<items.length;a++){
            System.out.println(a+" "+items[a]);
        }
        // use for loop with condition
        System.out.println();
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")){
                System.out.println("Index of Gloves= " + i);
                break;
            }
        }
        System.out.println();
        System.out.println("-----Set boolen to true if true if first 'ipad' is found-----");
        boolean ipadExist=false;
        for (String item:items){
            if (item.equalsIgnoreCase("ipad")){
                ipadExist=true;
            }
        }
        System.out.println("ipadExist= "+ipadExist);

        System.out.println();
        System.out.println("----Print a report of each shopping item-----");

        for (int i = 0; i < items.length; i++) {
            System.out.println("item "+i+ " "+ items[i] + ",\t  - $" + prices[i] + " \t Item ID - #" + itemIDs[i]);
        }
        System.out.println("----Look for 'Jacket' in items and print all details---");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")){
                System.out.println("item "+i+ " "+ items[i] + ",\t  - $" + prices[i] + " \t Item ID - #" + itemIDs[i]);
                break;// stop searching after jacket is found
            }
        }
    }
}
