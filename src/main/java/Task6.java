public class Task6 {
    public static double sum(double[] numbers) {
        double sum=0;
        for(int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] numbers=new double[]{2.3,5,7,8};
        double sum=sum(numbers);
        System.out.println(sum);


    }

}
