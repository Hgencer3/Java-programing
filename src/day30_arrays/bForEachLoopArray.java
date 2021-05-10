package day30_arrays;

public class bForEachLoopArray {
    public static void main(String[] args) {
        int[] data={32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachNumber:data){
            System.out.print(eachNumber+"*");
        }
        System.out.println();
        for (int i =0; i<data.length;i++){
            System.out.print(data[i]+"-");
        }
        //print last value
        System.out.println();
        System.out.println("last value= "+data[data.length-1]);
        //loop array reverse
        for (int i=data.length-1;i>=0; i--){
            System.out.print(data[i]+" ");
        }
    }
}
