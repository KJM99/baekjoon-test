import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long result = 0;
        
        for (long i = n-1; i > 0; i --) {
            result += i;
        }
        
        System.out.println(result);
        System.out.println(2);
    }
}