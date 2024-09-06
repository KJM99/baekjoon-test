import java.io.*;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int rooms = 1;
        int n = 1;

        while(rooms < num) {
            int before = rooms;
            rooms = before + (n * 6);
            n ++;
        }

        System.out.println(n);
    }
}