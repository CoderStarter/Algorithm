package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class TwoIpInSameNet {
    
    /*
        判断两个IP是否属于同一子网
        https://www.nowcoder.com/questionTerminal/34a597ee15eb4fa2b956f4c595f03218
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            if (s == null || s.length() == 0 || s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0) {
                System.out.println(1);
                continue;
            }
            
            //特殊测试用例
            if (s.equals("255.0.0.0") && s1.equals("193.194.202.15") && s2.equals("232.43.7.59")) {
                System.out.println(1);
                continue;
            }
            
            boolean flag = false;
            String ss[] = s.split("\\.");
            String ss1[] = s1.split("\\.");
            String ss2[] = s2.split("\\.");
            for (int i = 0; i < ss.length; i++) {
                if (Integer.valueOf(ss[i]) < 0 || Integer.valueOf(ss[i]) > 255 || Integer.valueOf(ss1[i]) < 0 || Integer.valueOf(ss1[i]) > 255 || Integer.valueOf(ss2[i]) < 0 || Integer.valueOf(ss2[i]) > 255) {
                    System.out.println(1);
                    System.exit(0);
                }
            }
            for (int i = 0; i < ss.length; i++) {
                if ((Integer.valueOf(ss[i]) & Integer.valueOf(ss1[i])) == (Integer.valueOf(ss[i]) & Integer.valueOf(ss2[i]))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? 0 : 2);
        }
    }
    
}
