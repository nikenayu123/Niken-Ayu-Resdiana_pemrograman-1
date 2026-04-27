import java.util.Scanner;

public class latihanArray2 {
    public static void main(String[]args){
         Scanner input = new Scanner(System.in);

        System.out.print("Jumlah data:");
        int n= input.nextInt();

        int[] angka = new int[n];
        int total = 0;
        // input data 
        for(int i = 0; i < n; i++){
            System.out.print("Angka["+ i +"] = ");
            angka[i] = input.nextInt();
            total += angka[i]; // langsung dijumlah 
        }
        // output data 
        System.out.print("\nIsi array : ");
        for(int x : angka){
            System.out.print(x + " ");
        }
        System.out.println("\ntotal jumlah:" + total);
    }
}
