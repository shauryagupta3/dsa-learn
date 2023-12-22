package leetcode;

import java.util.Arrays;

public class ques73 {
    public static void main(String[] args) {
        int[][] input = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 1 } };
        int[][] ans = setZeros(input);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] setZeros(int[][] arr) {
        int col0 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j == 0) {
                        col0 = 0;
                    } else {
                        arr[0][j] = 0;
                    }
                }
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                if ((j == 0 && col0 == 0) || (j != 0 && arr[0][j] == 0) || arr[i][0] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
