package com.company;

import java.util.Scanner;

public class funksiya_java {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        //System.out.print(raqam_hisobla(a));
        //System.out.print("\n");
        //System.out.print(teskari_chiqar(a));
        //System.out.print("\n");
        //int k = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        //System.out.print(son_qosh(a,k));
        //System.out.println(son_chap(a,k));
        //swap(a,k);
        //System.out.print(min(a,k));
        //tartibla(a,b,c);
        //almashtir(a,b,c);
        //ishora_aniqla(a);
        //ildiz_top(a,b,c);
        //System.out.print(doira_hisobla(a));
        //System.out.print(yuza_hisobla(a,b));
        //System.out.print(peremetr_top(a,b));
        //System.out.println(toq_aniqla(a));
        //System.out.print(tub_aniqla(a));
        //System.out.print(faktoryal(a));
        //System.out.print(dara_top(a,b));
        //System.out.print(ekub_top(a,b));
        System.out.println(ekuk_top(a,b));
    }
   public static int raqam_hisobla(int a){
       // sonni raqamlari yigindisini hisoblaydi
        int i=0,s=0;
        while (a!=0){
            s+=a%10;
            a/=10;
            i=i+1;
        }
        return s;
   }

   public static int teskari_chiqar(int c){

        // sonni teskarisini chiqaradi

        int s = 0;
        while (c!=0){
            s = s*10+c%10;
            c/=10;
        }
        return s;
   }
   public static int son_qosh(int a,int k) {
        // sonni oxiriga raqam qoshadi
        return a*10+k;
   }
    public static int son_chap(int a,int k){

        // sonni boshiga raqam qoshadi

        int i=0,s;
        s = a;
        while (a!=0){
            a/=10;
            i++;
        }
        return (int) (k*Math.pow(10,i)+s);
    }
     static void swap(int a, int k){
        a = a+k;
        k = a-k;
        a = a-k;
        System.out.println("a = "+a);
         System.out.println("k = "+k);
     }

    public static int min(int a, int b){
        // 2 sonni kichigini topuvchi funksiya
        if (a>b) return b;
        else  return a;
    }
    public static void tartibla(int a,int b,int c){
        //  3 ta sonni o'sish tartibida chiqaruvchi funksiya
        if (a>b && b>c) System.out.print("c = "+c+" b = "+b+" a = "+a);
        if (a>c && c>b) System.out.print("b = "+b+" c = "+c+" a = "+a);
        if (b>a && a>c) System.out.print("c = "+c+" a = "+a+" b = "+b);
        if (b>c && c>a) System.out.print("a = "+a+" c = "+c+" b = "+b);
        if (c>a && a>b) System.out.print("b = "+b+" a = "+a+" c = "+c);
        if (c>b && b>a) System.out.print("a = "+a+" b = "+b+" c = "+c);
    }
    public static void almashtir(int a,int b,int c){
        // 3 ta sonni tartibini almashtiruvchi funksiya
        int m;
        m = c;
        c = b;
        b = a;
        a = m;
        System.out.print(a+" "+b+" "+c);
    }
    public static void ishora_aniqla(int a){
        if (a>0) System.out.print("+");
        if (a<0) System.out.print("-");
    }
    public static void ildiz_top(int a,int b,int c){
        if (b*b-4*a*c > 0){
            System.out.print("2 ta yechimga ega");
        }
        else if(b*b-4*a*c == 0) System.out.print("1 ta yechimga ega");
        else System.out.print("yechimga ega emas");
    }
    public static double doira_hisobla(double a){
        return a*a*Math.PI;
    }
    public static double yuza_hisobla(double r1, double r2) {
        if (r1 > r2) return r1 * r1 * Math.PI - r2 * r2 * Math.PI;
         else return r2 * r2 * Math.PI - r1 * r1 * Math.PI;
    }
    public static double peremetr_top(double a,double b){
        double c = Math.sqrt(a*a+b*b);
        double p = a+b+c;
        return p;
    }
    public static boolean toq_aniqla(int a){
        return a%2==0;
    }
    public static String tub_aniqla(int n){
        int i=2;
        boolean son = true;
        while (i<n) {
            if (n%i==0) return "tub son emas";
            i+=1;
            if (n%i!= 0 ){
                son = true;
            }
        }
        if (son){
            return "tub son";
        }
        return null;
    }
    public static int faktoryal(int n){
        int kopaytma =1;
        for (int i = 1; i <= n; i++) {
            kopaytma*=i;
        }
        return kopaytma;
    }
    public static int dara_top(int a,int b){
        int kopaytma = 1;
        for (int i=1;i<=b;i++){
            kopaytma *=a;
        }
        return kopaytma;
    }
    public static int ekub_top(int a, int b){
        int i = 0;
        if (a>b){
            i=b;
            while (b!=0){
                if (a%i==0 && b%i==0 ){
                    return i;
                }
                i--;
            }
        }
        if (a<b){
            i=a;
            while(a!=0){
                if (a%i==0 && b%i==0){
                    return i;
                }
                i--;
            }
        }
        return i;
    }
    public static int ekuk_top(int a,int b){
        int i=0;
        if (a>b){
             i=b;
            while (b!=0){
                if (a%i==0 && b%i==0){
                    return a*b/i;
                }
                i--;
            }
        }
        if (a<b){
             i=a;
            while (a!=0){
                if (a%i==0 && b%i==0){
                    return a*b/i;
                }
                i--;
            }
        }
        return a*b/i;
    }
    
}
