package cn.cstarter.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class HexToTen {
    
    /*
        进制转换
        https://www.nowcoder.com/practice/8f3df50d2b9043208c5eed283d1d4da6
        写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
     */
    public static void main(String[] args) {
        String keys = "0123456789ABCDEF";
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Integer ten = null;
            String next = scanner.next();
            if (next.startsWith("0x")) {
                ten = 0;
                String[] code = next.split("");
                for (int i = code.length - 1; i >= 2; i--) {
                    String s = code[i];
                    int index = keys.indexOf(s);
                    int value = values[index];
                    ten += (int)Math.pow(16, code.length - 1 -i) * value;
                }
            }
            System.out.println(ten);
        }
    }
}
