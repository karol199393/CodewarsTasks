public class TwoArePositive {
    public static boolean twoArePositive(int a, int b, int c) {
        int [] tab={a,b,c};
        int countPositive=0;
        for(int i=0; i<3; i++)
        {
            if(tab[i]>0){
                countPositive++;
            }
        }
        if(countPositive==2){
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(twoArePositive(-2,-2,7));
    }
}

