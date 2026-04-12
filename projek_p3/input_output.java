package projek_p3;
import java.util.Scanner;

public class input_output {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //input 
        System.out.print("Masukan nama :");
        String nama=input.nextLine();
        System.out.print("Mauskan umur :");
        int umur=input.nextInt();
        System.out.print("Masukan jurusan :");
        input.nextLine();
        String jurusan =input.nextLine();

        //output 
        System.out.println("\n======DATA MAHASISWA======\n");
        System.out.println("Nama :"+nama);
        System.out.println("Umur :"+ umur + " tahun");
        System.out.println("Jurusan :"+jurusan);

        input.close();

        
    



    }
}
