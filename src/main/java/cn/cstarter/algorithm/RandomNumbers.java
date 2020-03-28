package cn.cstarter.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class RandomNumbers {
    
    /*
        明明的随机数
        https://www.nowcoder.com/profile/9409855/codeBookDetail?submissionId=71441498
    
        明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
        对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，
        按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
     */
    
    public static void main(String[] args) {
        List<Integer> indexes = new ArrayList<>();
        List<Integer[]> values = new ArrayList<>();
        
        build(indexes, values);
    
        distinctAndSort(values);
    
        print(values);
        
    }
    
    private static void build(List<Integer> indexes, List<Integer[]> values) {
        int segCount = 0;
        int segIndex = 0;
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int num = s.nextInt();
            if (num == 0) {
                break;
            }
            if (segCount == 0) {
                segCount = num;
                segIndex = 0;
                Integer[] nums = new Integer[num];
                indexes.add(num);
                values.add(nums);
            } else {
                int curIndex = values.size() - 1;
                values.get(curIndex)[segIndex] = num;
                segCount --;
                segIndex ++;
            }
        }
    }
    
    private static void distinctAndSort(List<Integer[]> values) {
        for (int i = 0; i < values.size(); i++) {
            Integer[] nums = values.get(i);
            Set<Integer> set = new HashSet<>(Arrays.asList(nums));
            Integer[] newArr = new Integer[set.size()];
            set.toArray(newArr);
            Arrays.sort(newArr);
            values.set(i, newArr);
        }
    }
    
    private static void print(List<Integer[]> values) {
        for (Integer[] nums : values) {
            for (Integer num : nums) {
                System.out.println(num);
            }
        }
    }
}
