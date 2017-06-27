package cn.zyf.javaProj.web.superDemo;

/**
 * @author zyf
 * @date: 2017/6/27.
 * @time: 9:54
 */
public class s extends f{
    String name = "子类的属性";

    String t () {
        return "子类方法 " +   super.t() +  this.f() + super.f();
    }

    String test () {
        return "测试" +  super.f();
    }

    public static void main(String[] args) {
        s a = new s();
        System.out.println(a.t());
    }
}
