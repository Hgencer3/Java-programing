package day38_methods;

public class fArrayUtilsTest {
    public static void main(String[] args) {
        int[]nums={5,-3,1,543,90};
        eArrayUtils.printArray(nums);
        eArrayUtils.printArray(new int[] {12,23,64,534,234,45});


        System.out.println("sum= "+eArrayUtils.sum(nums));

        System.out.println("is nums contains num "+eArrayUtils.contains(nums, 24));
        System.out.println("is nums contains num "+eArrayUtils.contains(nums, -3));

        int[] a={1,2,3};
        int[] b={1,2,4};
        System.out.println("int[]a=int[]b: "+eArrayUtils.equalty(a,b));



    }
}
