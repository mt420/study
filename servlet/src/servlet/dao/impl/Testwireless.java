package servlet.dao.impl;

import java.util.Random;

public class Testwireless {
    public static void main(String[] args) {
        Random ran1 = new Random();
        int sum=0;
        int a;
        float b;
        System.out.println("使用种子为8的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 7; i++) {
            a=ran1.nextInt(1000);
            b=ran1.nextFloat();
            System.out.print(a + " ");
            sum=sum+a;
            System.out.println(((float)a/100));
        }
        System.out.println("");
        System.out.println("the sum is "+ sum);


    }
}
