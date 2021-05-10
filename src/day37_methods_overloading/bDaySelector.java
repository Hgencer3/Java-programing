package day37_methods_overloading;

public class bDaySelector {
    public static void main(String[] args) {

       System.out.println(getDayName(8));
       //loop from 1 to 8 and call the getdayname with loop variable
        for (int i = 0; i < 9; i++) {
            System.out.println(i+" = " +getDayName(i));
        }
        //store getdayname into variable and print variable
        String today= getDayName(6);
        System.out.println("today = " + today);
        String someDay=getDayName(0);
        if (someDay==null){
            System.out.println("someDay is null for invalid ady");
        }
        System.out.println(getDayName2(5));
        System.out.println(getDayName2(9));
    }
    public static String getDayName(int day) {

        switch (day) {
            case 1:
                return  "Monday";
            case 2:
                return  "Tuesday";
            case 3:
                return  "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("invalid day");
                return null;
        }
    }
    public static String getDayName2(int day){
        String dayName;
        switch (day){
            case 1:
                dayName =  "Monday";
                break;
            case 2:
                dayName =  "Tuesday";
                break;
            case 3:
                dayName =  "Wednesday";
                break;
            case 4:
                dayName =  "Thursday";
                break;
            case 5:
                dayName =  "Friday";
                break;
            case 6:
                dayName =  "Saturday";
                break;
            case 7:
                dayName =  "Sunday";
                break;
            default:
                System.out.println("invalid day");
                dayName=null;
        }
        return dayName;
    }
    }
