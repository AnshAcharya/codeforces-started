import java.util.*;

public class nextround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),  k = sc.nextInt();
        //System.out.println("n = " + n + "k = " + k);
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        int answer = score[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if(score[i + 1] <= k && score[i] > k) {
                answer = i + 2;
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
