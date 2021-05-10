package day13_conditional_statements;

public class dIfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry= true;
        if(isHungry){
            System.out.println("I am hungry I will go get something to eat.\nThen code Java.");
        }else{
            System.out.println("I am not hungry.\n lets keep code Java.");
        }
        double price =130.44;
        boolean isAffordable= price <= 200;
        if(isAffordable){
            System.out.println("Yess it is Affordable");
        }else {
            System.out.println("no it is not Affordable");
        }
        boolean isRemoteJob= true;
        if(isRemoteJob!=true){
            System.out.println("Sorry Iam not interested.");
        }else{
            System.out.println("Sure. I am interested.");
        }
    }
}
