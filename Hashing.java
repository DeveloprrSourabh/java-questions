import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args) {
     
        //creting hashset
HashSet<Integer> set = new HashSet<>(); 

//Insert
set.add(1);
set.add(2);
set.add(3);
set.add(1);

//Size
System.out.println("size of set is : "+ set.size());

//Print all elements
System.out.println(set);

//Iterator
Iterator it = set.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}


//Search - Contains
if (set.contains(1)) {
    System.out.println("Set contains 1");
}
if (!set.contains(6)) {
    System.out.println("doesn't contains");
}

//Delete
 set.remove(1);
 if (!set.contains(1)) {
    System.out.println("does not contain 1 - we deleted");
 }

    }
}