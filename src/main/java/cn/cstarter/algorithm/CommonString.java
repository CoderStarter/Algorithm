package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class CommonString {
    
    /*
        查找两个字符串中最长公共子串
        https://www.nowcoder.com/questionTerminal/181a1a71c7574266ad07f9739f791506
     */
    
    public static void compare(String str1, String str2) {
        String result = "";
        for (int i = 1; i < str1.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i - 1; j < str1.length(); j++) {
                if (str2.contains(sb.append(str1.charAt(j)))) {
                    if (sb.length() > result.length()) {
                        result = sb.toString();
                    }
                }
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            if (str1.length() <= str2.length()) {
                compare(str1, str2);
            } else {
                compare(str2, str1);
            }
        }
    }
}
