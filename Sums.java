class Outerclass{
    int x=10;
    class Innerclass{
        int y=5;
    }
}
public class Sums{
    public static void main(String args[]){
        Outerclass myouter=new Outerclass();
        Outerclass.Innerclass myinner=myouter.new Innerclass();
        System.out.println(myinner.y+myouter.x);
    }
}