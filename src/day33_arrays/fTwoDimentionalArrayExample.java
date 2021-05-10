package day33_arrays;

import java.util.Arrays;

public class fTwoDimentionalArrayExample {
    public static void main(String[] args) {
        String [][] users=new String[3][2];
        users[0][0]="Teodora";
        users[0][1]="TeodoraPWD12";
        users[1][0]="Anna";
        users[1][1]="AnnaAlmaty123";
        users[2][0]="Parvin";
        users[2][1]="ParvinVienna321";

        String[][] userData={ {"Teodora","TeodoraPWD12"},{"Anna","AnnaAlmaty123"},{"Parvin","ParvinVienna321"} };
        System.out.println(userData[0][0]+"\t"+userData[0][1]);
        System.out.println(userData[1][0]+"\t"+userData[1][1]);
        System.out.println(userData[2][0]+"\t"+userData[2][1]);

        System.out.println();
        System.out.println(Arrays.deepToString(userData));

    }
}
