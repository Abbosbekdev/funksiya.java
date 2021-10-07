package com.company;

import java.util.Scanner;

public class Rekursiv_funksiya {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        //int k = scanf.nextInt();
        int b = scanf.nextInt();
        //System.out.print(fakt_top(a));
        //System.out.print(fakt2_top(a));
        //System.out.println(fib1(a));
        /*for (int i = 1; i <= a; i++) {
            System.out.println(fib2(i));
        }*/
        //System.out.print(combin(a,k));
        //System.out.println(ekub_top(a,b));
        System.out.println(summ_top(a));

    }
    // faktorialni hisoblovchi rekursiv funksiya
    public static int fakt_top(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * fakt_top(a - 1);
        }
    }
    public static int fakt2_top(int a){
        //2 ga farq qiluvchi sonlar kopaytmasini topuvchi rekursiya
        if (a==0 || a==1) return 1;
        else
        return a*fakt2_top(a-2);
    }
    public static int fib1(int a){
        //fibonachi sonni topadi
        if (a==1 || a==2) return 1;
        else return fib1(a-2)+fib1(a-1);
    }
    public static int fib2(int a) {
        //fibonachi sonlar jadvalini chiqaradi
        if (a == 1 || a == 2) return 1;
        else return fib2(a - 2) + fib2(a - 1);
    }
    public static int combin(int a,int k){

        if (a==k || a==0 || k==0){
            return 1;
        }
        else return combin(a-1,k)+combin(a-1,k-1);
    }
    public static int ekub_top(int a,int b){
        // 2 sonni ekubini topuvchi rekursiv funksiya
        if (b==0)
            return a;
        else
            return ekub_top(b,a%b);
    }
    public static int summ_top(int a){
        // sonni raqamlari yigindisini topuvchi funksiya
        if (a==0)
            return 0;
        else
            return summ_top(a/10)+a%10;
    }
}
