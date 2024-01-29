import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task5 {

        public static int[] map(int[] arr) {
            int [] tablica=new int[arr.length];
            for(int i =0; i < arr.length; i++) {
                tablica[i]=arr[i]*2;
            }
            return tablica;
        }

    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Task5.map(new int[] {1, 2, 3}));}




    public static void main(String[] args) {
            Task5 test=new Task5();



}
}
