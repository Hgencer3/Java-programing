package day47_constructors;

public class bAddresstList {
    public static void main(String[] args) {
        aAddress cbertekAddress= new aAddress();
        cbertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cbertekAddress.setCity("Mclean");
        cbertekAddress.setState("VA");
        cbertekAddress.setZipCode("22182");

        System.out.println(" CybertekSchool Adrss: "+cbertekAddress.toString());

        cbertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println(" CybertekSchool Adress after update: "+cbertekAddress.toString());
        System.out.println("street info: "+cbertekAddress.getStreet());

        aAddress newAddress=new aAddress();
        newAddress.setStreet("7921 Jones Branch Dr Suite 200");
        newAddress.setCity("Meclean");
        newAddress.setState("VA");
        newAddress.setZipCode("22182");
        System.out.println(newAddress.toString());

        aAddress papaJon=new aAddress("8501 Tyco Rd Ste 1A", " Vienna", "VA", "22182");
        System.out.println("Papa Jon adress: "+papaJon);


    }
}
