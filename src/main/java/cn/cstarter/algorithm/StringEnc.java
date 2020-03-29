package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class StringEnc {
    
    /*
        字符串加密
        https://www.nowcoder.com/questionTerminal/e4af1fe682b54459b2a211df91a91cf3
        有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词属于字母表的下面，如下所示：
        A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String key = scanner.nextLine();
            String input = scanner.nextLine();
            encryptStr(key, input);
        }
    }
    
    public static void encryptStr(String key, String input) {
        String lowerDict = "abcdefghijklmnopqrstuvwxyz";
        String upperDict = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String tempDict = "abcdefghijklmnopqrstuvwxyz";
        key = key.toLowerCase();
        StringBuilder lowerKeyDict = new StringBuilder();
        // build new keyDict;
        for (char c : key.toCharArray()) {
            if (tempDict.indexOf(c) >= 0) {
                lowerKeyDict.append(c);
                tempDict = tempDict.replaceAll(c + "", "");
            }
        }
        for (char c : lowerDict.toCharArray()) {
            if (lowerKeyDict.toString().indexOf(c) < 0) {
                lowerKeyDict.append(c);
            }
        }
        String upperKeyDict = lowerKeyDict.toString().toUpperCase();
        StringBuilder res = new StringBuilder();
        // start encrypt;
        for (char c : input.toCharArray()) {
            // if is lowercase
            if (Character.isLowerCase(c)) {
                res.append(lowerKeyDict.charAt(lowerDict.indexOf(c)));
            }
            // if is uppercase
            else if (Character.isUpperCase(c)) {
                res.append(upperKeyDict.charAt(upperDict.indexOf(c)));
            } else {
                res.append(" ");
            }
            
        }
        System.out.println(res);
    }
}
