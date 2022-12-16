import java.util.*;

public class Hashmap {
    public static void main(String[] args) {

        // Hashmap creating
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        // Serach
        if (map.containsKey("www")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));//Key exists
        System.out.println(map.get("Indonesia"));//Key doesn't exists


        //Iterartion
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.println(e.getValue());

        }
    }
}
