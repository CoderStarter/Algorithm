package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class MatrixMultiplication {
    
    /*
        矩阵乘法
        https://www.nowcoder.com/questionTerminal/ebe941260f8c4210aa8c17e99cbc663b
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            //获取行,列信息
            int row1 = scan.nextInt();
            int column = scan.nextInt();
            int column2 = scan.nextInt();
            int[][] first = new int[row1][column];
            int[][] second = new int[column][column2];
            int[][] temp = new int[row1][column2];
            //将数组存储在数组中
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column; j++) {
                    first[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < column2; j++) {
                    second[i][j] = scan.nextInt();
                }
            }
            //对数组进行计算
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column; k++) {
                        temp[i][j] += first[i][k] * second[k][j];
                    }
                }
            }
            //按照格式输出
            for (int i = 0; i < row1; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < column2; j++) {
                    if (j == column2 - 1) {
                        sb.append(temp[i][j]);
                    } else {
                        sb.append(temp[i][j]).append(" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}
