package projek_p8;
import java.util.Scanner;

public class tugas_menghitung_jumlah_nilai{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, total=0;
        char pilihan;
        
        do{
            System.out.print("Masukan nilai mahasiswa :");
            nilai=input.nextInt();

            total += nilai;
            System.out.print("Input lagi ? (y/t):");
            pilihan=input.next().charAt(0);
            } while (pilihan =='y' || pilihan == 'y');


            System.out.println("\n============================");
            System.out.println("Total nilai mahasiswa :" + total);
            System.out.println("Program Selesai");

    }
}