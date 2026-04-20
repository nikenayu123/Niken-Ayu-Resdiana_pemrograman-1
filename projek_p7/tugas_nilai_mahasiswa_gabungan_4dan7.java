
package projek_p7;

import java.util.Scanner;
public class tugas_nilai_mahasiswa_gabungan_4dan7{
    public static void main(String[]args){
        Scanner input =new Scanner (System.in);
        
        //input
        int realisasi, presensi, tugas, UTS, UAS;
        System.out.print("Masukan realisasi pertemuan : ");
        realisasi = input.nextInt();

        System.out.print("Masukian jumlah kehadiran :");
        presensi = input.nextInt();

        System.out.print("Masukan nilai tugas :");
        tugas = input.nextInt();

        System.out.print("Masukan nilai UTS :");
        UTS = input.nextInt();

        System.out.print("Masukan nilai UAS :");
        UAS = input.nextInt();

        //proses nilai 
        double hasilPresensi=((double)presensi/realisasi)*10;
        double hasiltugas=((double)tugas/100.0)* 20;
        double hasilUTS=((double)UTS/100.0)*30;
        double hasilUAS=((double)UAS/100.0)*40;

        double totalNilai=hasilPresensi + hasiltugas + hasilUTS + hasilUAS;

        // logika kehadiran 
        int batasAbsen=3;
        int tidakHadir=realisasi-presensi;

        double nilaiKehadiran=(presensi == realisasi) ? 100 : 80;
        double nilaiAkhir=(totalNilai * 0.9) + (nilaiKehadiran * 0.1);

        // penentuan grade 
        char grade;
        if(nilaiAkhir >= 80){
            grade='A';
        }else if(nilaiAkhir >= 70){
            grade='B';
        }else if(nilaiAkhir >= 60){
            grade='C';
        }else if(nilaiAkhir >= 55){
            grade='D';
        }else{
            grade='E';
        }
        
        //output 
        System.out.println("\n=====HASIL=====");
        System.out.printf("Nilai presensi : %.2f\n", hasilPresensi);
        System.out.printf("NIlai tugas :%.2f\n", hasiltugas);
        System.out.printf("NIlai UTS : %.2f\n", hasilUTS);
        System.out.printf("Nilai UAS : %.2f\n", hasilUAS);
        System.out.printf("Nilai UAS : %.2f\n", hasilUAS);

        System.out.println("\n===HASIL AKHIR===");

        if (tidakHadir < batasAbsen) {
            System.out.printf("Nilai akhir : %.2f\n", nilaiAkhir);
            System.out.println("Grade : "+ grade);
        }else{
            System.out.println("Anda tidak memenuhi sayarat kehadiran.");
            if (nilaiAkhir >= 55){
                System.out.println("Nilai anda adalah : 55.0");
                System.out.println("Grade anda D ");
            }else {
                System.out.println("Nilai anda adalah : 55.0");
                System.out.println("Grade anda E");
            }
        }
            input.close();

    }
}

