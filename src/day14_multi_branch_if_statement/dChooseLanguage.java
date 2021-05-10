package day14_multi_branch_if_statement;

public class dChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose Language Please");
        int selection =3;
        if (selection==1){
            System.out.println("hello thank for your call");
        }else if (selection==2){
            System.out.println("hola, geacias para llamar");
        }else if (selection==3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if (selection==4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if (selection==5) {
            System.out.println("merci, pour votre appel");
        }else{
            System.out.println("lets talk java");
        }
    }
}
