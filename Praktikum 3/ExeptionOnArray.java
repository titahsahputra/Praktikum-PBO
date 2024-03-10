public class ExeptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger= new Integer[4];
        try{
            arrayInteger[0]=11;
            arrayInteger[4]=10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}