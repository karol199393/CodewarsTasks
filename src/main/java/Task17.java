public class Task17 {
    public static int[][] createBox(int width, int length)
    { int[][] tablica=new int[length][width];
        for(int i=0 ; i<width; i++){
            for (int j=0; j<length; j++) {
                if(i==0 && i==(width -1)) {
                    tablica[i][j]=1;
            }} }
        return new int[length][width];

}

    public static void main(String[] args) {
        int[][] result = createBox(5, 8);

        // Print the 2D array
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
