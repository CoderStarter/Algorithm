package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class FloorFloat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v = scanner.nextFloat();
        System.out.println(Math.round(v));
    }
}
