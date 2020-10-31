package nummber1;

import java.util.Scanner;

class Lead {
   private String name;
   private int life;
   private int attack;
   private int defent;
   public Lead(String name,int life,int attack,int defent) {
       this.setName(name);
       this.setLife(life);
       this.setAttack(attack);
       this.setDefent(defent);
   }
    public void hit(){
        System.out.println(name);
        System.out.println("生命值为："+life);
        System.out.println("攻击力为："+attack);
        System.out.print("防御力为："+defent);
    }

    public String getName() {
        return name;
    }
    public void setName(String a) {
        this.name = a;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int b) {
        this.life = b;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int c) {
        this.attack = c;
    }
    public int getDefent() {
        return defent;
    }
    public void setDefent(int d) {
        this.defent = d;
    }
}
