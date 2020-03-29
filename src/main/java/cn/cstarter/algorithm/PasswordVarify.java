package cn.cstarter.algorithm;

import java.util.Scanner;

/**
 * @author : blog.cstarter.cn
 * @desc :
 * @time : 2020-03-29
 */
public class PasswordVarify {
    
    /*
        密码验证合格程序
        https://www.nowcoder.com/questionTerminal/184edec193864f0985ad2684fbc86841
        密码要求:
        1.长度超过8位
        2.包括大小写字母.数字.其它符号,以上四种至少三种
        3.不能有相同长度超2的子串重复
        说明:长度超过2的子串
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String pwd = in.nextLine();
            // 长度check, 相同长度超2的子串重复check
            if (pwd.length() <= 8 || pwd.replaceAll("(.{3,})(?=.{3,}\\1)", "").length() < pwd.length()) {
                System.out.println("NG");
                continue;
            }
            // 大小写字母.数字.其它符号check
            int count = 0;
            if (pwd.matches(".*\\d+.*")) count++;
            if (pwd.matches(".*[a-z]+.*")) count++;
            if (pwd.matches(".*[A-Z]+.*")) count++;
            if (pwd.matches(".*[\\p{P}\\p{S}]+.*")) count++;
            if (count < 3) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
        in.close();
    }
    
}
