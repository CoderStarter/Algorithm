package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class CharNumInWord {
    
    /*
        计算字符个数
        https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1
        写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String c = s.next();
        String[] strs = word.split("");
        int count = 0;
        for (String str : strs) {
            if (str.equalsIgnoreCase(c)) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
