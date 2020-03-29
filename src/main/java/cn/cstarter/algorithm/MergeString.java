package cn.cstarter.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class MergeString {
    
    /*
        字符串合并处理
        https://www.nowcoder.com/questionTerminal/d3d8e23870584782b3dd48f26cb39c8f
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            str = str + sc.next();
            int len = str.length();
            char[] odd = new char[len / 2];
            char[] even = new char[len / 2 + len % 2];
            int index = 0;
            for (int i = 0; i < len; i++) {
                if (i % 2 != 0) {
                    odd[index] = str.charAt(i);//奇数
                    index++;
                }
            }
            index = 0;
            for (int i = 0; i < len; i++) {
                if (i % 2 == 0) {
                    even[index] = str.charAt(i);//偶数
                    index++;
                }
            }
            Arrays.sort(odd);
            Arrays.sort(even);
            StringBuffer merge = new StringBuffer();
            merge.append(String.valueOf(even));
            index = 0;
            for (int i = 0; i < len; i++) {
                if (i % 2 != 0) {
                    merge.insert(i, odd[index]);//奇偶数组合并
                    index++;
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < merge.length(); i++) {
                char cur = merge.charAt(i);
                sb.append(turn(cur));
            }
            System.out.println(sb.toString());
        }
    }
    
    public static char turn(char cur1) {
        char result = cur1;
        String temp = "";
        if (cur1 >= '0' && cur1 <= '9') {
            temp = Integer.toBinaryString(cur1 - 48);
        } else if (cur1 >= 'a' && cur1 <= 'f') {
            temp = Integer.toBinaryString(cur1 - 87);
        } else if (cur1 >= 'A' && cur1 <= 'F') {
            temp = Integer.toBinaryString(cur1 - 55);
        }
        if (temp != "") {
            temp = "0000" + temp;
            temp = temp.substring(temp.length() - 4);
            StringBuffer sb = new StringBuffer();
            sb.append(temp);
            temp = sb.reverse().toString();
            int binToInt = Integer.parseInt(temp, 2);
            if (binToInt < 10) {
                result = (char) (binToInt + 48);
            } else {
                result = (char) (binToInt + 55);
            }
        }
        return result;
    }
}
