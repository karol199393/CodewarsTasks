import static org.junit.Assert.assertEquals;

public class Task13 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int countTable1 = 0;
        int countTable2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            countTable1 += arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            countTable2 += arr2[j];
        }


        return countTable1 + countTable2;
    }
    public static void main(String[] args) {
        assertEquals(21, Task13.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
    }
