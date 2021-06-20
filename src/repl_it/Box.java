package repl_it;

public class Box {
    double w;
    double l;
    public void setInfo(double w, double l){
        this.w=w;
        this.l=l;
    }
    @Override
    public String toString(){
        return "w: "+w+", l: "+l;
    }
}
class UseBoxes{
    public static void main(String[] args) {
        Box box=new Box();
        box.setInfo(5,11);
        System.out.println(box);
    }
}
