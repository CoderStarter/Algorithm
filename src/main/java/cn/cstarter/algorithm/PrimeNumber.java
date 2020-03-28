package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class PrimeNumber {
    
    /*
        质数因子
        https://www.nowcoder.com/practice/196534628ca6490ebce2e336b47b3607
        功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（如180的质因子为2 2 3 3 5 ）
        最后一个数后面也要有空格
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            long num = scan.nextLong();
            calculate(num);
        }
    }
    public static void calculate(long num){
        for(long i=2;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                calculate(num/i);
                break;
            }
        }
    }
}
