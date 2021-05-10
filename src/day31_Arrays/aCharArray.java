package day31_Arrays;

public class aCharArray {
    public static void main(String[] args) {
        char[] letters={'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        //print each letter using a loop
        for(char each: letters)
        System.out.print(each);

        System.out.println();
        String sentence= new String(letters);
        System.out.println("Sentence= "+sentence);

        String item="wooden spoon";
        char[] itemArray= item.toCharArray();
        System.out.println("ItemArray.lenght= "+itemArray.length);
        System.out.println("item.lenght()= "+ item.length());

        String[] fruits={"bananas", "apples","kivi","mango", "papaya", "strawberry"};
        String fruitStr="";
        for(String each: fruits) {
            System.out.print(each + "-");
            fruitStr+=each +"-";
        }
        System.out.println("\nfruitStr = " + fruitStr);
        
        String[] languages={"java", "python", "c++", "sql", "ruby", "javascript"};
        
        String.join("|", languages);
        String.join("##", languages);
        String joinedLanguages=String.join("<>",languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
        
    }
}
