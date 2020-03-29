package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class AppleSite {
    
    /*
        放苹果
        https://www.nowcoder.com/questionTerminal/bfd8234bb5e84be0b493656e390bdebf
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m < 1 || n > 10) {
                System.out.println(-1);
            } else {
                System.out.println(shareCount(m, n));
            }
        }
    }
    
    public static int shareCount(int m, int n) {
        if (m < 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        return shareCount(m, n - 1) + shareCount(m - n, n);
    }
}
