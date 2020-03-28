package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class LastWordLength {
    
    /*
        字符串最后一个单词的长度
        https://www.nowcoder.com/practice/8c949ea5f36f422594b306a2300315da
        计算字符串最后一个单词的长度，单词以空格隔开。
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int lastIndex = str.lastIndexOf(" ");
        String lastStr = str.substring(lastIndex + 1);
        System.out.print(lastStr.length());
    }
    
}
