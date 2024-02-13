public class CountOfSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int liczbaOwiec=0;
        for(int i=0; i<arrayOfSheeps.length; i++){
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i].booleanValue()){
                liczbaOwiec = liczbaOwiec+1; }
        }
        return liczbaOwiec;
    }

    public static void main(String[] args) {
        CountOfSheeps task=new CountOfSheeps();
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        System.out.println(task.countSheeps(array1));;
    }
}

