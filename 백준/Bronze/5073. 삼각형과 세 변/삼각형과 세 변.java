import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;

        while(true) {
            String lengths = br.readLine();
            a = Integer.parseInt(lengths.split(" ")[0]);
            b = Integer.parseInt(lengths.split(" ")[1]);
            c = Integer.parseInt(lengths.split(" ")[2]);

            if(b == c && c == a) {
                if(a == 0) {
                    break;
                }
                System.out.println("Equilateral");
            } else if(a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Invalid");
            } else if(a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}