package cn.zyf.javaProj.web.abstractDemo;

/**
 * @author zyf
 * @date: 2017/6/22.
 * @time: 11:36
 */
public class SubClass extends AbstractClass {

    //普通类继承抽象父类，实现父类抽象方法b()
    void b() {

    }

    public String s(){
        return name;
    }

    public String w() {
        return a();
    }

    public String a(int a){
        String a1 = a();
        return a1 + "a2";
    }

    String c(){
        return "s";
    }

    public static void main(String[] args) {
//        SubClass subClass = new SubClass();
//        System.out.println(subClass.s());
//        System.out.println(subClass.w());
//        System.out.println(subClass.a(1 ));
       //向上转型
        AbstractClass a = new SubClass();
        //向下转型
        SubClass  b = (SubClass) a;
        System.out.println(b.c());
    }
}
