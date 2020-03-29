package cn.cstarter.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class HighIntegerPlus {
    
    /*
        高精度整数加法
        https://www.nowcoder.com/questionTerminal/49e772ab08994a96980f9618892e55b6
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            System.out.println(c.add(d));
        }
    }
}
