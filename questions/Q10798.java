package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] words = new String[5][15];

        for(int i = 0; i < 5; i ++){
            String line = br.readLine();
            int num = line.length();
            System.arraycopy(line.split(""), 0, words[i], 0, num);
        }

        // for(int i = 0; i < 5; i ++){
        //     String line = br.readLine();
        //     int num = line.length();
        //     for (int j = 0; j < num; j ++){
        //         words[i][j] = line.split("")[j];
        //     }
        // }

        for(int j = 0; j < 15; j ++){
            for(int i = 0; i < 5; i ++){
                if(words[i][j] == null) continue;
                System.out.print(words[i][j]);
            }
        }
    }

}
