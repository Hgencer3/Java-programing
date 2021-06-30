package day58_poliymorphism;

public class Superman extends Father implements Worker{
    @Override
    public void work(String job) {
        System.out.println("Superman working as "+job);
    }

    @Override
    public double getPaid() {
        System.out.println("Superman is getting paid");
        return 8000;
    }
}
