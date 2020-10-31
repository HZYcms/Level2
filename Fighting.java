package nummber1;

import java.util.Scanner;

public class Fighting {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("请输入攻击者命名：");
        String a = scr.next();
        System.out.print("请输入攻击者生命值：");
        int b=scr.nextInt();
        System.out.print("请输入攻击者攻击值：");
        int c=scr.nextInt();
        System.out.print("请输入攻击者防御值：");
        int d=scr.nextInt();
        System.out.print("请为怪物命名：");
        String  e= scr.next();
        System.out.print("请输入怪物生命值：" );
        int f=scr.nextInt();
        System.out.print("请输入怪物攻击值：");
        int g=scr.nextInt();
        System.out.print("请输入怪物防御值：");
        int h=scr.nextInt();
        Lead lead=new Lead(a,b,c,d);
        Monster monster=new Monster(e,f,g,h);
        lead.hit();
        System.out.print("\n");
        monster.hit();
        System.out.print("\n");
        System.out.println(a+"VS"+e);
        if ((b-f)>0){
            b-=f;
            System.out.println(a+"的血量为："+b);
            System.out.println(e+"的血量值为：0");
            System.out.println(a+"获得了胜利");
        }
        else {
            System.out.println(a+"的血量为：0");
            System.out.println(e+"的血量为："+f);
            System.out.println(e+"获得了胜利");
        }
    }
}
