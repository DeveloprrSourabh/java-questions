public class Printsubsequence{
    public static void subseqnc(String str, int idx, String newString){
if (idx == str.length()) {
    System.out.println(newString);
    return;
}

        char currChar = str.charAt(idx);
subseqnc(str, idx+1, newString+currChar);
subseqnc(str, idx+1, newString);

    }
    public static void main(String[] args) {
        String str = "abc";
        subseqnc(str, 0, "");
    }
}