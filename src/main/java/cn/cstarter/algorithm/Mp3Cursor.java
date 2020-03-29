package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class Mp3Cursor {
    
    /*
        MP3光标位置
        https://www.nowcoder.com/questionTerminal/eaf5b886bd6645dd9cfb5406f3753e15
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String str = sc.next();
            int top = 1, index = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'U') {
                    if (top == index) {
                        top = top == 1 ? num - 3 : top - 1;
                    }
                    index = (index == 1) ? num : index - 1;
                } else if (str.charAt(i) == 'D') {
                    if (top + 3 == index) {
                        top = index == num ? 1 : top + 1;
                    }
                    index = index == num ? 1 : index + 1;
                }
            }
            if (num < 4)
                top = 1;
            for (int i = 0; i < 3 && i < num - 1; i++) {
                System.out.print(top + i + " ");
            }
            System.out.println(top + (4 > num ? num - 1 : 3));
            System.out.println(index);
        }
    }
}
