package projek_p6;

public class latihanClass_2_buku {
    private String judul;
    private int halaman;

    public void setjudul(String judul){
        this.judul = judul;
    }
    public void sethalaman(int halaman ){
        this.halaman = halaman;
    }
    public String getjudul(){
        return judul; 
    }
    public int gethalaman(){
        return halaman;
    }

    public static void main (String args[]){
        latihanClass_2_buku b[]= new latihanClass_2_buku[2];
        byte i;

        b[0]= new latihanClass_2_buku();
        b[1]= new latihanClass_2_buku();

        b[0].setjudul("Matematika");
        b[0].sethalaman(120);

        b[1].setjudul("Bahasa Inggris");
        b[1].sethalaman(95);

        for(i=0; i<2; i++){
            System.out.println("buku ke -"+ (i+1));
            System.out.println("Judul = "+ b[i].getjudul());
            System.out.println("halaman = "+ b[i].gethalaman());
            System.out.println();

        }
    }
}
