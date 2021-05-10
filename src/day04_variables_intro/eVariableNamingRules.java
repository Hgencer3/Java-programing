package day04_variables_intro;

public class eVariableNamingRules {
    public static void main(String[] args){
        // int static = 22 ; error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 22;
        int salary$ = 55;
        // int 1stMonthSalary=3000; error, cannaot start with number
        int $ = 10;
        System.out.println($);
        int _ = 3;
        System.out.println(_);
        //int number-of-friend = 400; error, java isnt allowed -
        int numberOfFriends = 400;
        int number_of_friends= 401; //not convention

    }
}
