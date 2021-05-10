package day17_ternary_nested_conditions;

public class bMoreTernary {
    public static void main(String[] args) {

        double hourlyRate = 50;

        String reply = hourlyRate >=50 ? "accept" : "reject";
        System.out.println(reply);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Murodil " : "Nadir";
        System.out.println("Teacher is "+ teacher);
        
        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "Have DL and can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);


    }
}
