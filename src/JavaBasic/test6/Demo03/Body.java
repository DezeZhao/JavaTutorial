package JavaBasic.test6.Demo03;

public class Body {//成员内部类
    //内部类
    public class Heart {
        public void beat() {
            System.out.println("心脏跳动蹦蹦蹦");
            System.out.println("我叫" + name);
        }
    }
    //外部类成员变量
    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

}
