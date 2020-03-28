package cn.cstarter.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class RandomNumbers {
    
    public static void main(String[] args) {
        List<Integer> indexes = new ArrayList<>();
        List<Integer[]> values = new ArrayList<>();
        int curIndex = 0;
        int count = 0;
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int num = s.nextInt();
            System.out.println(num);
            if (curIndex == count) {
                Integer[] nums = new Integer[num];
                indexes.add(num);
                values.add(nums);
                count += (num + 1);
            } else {
                values.get(values.size() - 1)[count - curIndex] = num;
            }
            curIndex ++;
        }
        for (Integer[] nums : values) {
            for (Integer num : nums) {
                System.out.println(num);
            }
        }
        
    }
}
