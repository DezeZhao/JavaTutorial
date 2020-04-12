package JavaBasic.test4;

public class User {

    private int money;
    private String name;

    public void show() {
        System.out.println("我叫" + this.name + ",我现在有" + this.money+"元钱");
    }

    public User() {
    }

    public User(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
