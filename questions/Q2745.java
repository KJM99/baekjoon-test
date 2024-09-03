package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String str1 = str.split(" ")[0];
        char[] B = new char[str1.length()];

        for (int i = str1.length(); i > 0 ; i--) {
            B = str1.toCharArray();
        }
        int[] dp = new int[str.length()];

        for (int i = 0; i < str1.length(); i++) {
            if(B[i] <= 57){
                dp[i] = B[i] - 48;
            } else if (B[i] >= 65 && B[i] <= 90) {
                dp[i] = B[i] - 55;
            }
        }

        int str2 = Integer.parseInt(str.split(" ")[1]);
        long result = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
            long temp = 1;
            for (int j = i; j < str1.length() - 1; j++){
                temp *= str2;
            }
            result += temp * dp[i];
        }
        System.out.println(result);
    }
}
