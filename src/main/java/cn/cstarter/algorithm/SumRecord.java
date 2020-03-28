package cn.cstarter.algorithm;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-28
 */
public class SumRecord {
    
    /*
        合并表记录
        https://www.nowcoder.com/practice/de044e89123f4a7482bd2b214a685201
        数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        while (count > 0) {
            Integer key = Integer.valueOf(scanner.next());
            Integer value = Integer.valueOf(scanner.next());
            if (map.get(key) == null) {
                map.put(key, value);
            } else {
                map.put(key, map.get(key) + value);
            }
            count --;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
