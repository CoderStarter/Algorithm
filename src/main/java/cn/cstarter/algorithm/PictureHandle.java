package cn.cstarter.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class PictureHandle {
    
    /*
        图片整理
        https://www.nowcoder.com/questionTerminal/2de4127fda5e46858aa85d254af43941
        Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小（ASCII码值从小到大）排列收好。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            System.out.println(cs);
        }
        sc.close();
    }
}
