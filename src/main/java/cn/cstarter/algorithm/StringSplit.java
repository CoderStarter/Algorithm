package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class StringSplit {
    
    /*
        字符串分隔
        https://www.nowcoder.com/practice/d9162298cb5a437aad722fccccaae8a7
        •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
        •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line1 = s.next();
        String line2 = s.next();
        print(line1);
        print(line2);
    }
    
    private static void print(String line) {
        for (int i = 0; i * 8 < line.length(); i++) {
            if ((i + 1) * 8 < line.length()) {
                System.out.println(line.substring(i * 8, (i + 1) * 8));
            } else {
                StringBuilder b = new StringBuilder();
                for (int j = line.length() - i * 8; j < 8; j++) {
                    b.append("0");
                }
                System.out.println(line.substring(i * 8, line.length()) + b.toString());
            }
        }
    }
}
