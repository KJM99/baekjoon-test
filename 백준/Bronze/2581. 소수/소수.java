import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = 0;
        int max = 0;
        int sum = 0;

        for (int i = M; i <= N; i ++) {
            int count = 0;

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count ++;
                }
            }

            if(count == 2) {
                sum += i;
                if(min == 0) {
                    min = i;
                    max = i;
                } else {
                    if(max <= i){
                        max = i;
                    }
                }
            }
        }

        if(min != 0 && max != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }
}