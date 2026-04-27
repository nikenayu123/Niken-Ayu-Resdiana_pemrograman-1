package projek_p8;
import java.util.Scanner;
public class tugas_input_nilai_mahasiswa{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        char pilihan;

        do{
            System.out.print("Masukan nilai mahasiswa :");
            int nilai=input.nextInt();

            System.out.println("Nilai yang di input :"+ nilai);
            System.out.print("Input lagi ? (y/t):");
            pilihan = input.next().charAt(0);


        }while (pilihan == 'y' || pilihan == 'y');
        System.out.println("Program selesai.");
    }
}