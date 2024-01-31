public class Task11 {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int liczbaOwiec=0;
        for(int i=0; i<arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i]==true){
                liczbaOwiec = liczbaOwiec+1; }
        }
        return liczbaOwiec;
    }

    public static void main(String[] args) {
        Task11 task=new Task11();
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        System.out.println(task.countSheeps(array1));;
    }
}

