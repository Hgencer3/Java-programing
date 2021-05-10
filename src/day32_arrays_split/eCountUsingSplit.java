package day32_arrays_split;

public class eCountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here some other cat type";
       /* int count=0;
        for (int i=0; i<cats.length()-2;i++){
            if (cats.substring(i, i+3).equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("count of cats= "+count);*/
        String[] word=cats.split("cat");
        System.out.println("numbers of 'cat'= "+ (word.length-1));


    }
}
