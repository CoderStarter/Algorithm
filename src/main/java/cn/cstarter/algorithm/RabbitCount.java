package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class RabbitCount {
    
    /*
        统计每个月兔子的数量
        https://www.nowcoder.com/questionTerminal/1221ec77125d4370833fd3ad5ba72395
        有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
     */
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            System.out.println(getNumber(input));
            
        }
    }
    //通过列举出每月的有生育能力兔子的数目，没有生能力的兔子的说目，一月大的兔子的数目和二月大的兔子的数目可知
    //
    public static int getNumber(int mounth){
        if(mounth == 1 || mounth == 2){
            return 1;
        }
        int lastMonth = 1;
        int lastYoung = 1;
        int monthOne = 1;
        int monthTwo = 0;
        for(int j = 4; j <= mounth; j++){
            //第一步，第二个月的变成了有生育能力的兔子
            lastMonth += monthTwo;
            //第二步，一个月大的兔子变成了两个月大的兔子
            monthTwo = monthOne;
            //第三步，有生育能力的兔子生出了一个月大的小兔子
            monthOne = lastMonth;
            //当月小兔子的个数
            lastYoung = monthOne + monthTwo;
            
        }
        return lastMonth + lastYoung;
    }
}
