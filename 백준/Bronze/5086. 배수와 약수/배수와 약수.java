import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for( ; ; ){
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            if(a == 0 && b == 0) break;

            if(a / b == 0) {
                if(b / a != 0 && b % a == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            } else if (a / b != 0 && a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }
    }

}
