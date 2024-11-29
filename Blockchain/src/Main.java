import java.util.Arrays;

public class Main {
    /*
    EACH BLOCK WIL HAVE :

        1. LIST OF PREVIOUS TRANSACTION
        2. HASH OF PREVIOUS BLOCK

        3. IT'S OWN HASH CALCULATED BASED ON (1.) AND (2.)

     */



    public static void main(String[] args) {

        System.out.println("Hello world!");

        String[] list1 ={"a", "b"};
        String[] list2 ={"a", "b"};


        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
    }
}