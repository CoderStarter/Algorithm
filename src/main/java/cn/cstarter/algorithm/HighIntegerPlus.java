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
        https://www.nowcoder.com/questionTerminal/5821836e0ec140c1aa29510fd05f45fc
     */
    
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     while (in.hasNext()) {
    //         String a = in.next();
    //         String b = in.next();
    //         BigInteger c = new BigInteger(a);
    //         BigInteger d = new BigInteger(b);
    //         System.out.println(c.add(d));
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            
            // 求出两个字符串中较长的那个字符串长度
            int lenA = a.length();
            int lenB = b.length();
            int lenS = Math.max(lenA, lenB);
            
            // arrS保存最终生成的结果
            int[] arrA = new int[lenS];
            int[] arrB = new int[lenS];
            int[] arrS = new int[lenS + 1];
            
            for (int i = 0; i < lenA; i++) {
                arrA[i] = a.charAt(lenA - 1 - i) - '0';
            }
            
            for (int i = 0; i < lenB; i++) {
                arrB[i] = b.charAt(lenB - 1 - i) - '0';
            }
            
            for (int i = 0; i < lenS; i++) {
                int sum = arrS[i] + arrA[i] + arrB[i];
                int flag = sum / 10;
                arrS[i] = sum % 10;
                arrS[i + 1] += flag;
            }
            
            for (int i = arrS[lenS] == 0 ? 1 : 0; i < lenS + 1; i++) {
                System.out.print(arrS[lenS - i]);
            }
            
            System.out.println();
            
        }
        
        scan.close();
    }
}