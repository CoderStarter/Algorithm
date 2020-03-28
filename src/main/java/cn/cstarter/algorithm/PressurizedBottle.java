package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @desc :
 * @author : blog.cstarter.cn
 * @time : 2020-03-27
 */
public class PressurizedBottle {
    
    /*
     * 汽水瓶
     * https://www.nowcoder.com/questionTerminal/fe298c55694f4ed39e256170ff2c205f
     *
     * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
     * 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
     * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int num = s.nextInt();
            if (num == 0) {
                break;
            }
            int total = compute(num);
            System.out.println(total);
        }
    }
    
    public static int compute(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return n / 3 + compute(n / 3 + n % 3);
        }
    }
}
