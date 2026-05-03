package projek_p6;

public class latihanClass_1_segitiga {
    private double tinggi;
    private double alas;

    public void settinggi(double tinggi ){
        this.tinggi = tinggi;
        }
    public void getalas(double alas){
        this.alas = alas;
    }
    public double gettinggi(){
        return tinggi;
    }    
    public double getalas(){
        return alas;
    }
    public double getluas(){
        return (this.tinggi * this.alas * 0.5);
    }
    public static void main (String args[]){
        latihanClass_1_segitiga s[]= new latihanClass_1_segitiga [2];
        Byte i;

        // membuat objek dari class segitiga 
        s[0] = new latihanClass_1_segitiga ();
        s[1] = new latihanClass_1_segitiga();
        s[0].settinggi(12.0);
        s[0].getalas(8.0);
        s[1].settinggi(11.23);
        s[1].getalas(7.7);

        for (i=0; i<2;i ++){
            System.out.println("segitiga ke-"+ (i+1));
            System.out.println("Tinggi ="+ s[i].gettinggi());
            System.out.println("Alas="+ s[i].getalas());
            System.out.println("Luas segitiga = "+ s[i].getluas());
        }




    }

    
}
