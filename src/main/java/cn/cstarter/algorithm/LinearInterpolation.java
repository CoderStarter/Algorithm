package cn.cstarter.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class LinearInterpolation {
    
    /*
        线性插值
        https://www.nowcoder.com/questionTerminal/91b4c0f9fa9545a582e5b38bb9f6b90e
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            //二维数组存储键值对
            int[][] data = new int[n][2];
            for (int i = 0; i < n; i++) {
                data[i][0] = sc.nextInt();
                data[i][1] = sc.nextInt();
            }
            
            ArrayList<String> list = new ArrayList<String>();
            //若出现重复值,利用这两个变量存储前一个值,丢弃后出现的重复值(如题目要求)
            int k = data[0][0];
            int v = data[0][1];
            list.add(k + " " + v);
            for (int i = 1; i <= n - 1; i++) {
                int diff = data[i][0] - k - 1;
                if (diff > 0) {
                    for (int j = 1; j <= diff; j++) {
                        int key = k + j;
                        int value = v + (data[i][1] - v) / (data[i][0] - k) * j;
                        list.add(key + " " + value);
                    }
                    list.add(data[i][0] + " " + data[i][1]);
                    k = data[i][0];
                    v = data[i][1];
                    //两个键相等则直接跳过,此时KEY,VVALUE保存的还是上一个值
                } else if (diff == -1)
                    continue;
                else {
                    list.add(data[i][0] + " " + data[i][1]);
                    k = data[i][0];
                    v = data[i][1];
                }
            }
            for (String s : list)
                System.out.println(s);
        }
    }
}
