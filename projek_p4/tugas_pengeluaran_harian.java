<<<<<<< HEAD
package projek_p4;
=======
package projek_4;
>>>>>>> 194b470518f78efa308801f2dd299c115dbec89d
import java.util.Scanner;
public class tugas_pengeluaran_harian{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("PENGELUARAN MAKAN,TRANSPORT DAN BELANJA HARIAN");
        System.out.println("===============================================\n");

//hari ke 1
        System.out.println("Hari ke-1\n");
        System.out.print("makan :");
        int m1=input.nextInt();
        System.out.print("transportasi :");
        int t1=input.nextInt();
        System.out.print("belanja :");
        int b1=input.nextInt();
        int total1=m1+t1+b1;
        System.out.println("Total pengeluaran hari ke-1 :"+ total1);
        
 //hari ke 2
        System.out.println("\nHari ke-2\n");
        System.out.print("makan : ");
        int m2=input.nextInt();
        System.out.print("transportasi :");
        int t2=input.nextInt();
        System.out.print("belanja :");
        int b2= input.nextInt();
        int total2 =m2+t2+b2;
        System.out.println("Total pengeluaran hari ke-2 : "+total2);

//hari ke 3 
        System.out.println("\nHari ke-3\n");
        System.out.print("makan : ");
        int m3=input.nextInt();
        System.out.print("transportasi :");
        int t3=input.nextInt();
        System.out.print("belanja :");
        int b3=input.nextInt();
        int total3=m3+t3+b3;
        System.out.println("Total Pengeluaran hari ke-3 :"+total3);

//hari ke 4
        System.out.println("\nHari ke-4\n");
        System.out.print("makan :");
        int m4=input.nextInt();
        System.out.print("transportasi :");
        int t4=input.nextInt();
        System.out.print("belanja :");
        int b4=input.nextInt();
        int total4=m4+t4+b4;
        System.out.println("Total pengeluaran hari ke-4 :"+total4);

//hari ke 5
        System.out.println("\nHari ke-5\n");
        System.out.print("makan :");
        int m5=input.nextInt();
        System.out.print("transportasi :");
        int t5=input.nextInt();
        System.out.print("belanja :");
        int b5=input.nextInt();
        int total5=m5+t5+b5;
        System.out.println("Total pengeluaran hari ke-5:"+total5);

// hari ke 6
        System.out.println("\nHari ke-6\n");
        System.out.print("makan :");
        int m6=input.nextInt();
        System.out.print("transportasi :");
        int t6=input.nextInt();
        System.out.print("belanja :");
        int b6=input.nextInt();
        int total6=m6+t6+b6;
        System.out.println("Total pengeluaran hari ke-6 :"+total6);

// hari ke 7
        System.out.println("\nHari ke-7\n");
        System.out.print("makan : ");
        int m7=input.nextInt();
        System.out.print("transportasi : ");
        int t7=input.nextInt();
        System.out.print("belanja :");
        int b7=input.nextInt();
        int total7=m7+t7+b7;
        System.out.print("Total pengeluaran hari ke-7 :"+total7);

        System.out.println("\n===============================");
        
        //total pengeluaran 1 minggu 
        int totalmingguan=total1+total2+total3+total3+total4+total5+total6+total7;
        System.out.println("Total pengeluaran 7 hari ="+totalmingguan);
        System.out.println("==========================================");
    
    }
}
