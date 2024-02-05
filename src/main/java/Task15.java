import java.util.LinkedList;
import java.util.Random;

public class Task15 {
    public LinkedList NumbersPlayer1() {
        LinkedList m = new LinkedList();
        Random generator = new Random();
        m.add(generator.nextInt(9));
        m.add(generator.nextInt(9));


        return m;
    }
    public static void main(String[] args) {
        Task15 task=new Task15();
        System.out.println(task.NumbersPlayer1());
        }
    }


