import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int rooms = 1;
        int layer = 1;
        int before = 0;
        while (rooms < num) {
            layer ++;
            before = rooms;
            rooms = rooms + layer;
        }

        int son = 0;
        int parents = layer+1;
        if ((layer % 2) == 1) {
            for (int i = num; i > before; i --) {
                son ++;
                parents --;
            }
            System.out.println(parents + "/" + son);
        } else {
            for (int i = before; i < num; i ++) {
                son ++;
                parents --;
            }
            System.out.println(son + "/" + parents);
        }

    }
}