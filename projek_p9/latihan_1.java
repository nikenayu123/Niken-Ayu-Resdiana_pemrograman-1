package projek_p9;

abstract class latihan_1 {
    public void breath(){
        System.out.println("Bernafas melalui hidung");
    }
    public void eat(){
        System.out.println("Makan melalui mulut");
    }
    public abstract void walk();
}
class Human extends latihan_1{
    public void walk(){
        System.out.println("Berjalan dengan dua kaki");
    }
    public  static void main(String[]args){
        Human h= new Human();
        h.breath();
        h.eat();
        h.walk();
    }
}
