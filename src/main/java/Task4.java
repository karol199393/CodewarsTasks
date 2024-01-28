public class Task4 {
    public static int quarterOf(int month) {
        if(month>0 && month<=3){
            System.out.println("1 quarter");
                return 1;}
        if(month>3 && month<=6){
            System.out.println("2 quarter");
                return 2;}
        if(month>6 && month<=9){
            System.out.println("3 quarter");
                return 3;}
        if(month>9 && month<=12){
            System.out.println("4 quarter");
                return 4;}
        else{
        return 0;}
    }

    public static void main(String[] args) {

    }
}
