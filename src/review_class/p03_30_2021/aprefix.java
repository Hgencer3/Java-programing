package review_class.p03_30_2021;

public class aprefix {
    public static void main(String[] args) {
        String str="abXYabc";
        int n=2;

        String prefix=str.substring(0,n);
        String remaining=str.substring(n);

        System.out.println(remaining);
        System.out.println(remaining.contains(prefix));

    }
}
