package repl_it;

public class Sport {
    String name;
    int num;
    boolean team;
    public void makeSport(String nameofsport, int players, boolean teams){
        name =nameofsport;
        num=players;
        team=teams;
    }
    public String toString(){
        return "T "+name+" and has "+num+" p: "+team;
    }

    public static void main(String[] args) {
        Sport soccer=new Sport();
        soccer.makeSport("soccer",22 , true);
        System.out.println(soccer);
    }
}
