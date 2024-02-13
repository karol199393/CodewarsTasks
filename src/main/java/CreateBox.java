public class CreateBox {

        public static int[][] createBox(int width, int length) {
            int[][] result = new int[length][width];

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    result[i][j] = Math.min(Math.min(i, length - 1 - i), Math.min(j, width - 1 - j)) + 1;
                }
            }

            return result;
        }

        public static void printPattern(int[][] pattern) {
            for (int i = 0; i < pattern.length; i++) {
                for (int j = 0; j < pattern[i].length; j++) {
                    System.out.print(pattern[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            {
            int m1 = 5, n1 = 8;
            int[][] pattern1 = createBox(m1, n1);
            printPattern(pattern1);
            System.out.println();
            int m2 = 10, n2 = 9;
            int[][] pattern2 = createBox(m2, n2);
            printPattern(pattern2);
        }
    } }

