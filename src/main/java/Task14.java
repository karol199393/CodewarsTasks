public class Task14 {
  //  public static int solve(int[] arr) {
  //  }

    private boolean isPrimeNumber(int number) {
        int countDivider = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivider++;

            }
        }
        System.out.println(countDivider);
        if (countDivider > 2) {
            return false;
        } else
            return true;
    }

    public static void main(String[] args) {
        Task14 liczba = new Task14();
    }
}

