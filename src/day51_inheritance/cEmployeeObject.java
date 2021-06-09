package day51_inheritance;

public class cEmployeeObject {

        public static void main(String[] args) {
            aEmployee contractorEmployee=new aEmployee();
            contractorEmployee.jobTitle="Developer";
            System.out.println("contractorEmployee.calculateSalary(44.50) = " + contractorEmployee.calculateSalary(55));
            System.out.println(contractorEmployee.toString());//Override
            double annuelSalary=contractorEmployee.calculateSalary(55.0);
            System.out.println("annuelSalary = " + Math.round(annuelSalary));

            bContractor sdetContractor=new bContractor();
            sdetContractor.jobTitle="SDET";
            System.out.println(sdetContractor);
            System.out.println("sdetContractor.calculateSalary(53) = " + sdetContractor.calculateSalary(53));
            double sdetSalary=sdetContractor.calculateSalary(53);
            System.out.println("sdetSalary = " + sdetSalary);

        }
    }

