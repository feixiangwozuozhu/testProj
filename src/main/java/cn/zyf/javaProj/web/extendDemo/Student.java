package cn.zyf.javaProj.web.extendDemo;

/**
 * @author zyf
 * @date: 2017/6/27.
 * @time: 11:37
 */
public class Student extends Person{

    static {
        System.out.println("子类的静态块");
    }

    Student () {
        System.out.println("子类的构造方法");
    }

    {
        System.out.println("子类的普通方法");
    }
}
