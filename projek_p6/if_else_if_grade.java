package projek_p6;

import java.util.Scanner;

public class if_else_if_grade {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan Nilai :");
        int nilai = input.nextInt();

        if (nilai>=85){
            System.out.println("Grade: A");
        } else if (nilai>=75){
            System.out.println("grade: B");
        } else if(nilai>= 65){
            System.out.println("Grade: C");
        } else if(nilai>= 50){
            System.out.println("Grade; D");
        } else {
            System.out.println("Grade:E");
        }

    }
    
    
}
