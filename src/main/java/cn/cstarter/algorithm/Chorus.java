package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class Chorus {
    
    /*
        合唱队问题
        https://www.nowcoder.com/questionTerminal/6d9d69e3898f45169a441632b325c7b4
        计算最少出列多少位同学，使得剩下的同学排成合唱队形
        
        说明：
        N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
        合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
        你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
        
        请注意处理多组输入输出！
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println(function(a));
        }
        sc.close();
    }
    
    // 实现合唱队排队的功能
    public static int function(int[] a) {
        int n = a.length;
        
        if (n == 0)
            return 0;
        
        int[] dpForword = dpForword(a);
        int[] dpBackward = dpBackward(a);
        
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            max = Math.max(dpForword[i] + dpBackward[i], max);
        }
        
        return n - (max - 1);
    }
    
    // 正向递增最长子序列
    public static int[] dpForword(int[] a) {
        int n = a.length;
        int[] dp = new int[n];
        
        dp[0] = 1;
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && dp[j] + 1 > dp[i])
                    dp[i] = dp[j] + 1;
            }
        }
        
        return dp;
    }
    
    // 逆向递增最长子序列
    public static int[] dpBackward(int[] a) {
        int n = a.length;
        int[] dp = new int[n];
        
        dp[n - 1] = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[i] && dp[j] + 1 > dp[i])
                    dp[i] = dp[j] + 1;
            }
        }
        
        return dp;
    }
    
}
