

package projek_4;
import java.util.Scanner;

public class latihan_nilai_mhs{
    public static void main (String args[]){
    Scanner input=new Scanner (System.in);
    int realisasi, presensi, tugas,UTS,UAS;

    System.out.print("Maasukan Realisasi pertemuan :");
    realisasi=input.nextInt();
    System.out.print("Masukan jumlah kehadiran :");
    presensi=input.nextInt();
    System.out.print("Masukan nilai tugas:");
    tugas=input.nextInt();
    System.out.print("Masukan nilai UTS :");
    UTS = input.nextInt();
    System.out.print("Masukan Nilai UAS:");
    UAS=input.nextInt();
    
    //proses 
    double hasilpresensi=((double)presensi/realisasi)*10;
    double hasiltugas=(tugas/100.0)*20;
    double hasilUTS=(UTS/100.0)*30;
    double hasilUAS=(UAS/100.0)*40;

    double total=hasilpresensi+hasiltugas+hasilUTS+hasilUAS;

    System.out.println("\n======Hasil======");
    System.out.printf("Nilai presensi :%.2f\n ", hasilpresensi);
    System.out.printf("Nilai tugas :%.2f\n",hasiltugas);
    System.out.printf("Nilai UTS :%.2f\n", hasilUTS);
    System.out.printf("NIlai UAS :%.2f\n", hasilUAS);
    System.out.printf("Total nilai akhir : %.2f\n",total);



    }
}



