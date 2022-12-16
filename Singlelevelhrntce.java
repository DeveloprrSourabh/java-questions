 import java.util.*;

import bank.*;
 class shape  {
    public void area(){
        System.out.println("display area");
    }
}
class triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//multiple--inheritence

class Equailateraltriangle extends triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

//hirericle--inheritence
class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class Singlelevelhrntce{
    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();

        account1.name = "customer1";
    }

}