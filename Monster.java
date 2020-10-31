package nummber1;

class Monster {
    private String name;
    private int life;
    private int attack;
    private int defent;
    public Monster(String name, int life, int attack, int defent) {
        this.setName(name);
        this.setLife(life);
        this.setAttack(attack);
        this.setDefent(defent);
    }
    public void hit() {
        System.out.println(name);
        System.out.println("生命值为：" + life);
        System.out.println("攻击力为：" + attack);
        System.out.print("防御力为：" + defent);
    }
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefent() {
        return defent;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefent(int defent) {
        this.defent = defent;
    }
}