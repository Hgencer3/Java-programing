package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class bListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size()= "+getDays().size());
        System.out.println("getDays().get(0)= "+getDays().get(0));
        List<String> dayNames=getDays();
        System.out.println("day names= "+dayNames);
        dayNames.add("java day");
        System.out.println("dayNames = " + dayNames);

        dayNames.removeIf( day-> day.length()==6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println("random 3 numbers = " + getRandomList(3));
        List<Integer> nums=getRandomList(100);
        System.out.println(nums);
        System.out.println("nums.size() = " + nums.size());
        nums.removeIf(n -> n<90);//remove nums less than 90
        System.out.println(nums);
    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
        return days;
    }
    public static List<Integer> getRandomList(int size) {
        List<Integer> nums=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            //int n= random.nextInt(101);  --> if you dont want duplicate nums
            //if (!nums.contains(n)){
               // nums.add(n); }
            nums.add(random.nextInt(101));
        }
        return nums;
    }

}
