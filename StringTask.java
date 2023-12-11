import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'U' || str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                str.delete(i, i + 1);
                i--;
            } else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                str.setCharAt(i, (char) (str.charAt(i) + 32));
                str.insert(i, '.');
                i++;
            } else {
                str.insert(i, '.');
                i++;
            }
        }
        // int n = (int)'a' - (int)'A';
        System.out.println(str);
        // System.out.println("output is here : "+str);
        sc.close();
    }

}
