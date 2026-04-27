package projek_p8;

import java.util.Scanner;

public class lat_input_mahasiswa_sederhana {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        char ulang;

        do{
            System.out.print("nama :");
            String nama = input.nextLine();

            System.out.print("Nim :");
            String nim=input.nextLine();

            System.out.println("Data :"+ nama + "-"+ nim);

            System.out.print("Ulangi ? (y/t):");
            ulang=input.next().charAt(0);
            input.nextLine();// biar tidak eror 

        } while(ulang =='y'|| ulang=='Y');


    }
}
