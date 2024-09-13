import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String xywh = br.readLine();
        int min = 1000;
        
        for (int i = 0; i < 4; i ++) {
            if(i > 1) {
                if(min > Integer.parseInt(xywh.split(" ")[i]) - Integer.parseInt(xywh.split(" ")[i-2])) {
                    min = Integer.parseInt(xywh.split(" ")[i]) - Integer.parseInt(xywh.split(" ")[i-2]);
                }
            }else {
                if(min > Integer.parseInt(xywh.split(" ")[i]) - 0) {
                    min = Integer.parseInt(xywh.split(" ")[i]) - 0;
                }
            }
        }
        
        System.out.println(min);
    }
}