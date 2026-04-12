
import java.util.Scanner;

public class if_else {
    public static void main (String[]args){
        Scanner input =new Scanner(System.in);

        System.out.print("Masukan Nilai :");
        int nilai=input.nextInt();

        if (nilai>= 75){
            System.out.println("Status : Lulus");
            }
            else {
                System.out.println("Status : Tidak Lulus");
            }

    }

    
}
