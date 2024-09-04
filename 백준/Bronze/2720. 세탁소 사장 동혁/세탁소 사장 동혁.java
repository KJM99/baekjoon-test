import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        for (int i = 0; i < tc; i++) {
            StringBuilder result = new StringBuilder();
            int change = Integer.parseInt(br.readLine());
            result.append(change / quarter);
            result.append(" ");
            change %= quarter;
            result.append(change / dime);
            result.append(" ");
            change %= dime;
            result.append(change / nickel);
            result.append(" ");
            result.append(change % nickel);

            System.out.println(result);
        }
    }
}