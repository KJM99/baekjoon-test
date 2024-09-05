import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int side = 2;
        int dots = (side * 4) - 4;
        int squares = (side - 1) * (side - 1);
        int increase = 0;
        
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i ++){
            increase = (squares * 5) - ((side - 1) * (side - 2) * 2);
            dots = dots + increase;
            side = (side * 2) - 1;
            squares = (side - 1) * (side -1);
        }
        
        System.out.println(dots);
        
    }
}