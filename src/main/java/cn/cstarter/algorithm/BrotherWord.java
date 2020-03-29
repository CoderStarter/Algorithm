package cn.cstarter.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class BrotherWord {
    
    /*
        查找兄弟单词
        https://www.nowcoder.com/questionTerminal/03ba8aeeef73400ca7a37a5f3370fe68
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int wordsNum = scanner.nextInt();
            String[] dict = new String[wordsNum];
            for (int i = 0; i < wordsNum; i++) {
                dict[i] = scanner.next();
            }
            String target = scanner.next();
            int brotherIndex = scanner.nextInt();
            process(dict, target, brotherIndex);
            scanner.nextLine();
        }
    }
    
    public static void process(String[] dict, String target, int brotherIndex) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(dict);
        for (String cur : dict) {
            if (isBrother(target, cur)) {
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if (brotherIndex <= list.size() && list.size() > 0) {
            System.out.println(list.get(brotherIndex - 1));
        }
    }
    
    public static boolean isBrother(String target, String cur) {
        // target can not same as cur
        if (target.equals(cur)) {
            return false;
        }
        // length must be same
        if (target.length() != cur.length()) {
            return false;
        }
        // norm case
        char[] targetArray = target.toCharArray();
        char[] curArray = cur.toCharArray();
        // sortted array must be same
        Arrays.sort(targetArray);
        Arrays.sort(curArray);
        for (int i = 0; i < curArray.length; i++) {
            if (targetArray[i] != curArray[i]) {
                return false;
            }
        }
        return true;
    }
}
