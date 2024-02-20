import java.util.ArrayList;
public class FindMaxValueInString {
    public static int solve(String s){
        int maxValue=0;
        String ifNumber="";
        ArrayList listOfNumbers=new ArrayList<>();
        for(int i=0; i<s.length();i++) {
             if(Character.isDigit(s.charAt(i))){
                 ifNumber += s.charAt(i);
                    if(Integer.parseInt(ifNumber)>maxValue){
                        maxValue=Integer.parseInt(ifNumber);
                    }
             }
             else {
                 listOfNumbers.add(ifNumber);
                 ifNumber=""; }
        }

        return maxValue;

    }

    public static void main(String[] args) {
        System.out.println(solve("2ti9iei7qhr5"));
        System.out.println(solve("gh12cdy695m1"));

    }
}

