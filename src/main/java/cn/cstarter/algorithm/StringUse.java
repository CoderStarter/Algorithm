package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class StringUse {
    
    /*
        字符串运用
        https://www.nowcoder.com/questionTerminal/3cd4621963e8454594f00199f4536bb1
        Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，
        但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。
        因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），Cathcer的工作量实在是太大了，
        他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(process(str));
        }
        in.close();
    }
    
    public static int process(String str) {
        int len = str.length();
        if (len < 1) {
            return 0;
        }
        int max = 1;//只要字符创长度大于1，则最短的回文串长度为1
        //考虑奇数个数的回文串
        for (int i = 1; i < len - 1; i++) {
            int k = i - 1, j = i + 1;
            int count = 0;
            while (k >= 0 && j <= len - 1) {
                if (str.charAt(k--) == str.charAt(j++)) {
                    count++;
                } else {
                    break;
                }
            }
            max = (max >= (count * 2 + 1)) ? max : (count * 2 + 1);
        }
        //现在考虑偶数回文串的情况，主要考虑字符之间的位置
        for (int i = 1; i < len - 1; i++) {
            int k = i - 1, j = i;
            int count = 0;
            while (k >= 0 && j <= len - 1) {
                if (str.charAt(k--) == str.charAt(j++)) {
                    count++;
                } else {
                    break;
                }
            }
            max = (max >= count * 2) ? max : (count * 2);
        }
        return max;
    }
}
