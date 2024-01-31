public class Task9 {
    public static long[] powersOfTwo(int n){
        long[] tablica=new long[n];
        int silnia=1;
        if(n==0) { silnia=1; }
    for(int i=0; i<n; i++)
    {
        tablica[i]=i+1;

    }
        for(int i=0; i<n; i++)
        {
            silnia*=tablica[i];
        }
        System.out.println(silnia);
    return tablica;
    }

    public static void main(String[] args) {
        Task9.powersOfTwo(6);
    }
}

