import java.util.*;

public class Subsqncesamestr{
    public static void subseqnc(String str, int idx, String newString,HashSet<String> set ){
if (idx == str.length()) {
    if (set.contains(newString)) {
        return;
    }else{
        System.out.println(newString);
        set.add(newString);
        return; 
    }
}

        char currChar = str.charAt(idx);
subseqnc(str, idx+1, newString+currChar, set);
subseqnc(str, idx+1, newString, set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subseqnc(str, 0, "", set);
    }
}