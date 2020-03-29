package cn.cstarter.algorithm;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class MultiThread {
    
    /*
        多线程
        https://www.nowcoder.com/questionTerminal/cd99fbc6154d4074b4da0e74224a1582
     */
    
 
    public static void main(String[] args) {
        //利用线程池
        Scanner sc = new Scanner(System.in);
        //利用线程池，进行有序输出
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        while (sc.hasNext()) {   //这个需要加上，虽然题目写的是输出一次
            int n = sc.nextInt();
            if (n < 1) {   //增加异常处理
                System.out.print("");
            }
            for (int i = 0; i < n; i++) {
                threadPool.execute(new MyRunnable("A"));
                threadPool.execute(new MyRunnable("B"));
                threadPool.execute(new MyRunnable("C"));
                threadPool.execute(new MyRunnable("D"));
            }
            
            //此处必须进行睡一下，不然主线程会提起终止
            //导致线程池中的数据无法输入完成
            try {
                Thread.sleep(50);//此处50-100就可以，太小输出不全，太大浪费时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        threadPool.shutdown();  //关闭线程池
    }
}

class MyRunnable implements Runnable {
    public String out;
    
    public void run() {
        System.out.print(out);
    }
    
    //利用有参构造函数进行赋值
    public MyRunnable(String output) {
        out = output;
    }
}
