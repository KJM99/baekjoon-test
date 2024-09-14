import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sticks = br.readLine();
        int[] stick = {
            Integer.parseInt(sticks.split(" ")[0]),
            Integer.parseInt(sticks.split(" ")[1]),
            Integer.parseInt(sticks.split(" ")[2])
        };

        int max = stick[0];

        for (int j : stick) {
            if (max < j) {
                max = j;
            }
        }

        if(max == stick[0]) {
            while(stick[1] + stick[2] <= max) {
                max --;
            }
            System.out.println(stick[1] + stick[2] + max);
        } else if(max == stick[1]) {
            while(stick[0] + stick[2] <= max) {
                max --;
            }
            System.out.println(stick[0] + stick[2] + max);
        } else {
            while(stick[0] + stick[1] <= max) {
                max --;
            }
            System.out.println(stick[0] + stick[1] + max);
        }
    }
}