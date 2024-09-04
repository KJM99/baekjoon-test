import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int input1 = Integer.parseInt(input.split(" ")[0]);
        int input2 = Integer.parseInt(input.split(" ")[1]);
        StringBuilder result = new StringBuilder();
        char ch;
        while ((input1 > 0)){
            if((input1 % input2 > 9) && (input1 % input2 < 36)) {
                ch = (char) ((input1 % input2) + 55);
                result.append(ch);
            } else {
                result.append(input1 % input2);
            }
            input1 = input1 / input2;
        }

        System.out.println(result.reverse());
    }

}
