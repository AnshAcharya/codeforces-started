import java.util.Scanner;

public class chatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = word.length();
        int hIndex = -1, eIndex = -1, l1Index = -1, l2Index = -1, oIndex = -1;

        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);

            if (ch == 'h' && hIndex == -1) {
                hIndex = i;
            } else if (ch == 'e' && eIndex == -1 && hIndex != -1) {
                eIndex = i;
            } else if (ch == 'l' && l1Index == -1 && eIndex != -1) {
                l1Index = i;
            } else if (ch == 'l' && l2Index == -1 && l1Index != -1) {
                l2Index = i;
            } else if (ch == 'o' && oIndex == -1 && l2Index != -1) {
                oIndex = i;
                break;  // Exit the loop once 'o' is found after 'l'
            }
        }

        if (hIndex != -1 && eIndex != -1 && l1Index != -1 && l2Index != -1 && oIndex != -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
