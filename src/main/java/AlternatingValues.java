public class AlternatingValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String [] tablica=new String[n];
        for(int i=0; i<n; i++){
            if(i%2==0 || i==0)
            tablica[i]=firstValue;
            else
            tablica[i]=secondValue;
        }
        return tablica;
    }

    public static void main(String[] args) {
        String[] result = alternate(5, "Value1", "Value2");

        for (String value : result) {
            System.out.print(value + " ");
        }
    } }

