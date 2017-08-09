package com.licc.code.base._algorithm;

import java.util.Scanner;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/13 13:40
 * @see
 */
public class Hwc {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();// 字符串长度
        int strSize = 1;// 插入字符个数
        int size = (length & 1) == 0 ? length / 2 : (length - 1) / 2 + strSize;
        boolean b = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            char c1 = s.charAt(index);
            char c2 = s.charAt(length - i - 1);
            if ((c1 ^ c2) == 0) {// 前后两个字符如果相同则返回true
                b = true;
                index++;
            } else {
                if (strSize == 1) {// 如果不同则插入一个字符
                    strSize--;
                } else {// 如果字符已经补过了 还是不同则返回false
                    b = false;
                    break;
                }
            }
        }
        if (b) {
            System.out.println("可以");

        } else {
            System.out.println("不可以");
        }
    }

}
