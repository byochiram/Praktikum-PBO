/*  
*   Nama      = ExceptionOnArray.java 5/3/2024    
*   Penulis   = Rosidah Rahmati 24060122140121
*   Deskripsi = Program class ExceptionOnArray
*/

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; 
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code..."); 
        }
    } 
}
