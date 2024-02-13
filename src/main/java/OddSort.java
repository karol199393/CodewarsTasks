import java.util.Arrays;

public class OddSort {
    public static void main(String[] args) {
    int [] array ={6,7,2,4,1,0,9};
    for (int i=0 ; i< array.length-1 ; i++)
        for(int j=0 ; j< array.length-i-1 ; j++ )
    {
        if(array[j]>array[j+1] && array[j]%2 == 1)
        {
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp;

        }

    }
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
