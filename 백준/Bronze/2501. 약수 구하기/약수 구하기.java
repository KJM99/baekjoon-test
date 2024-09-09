import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int num = Integer.parseInt(input.split(" ")[0]);
        int seq = Integer.parseInt(input.split(" ")[1]);
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                stringBuilder.append(i);
                stringBuilder.append(" ");
            }
        }

        if(stringBuilder.toString().split(" ").length < seq) {
            System.out.println(0);
        } else {
            System.out.println(stringBuilder.toString().split(" ")[seq-1]);
        }
    }
}