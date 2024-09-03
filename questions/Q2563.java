package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] white = new int[101][101];
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String position = br.readLine();
            int x = Integer.parseInt(position.split(" ")[0]);
            int y = Integer.parseInt(position.split(" ")[1]);

            for (int j = x; j < x+10; j ++){
                for (int l = y; l < y+10; l++){
                    if (white[j][l] != 1) {
                        white[j][l] = 1;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (white[i][j] == 1) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }
}
