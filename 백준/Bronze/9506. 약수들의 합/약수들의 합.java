import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        while (num != -1){
            StringBuilder stringBuilder = new StringBuilder();
            int sum = 0;
            for (int i = 1; i < num; i ++) {
                if(num % i == 0) {
                    sum += i;
                    stringBuilder.append(i);
                    stringBuilder.append(" ");
                }
            }

            if (sum != num) {
                System.out.println(num + " is NOT perfect.");
            } else {
                System.out.print(num + " = ");
                for(int i = 0; i < stringBuilder.toString().split(" ").length; i ++) {
                    System.out.print(stringBuilder.toString().split(" ")[i]);
                    if(i != stringBuilder.toString().split(" ").length - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }

            num = Integer.parseInt(br.readLine());
        }

    }
}