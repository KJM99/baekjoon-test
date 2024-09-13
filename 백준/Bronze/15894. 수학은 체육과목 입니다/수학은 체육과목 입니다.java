import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long num = Long.parseLong(br.readLine());
        
        System.out.println(num * 4);
    }
}