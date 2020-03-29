package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class DNASerial {
    
    /*
        DNA序列
        https://www.nowcoder.com/questionTerminal/e8480ed7501640709354db1cc4ffd42a
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.next();
            int n = input.nextInt();
            int max = 0;
            int maxBeginIndex = 0;
            for (int i = 0; i <= str.length() - n; i++) {
                int count = 0;
                for (int j = i; j < i + n; j++) {
                    if (str.charAt(j) == 'G' || str.charAt(j) == 'C')
                        count++;
                }
                if (count > max) {
                    maxBeginIndex = i;
                    max = count;
                }
            }
            System.out.println(str.substring(maxBeginIndex, maxBeginIndex + n));
        }
    }
}
