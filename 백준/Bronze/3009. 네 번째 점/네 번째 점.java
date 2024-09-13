import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        int x1 = 0;
        int y1 = 0;

        int[] x = {
            Integer.parseInt(first.split(" ")[0]),
            Integer.parseInt(second.split(" ")[0]),
            Integer.parseInt(third.split(" ")[0])
        };

        int[] y = {Integer.parseInt(first.split(" ")[1]), Integer.parseInt(second.split(" ")[1]),
            Integer.parseInt(third.split(" ")[1])};

        if (x[0] == x[1]) {
            x1 = x[2];
        } else if (x[1] == x[2]) {
            x1 = x[0];
        } else {
            x1 = x[1];
        }

        if (y[0] == y[1]) {
            y1 = y[2];
        } else if (y[1] == y[2]) {
            y1 = y[0];
        } else {
            y1 = y[1];
        }

        System.out.println(x1 + " " + y1);
    }
}