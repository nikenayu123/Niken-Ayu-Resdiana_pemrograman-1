package projek_p8;
import java.util.Scanner;
public class tugas_menghitung_rata {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int nilai, total=0,jumlah =0;
        double rata;
        char pilihan;

        do{
            System.out.print("Masukan nilai mahasiswa :");
            nilai = input.nextInt();

            total += nilai;
            jumlah++;

            System.out.print("input lagi ? (y/t)");
            pilihan=input.next().charAt(0);

        }while(pilihan == 'y' || pilihan == 'y');
        rata=(double) total/jumlah;

        System.out.println("\n==========================");
        System.out.println("Total nilai :"+ total);
        System.out.println("Jumlah Data :"+ jumlah);
        System.out.println("Rata-rata nilai :"+rata);
        System.out.println("Program selesai.");
    }


}