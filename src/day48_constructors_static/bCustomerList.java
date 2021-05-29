package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class bCustomerList {
    public static void main(String[] args) {
        aCustomer customer=new aCustomer();
        customer.setName("Thomas White");
        customer.setId(123654);
        System.out.println("New costumer "+ customer.getName()+ " id's "+ customer.getId());

        aCustomer custumer2=new aCustomer("Bridget Black", 987456);
        aCustomer custumer3=new aCustomer("John Ward", 4873);
        //custumer3=new aCustomer("John Ward III", 4873);// we are creating a new object, we are not updating the same object.

        custumer3.setName("John Ward III");
        custumer3.setId(4873);

        //array of todays customers
        aCustomer[] todaysCustomers={customer,custumer2,custumer3, new aCustomer("Bashir",369258)};
        //arraysList if todays customers
        ArrayList<aCustomer> todaysCustomerList=new ArrayList<>();
        todaysCustomerList.add(customer);
        todaysCustomerList.add(custumer2);
        todaysCustomerList.add(custumer3);
        todaysCustomerList.add(new aCustomer("Bashir",2154));

        System.out.println(todaysCustomers[0]);
        System.out.println(Arrays.toString(todaysCustomers));
        System.out.println(todaysCustomerList.get(1));
        System.out.println(todaysCustomerList);

        System.out.println("----for loop----");
        for (int i=0; i<todaysCustomerList.size();i++){
            System.out.println(todaysCustomerList.get(i));
        }
        System.out.println("----for each loop----");
        for (aCustomer each: todaysCustomerList ) {
            System.out.println(each);
        }
        // print only all names of customer names
        System.out.println("---- names of customer-----");

        for (aCustomer each: todaysCustomerList ) {
            System.out.println(each.getName());
        }
        System.out.println("----- with lamda expression ----");
        todaysCustomerList.forEach(each -> System.out.println(each.getName()));//lamda expression

    }
}
