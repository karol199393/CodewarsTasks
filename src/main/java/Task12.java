import static org.junit.Assert.assertArrayEquals;

public class Task12 {
    public static int[] countPositivesSumNegatives(int[] input)
    {   if(input==null){
        return new int[]{};
    }
        if(input.length == 0){
            return new int[]{};
        }
        int countPositive = 0;
        int sumNegataves= 0;

        for(int i=0; i< input.length; i++){
        if(input[i]>0){
            countPositive++;
        }
        else {
            sumNegataves = input[i] + sumNegataves;
        }
    }
        int [] tab = {countPositive,sumNegataves};;
        return  tab;
}

    public static void main(String[] args) {
        int[] inputArray = {};

        int[] result = Task12.countPositivesSumNegatives(inputArray);

        // Wydrukowanie wyniku
        System.out.println("Liczba dodatnich: " + result[0]);
        System.out.println("Suma ujemnych: " + result[1]);

    }
}
