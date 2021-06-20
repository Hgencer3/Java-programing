package repl_it;

import java.util.ArrayList;

public class Bed {
    static int count;

    public Bed(){
        count++;
    }
    public Bed(int i){
        count+=i;
    }
    public Bed(String s){
        count+=s.length();
    }
    class Test{
        public static void main(String[] args) {
            new Bed();
            Bed a=new Bed("word");
        }
    }
}
