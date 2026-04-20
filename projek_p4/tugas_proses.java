
package projek_p4;

import java.util.Scanner;

public class tugas_proses {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama:");
        String nama=input.nextLine();
        
        String besar=nama.toUpperCase();
        String kecil=nama.toLowerCase();

        System.out.println("Huruf besar:"+besar);
        System.out.println("Huruf kecil:"+ kecil);

        input.close();
        
    }

    
}
