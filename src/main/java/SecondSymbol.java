public class SecondSymbol {
    public static int secondSymbol(String str, char c) {
        int countChar = 0;
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c) {
                countChar++;
            }
            if(countChar==2){
                index=i;
            }
        }
        if(countChar>1){
            return  index;
        }
        else
            return -1;
        }

    public static void main(String[] args) {
        SecondSymbol task=new SecondSymbol();
        System.out.println(secondSymbol("NAPISHEHEHE",'E'));
    }
}

