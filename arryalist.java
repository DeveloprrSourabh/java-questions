import java.util.ArrayList;
import java.util.Collections;

public class arryalist {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2= new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    //add element
    list.add(0);
    list.add(1);
    list.add(2);
System.out.println(list);

//get elements

int element = list.get(0);
System.out.println("Mera Number " + element);

//add element in between

list.add(1,9);
System.out.println(list);

//set element
list.set(0, 8);
System.out.println(list);

//delete element
list.remove(3); 
System.out.println(list);

//size
int size = list.size();
System.out.println(size);

//sorting
Collections.sort(list);
System.out.println(list);

    }
}
