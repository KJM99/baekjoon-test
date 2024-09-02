package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Q.
    N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

    Input.
    첫째 줄에 행렬의 크기 N 과 M이 주어진다.
    둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
    이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고,
    행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

    Output.
    첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

 */

public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String matrix = br.readLine();
        int N = Integer.parseInt(matrix.split(" ")[0]);
        int M = Integer.parseInt(matrix.split(" ")[1]);

        int[][] mat = new int[N][M];
        int[][] rix = new int[N][M];

        for (int i = 0; i < N; i++) {
            matrix = br.readLine();
            for (int j = 0; j < M; j++) {
                mat[i][j] = Integer.parseInt(matrix.split(" ")[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            matrix = br.readLine();
            for (int j = 0; j < M; j++) {
                rix[i][j] = Integer.parseInt(matrix.split(" ")[j]);
            }
        }
        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = mat[i][j] + rix[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}