package day30_arrays;

public class aStudentArray {
    public static void main(String[] args) {

        String[] student1=new String[5];
        student1[0]="A1234";
        student1[1]="Adam";
        student1[2]="Smith";
        student1[3]="22";
        student1[4]="789-654-2314";

        String[] student2={"A1234", "Adam", "Smith", "22", "789-654-2314"};
        System.out.println("student1 id= "+student1[0]);
        System.out.println("student1 first name= "+student1[1]);
        System.out.println("student1 last name= "+student1[2]);
        System.out.println("student1 batch number= "+student1[3]);
        System.out.println("student1 phone number=  "+student1[4]);

        System.out.println("Student data lenght= "+ student1.length);

        //chech if student1 data array contains 5 items
        if (student1.length==5){
            System.out.println("Pass: data array has correct lenght");
        }else{
            System.out.println("Fail: data array has incorrect lenght");
        }
        /*
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */
        if (student1.length==student2.length){
            System.out.println("Pass: data arrays lenght match");
        }else{
            System.out.println("Fail: data arrays lenght mismatch");
        }

        System.out.println(student1[1].toUpperCase()+" "+student1[2].toUpperCase());

        String mobileNumber=student1[4];
        String mobileNumber2=student2[4];
        System.out.println("studen1 mobile number= "+mobileNumber);
        System.out.println("studen1 mobile number= "+mobileNumber2);
        System.out.println(mobileNumber.startsWith("789"));

        for (int i=0; i<student1.length;i++){
            System.out.print(" "+student1[i]);
        }
        System.out.println();
        int[] nums={1, 11, 66};
        for (int each : nums){
            System.out.print(each+" ");

        }
    }
}
