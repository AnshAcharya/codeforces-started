import java.util.*;

public class longwords {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        StringBuilder []Answers = new StringBuilder[testCases];
        for (int i = 0; i < testCases; i++) {
            Answers[i] = new StringBuilder(sc.next());
            if(Answers[i].length() > 10) {
                String temp = "" + (Answers[i].length() - 2);
                char firstChar = Answers[i].charAt(0);
                char lastChar = Answers[i].charAt(Answers[i].length() - 1);
                Answers[i].delete(0, Answers[i].length());
                Answers[i].append(firstChar);
                Answers[i].append(temp);
                Answers[i].append(lastChar);
            }
        }
        for(int i = 0; i < testCases; i++) {
            System.out.println(Answers[i]);
        }
        sc.close();
    }
}
