package cn.cstarter.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class Counterpoise {
    
    /*
        称砝码
        https://www.nowcoder.com/questionTerminal/f9a4c19050fc477e9e27eb75f3bfd49c
     */
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] weight = new int[n];
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                weight[i] = in.nextInt();
            }
            for(int i = 0; i < n; i++){
                nums[i] = in.nextInt();
            }
            System.out.println(fama(n, weight, nums));
        }
        in.close();
    }
    
    public static int fama(int n, int[] weight, int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i <= nums[0]; i++){
            set.add(weight[0] * i);
        }
        for(int i = 1; i < n; i++){
            List<Integer> list = new ArrayList<Integer>(set);
            for(int j = 0; j <= nums[i]; j++){
                for(int k = 0; k < list.size(); k++){
                    set.add(list.get(k) + j * weight[i]);
                }
            }
        }
        return set.size();
    }
    
}
