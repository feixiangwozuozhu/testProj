package cn.zyf.javaProj.web.extendDemo;

/**
 * @author zyf
 * @date: 2017/6/27.
 * @time: 11:37
 */
public class Person {

    static {
        System.out.println("父类的静态快");
    }

    Person (){
        System.out.println("父类的构造方法");
    }

    {
        System.out.println("父类的普通方法");
    }
}
