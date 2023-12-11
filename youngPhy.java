import java.util.*;

public class youngPhy {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] forceVectors = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                forceVectors[i][j] = sc.nextInt();
            }
        }
        int xNet = 0, yNet = 0, zNet = 0;
        for(int i = 0; i < n; i++) {
            xNet += forceVectors[i][0];
            yNet += forceVectors[i][1];
            zNet += forceVectors[i][2];
        }
        if(xNet == 0 && yNet == 0 && zNet == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
