package cn.cstarter.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class BeautyName {
    
    /*
        名字的漂亮度
        https://www.nowcoder.com/questionTerminal/02cb8d3597cf416d9f6ae1b9ddc4fde3
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int N = scan.nextInt();
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = scan.next();
            }
            
            for (int i = 0; i < N; i++) {
                int[] count = new int[26];
                int len = str[i].length();
                for (int j = 0; j < len; j++) {
                    int ascii = str[i].charAt(j);
                    //System.out.println("ascii="+ascii);
                    if (ascii >= 'a' && ascii <= 'z') {
                        count[ascii - 97]++;
                    } else if (ascii >= 'A' && ascii <= 'Z') {
                        count[ascii - 65]++;
                    }
                }
                Arrays.sort(count);
                int beautiful = 0;
                for (int k = 0; k < 26; k++) {
                    beautiful += count[k] * (k + 1);
                }
                System.out.println(beautiful);
            }
        }
        scan.close();
    }
}
