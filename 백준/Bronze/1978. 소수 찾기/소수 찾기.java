import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        
        String num = br.readLine();
        
        for(int i = 0; i < n; i ++) {
            int count = 0;
            int number = Integer.parseInt(num.split(" ")[i]);
            for (int j = 1; j <= number; j ++) {
                if(number % j == 0) {
                    count ++;
                }
            }
            
            if (count == 2) result ++;
        }
        
        System.out.println(result);
    }
}