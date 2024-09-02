package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Q.
    <그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
    이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
    예를 들어, 다음과 같이 81개의 수가 주어지면 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.

    Input.
    첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.

    Output.
    첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
    최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
*/

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = new int[9][9];
        int row = 0;
        int col = 0;
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                if (max <= matrix[i][j]) { // 해당 부분이 < 일 경우 틀리는 이유에 대해 모르겠음
                    max = matrix[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.print(row + " " + col);
    }
}
