public class Task8 {
    public static int[] monkeyCount(final int n){
        int [] tablica=new int[n];
        for(int i=0; i < n; i++ ){
            System.out.print(tablica[i]=i+1);
        }
        return tablica;
    }



    public static void main(String[] args) {

        System.out.print(Task8.monkeyCount(6));
    }
}
