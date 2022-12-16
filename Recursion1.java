 import java.util.*;
 
 class Recursion1 {

    public static void printFunc(int num){
        if(num == 6){
            return;
        }
        
        System.out.println(num);
        printFunc(num+1);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
printFunc(num);
   }
}
