import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tc = Integer.parseInt(br.readLine());
        int minX = 10000;
        int maxX = -10000;
        int minY = 10000;
        int maxY = -10000;
        
        for(int i = 0; i < tc; i ++) {
            String point = br.readLine();
            int x = Integer.parseInt(point.split(" ")[0]);
            int y = Integer.parseInt(point.split(" ")[1]);
            
            if(maxX < x) maxX = x;
            if(minX > x) minX = x;
            if(maxY < y) maxY = y;
            if(minY > y) minY = y;
        }
        
        System.out.println((maxX-minX)*(maxY-minY));
    }
}