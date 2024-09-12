import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= num; i ++) {
            while (num % i == 0) {
                sb.append(i);
                sb.append(" ");
                num /= i;
            }
        }

        for (int i = 0; i < sb.toString().split(" ").length; i ++) {
            System.out.println(sb.toString().split(" ")[i]);
        }
    }
}