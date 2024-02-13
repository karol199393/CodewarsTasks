import java.util.LinkedList;
import java.util.Random;

public class NumbersPlayer1 {
    public LinkedList NumbersPlayer1() {
        LinkedList m = new LinkedList();
        Random generator = new Random();
        m.add(generator.nextInt(9));
        m.add(generator.nextInt(9));


        return m;
    }
    public static void main(String[] args) {
        NumbersPlayer1 task=new NumbersPlayer1();
        System.out.println(task.NumbersPlayer1());
        }
    }


