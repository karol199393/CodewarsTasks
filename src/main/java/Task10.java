import static org.junit.Assert.assertEquals;

public class Task10 {
    public static int grow(int[] x){
        int iloczyn=1;
        for(int i=0; i<x.length; i++){
            iloczyn*=x[i]; }
        return iloczyn;
    }

    public static void main(String[] args) {

        int result = Task10.grow(new int[] {1, 2, 3, 4});
        System.out.println("Result: " + result);

}
}
