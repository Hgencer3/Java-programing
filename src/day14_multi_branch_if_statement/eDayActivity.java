package day14_multi_branch_if_statement;

public class eDayActivity {
    public static void main(String[] args) {
        String weather = "sunny";

        if (weather.equals("sunny")) {
            System.out.println("Outside is sunny, we can go to park");
        } else if (weather.equals("rainy")) {
            System.out.println("Outside is rainy; stay home");
        }else if (weather.equals("snowy")){
            System.out.println("Outside is snowy; clean the car");
        }else if (weather.equals("windy")) {
            System.out.println("Outside is windy; close the window");
        }else if (weather.equals("cloudly")) {
            System.out.println("Outside is cloudly; stay home");
        }else{
            System.out.println("nothing");
        }
    }
}