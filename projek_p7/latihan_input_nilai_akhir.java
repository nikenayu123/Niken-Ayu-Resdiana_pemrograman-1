
package projek_p7;
import java.util.Scanner;

public class latihan_input_nilai_akhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPertemuan=21;
        int batasAbsen= 3; 
        //input
        System.out.print("Masukan jumlah kehadiran : ");
        int hadir = input.nextInt();
        
        System.out.print("Masukan nilai akhir :");
        int nilai=input.nextInt();
        //hitung nilai akhir(10% kehadiran)
        double nilaiKehadiran=(hadir==totalPertemuan)? 100:80;
        double nilaiAkhir=(nilai *0.9)+(nilaiKehadiran * 0.1);

        // hitung jumlah tidak hadir
        int tidakHadir=totalPertemuan- hadir; 

        //penentuan grade normal 
        char grade;
        if (nilaiAkhir >=80){
            grade='A';
        }else if(nilaiAkhir >=70){
            grade='B';
        }else if(nilaiAkhir >=60){
            grade='C';
        }else if (nilaiAkhir >=55){
            grade='D';
        }else{
            grade ='E';
        }
        
        System.out.println("\n===HASIL===");
        if(tidakHadir < batasAbsen){
            System.out.println("NIlai :"+ nilaiAkhir);
            System.out.println("Grade :"+ grade);  
        }else {
            if(nilaiAkhir >=55){
                System.out.println("Anda tidak memenuhi syarat kehadiran.");
                System.out.println("Nilai anda adalah : 55.0, Grade anda D");
                }else{
                    System.out.println("Anda tidak memenuhi syarat kehadiran.");
                    System.out.println("Nilai anda adalah :"+nilaiAkhir +", Grade anda E");
                    input.close();
            }
        }

        

    }
}
