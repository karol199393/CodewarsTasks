public class Task1 {
    public static int sum(int[] numbers) {
       int suma = 0;
       if(numbers == null){
           return 0;
       }
        for (int i =0 ; i < numbers.length ; i++){
            suma += numbers[i];
        }
        if(numbers.length <= 1)
            return 0;
        return suma-(findMax(numbers)+findMin(numbers));
    }
    private static int findMax(int [] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    private  static int findMin(int [] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min  ) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] numbers=new int [] {3,5,1,8,11};
        System.out.println(findMax(numbers));
        System.out.println(findMin(numbers));
        System.out.println(sum(numbers));

    }
}
