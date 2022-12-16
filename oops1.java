class Pen{
    String color;
    String type;//ballpoint or gel
    public void write(){
System.out.println("Wrinting something");
    }   
    public  void printColor(){
        System.out.println(this.color);
    }
}

public class oops1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
       

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}