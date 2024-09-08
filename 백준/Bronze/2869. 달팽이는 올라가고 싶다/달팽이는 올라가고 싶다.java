import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int up = Integer.parseInt(input.split(" ")[0]);
        int down = Integer.parseInt(input.split(" ")[1]);
        int meter = Integer.parseInt(input.split(" ")[2]);
        
        int days = (meter - down - 1) / (up - down) + 1;

        System.out.println(days);
    }
}