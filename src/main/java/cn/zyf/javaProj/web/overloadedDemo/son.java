package cn.zyf.javaProj.web.overloadedDemo;

/**
 * @author zyf
 * @date: 2017/6/27.
 * @time: 9:40
 */
public class son extends father {
    String a(int a){
        return "son";
    }

    public static void main(String[] args) {
        father f = new son();
        son s = new son();
        System.out.println(f.a());
        System.out.println("------");
        System.out.println(s.a());
        System.out.println("------");
        System.out.println(s.a(1));
    }
}
