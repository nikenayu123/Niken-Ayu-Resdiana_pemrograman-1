
// Modul : Modifikasi program dibawah ini agar dapat menampilkan nilai maksimal, nilai minimal dan mengurutkan data dalam array.
import java.util.Scanner;
import java.util.Arrays;

public class latihanArray1 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("Jumlah data : ");
        int n = input.nextInt();
        int[] data=new int[n];

        for(int i = 0; i< n; i++){
            System.out.print("Data["+ i+ "]=");
            data[i]=input.nextInt();
        }
        Arrays.sort(data);
        System.out.print("\nMin:"+ data[0]);
        System.out.println("\nMax:"+ data[n-1]);

        System.out.print("Data urut : ");
        for (int x : data ){
            System.out.print(x + " ");
        }

    }
    
}
