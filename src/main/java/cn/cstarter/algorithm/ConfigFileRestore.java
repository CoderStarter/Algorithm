package cn.cstarter.algorithm;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class ConfigFileRestore {
    
    /*
        配置文件恢复
        https://www.nowcoder.com/questionTerminal/ca6ac6ef9538419abf6f883f7d6f6ee5
     */
    
    public static boolean isMatch(String src, String des) {
        char[] c1 = src.toCharArray();
        char[] c2 = des.toCharArray();
        int i = 0;
        while (i < c1.length && i < c2.length) {
            if (c1[i] == c2[i])
                i++;
            else
                break;
        }
        if (i == c1.length)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("reset", "reset what");
        hMap.put("reset board", "board fault");
        hMap.put("board add", "where to add");
        hMap.put("board delet", "no board at all");
        hMap.put("reboot backplane", "impossible");
        hMap.put("backplane abort", "install first");
        while (scanner.hasNext()) {
            String[] strs = scanner.nextLine().split(" ");
            int count = 0; // 记录匹配个数
            Set<String> set = hMap.keySet();
            String key = "";
            for (String s : set) {
                String[] temps = s.split(" ");
                if (temps.length == strs.length) {
                    int i = 0;
                    while (i < temps.length) {
                        if (isMatch(strs[i], temps[i]))
                            i++;
                        else
                            break;
                    }
                    if (i == temps.length) { // 找到匹配
                        key = s;
                        count++;
                    }
                }
            }
            if (count != 1)
                System.out.println("unkown command");
            else
                System.out.println(hMap.get(key));
            
        }
        scanner.close();
    }
}
