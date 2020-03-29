package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class Snake {
    
    /*
        蛇形矩阵
        https://www.nowcoder.com/questionTerminal/649b210ef44446e3b1cd1be6fa4cab5e
        蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形
     */
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int N = in.nextInt();
            int firstCol = 1;
            for(int i = 1; i <= N; i++){
                System.out.print(firstCol);
                int tmp = firstCol;
                for(int j = i+1; j <= N; j++){
                    tmp += j;
                    System.out.print(" " + tmp);
                }
                System.out.println();
                firstCol += i;
            }
        }
        in.close();
    }
}
