package cn.zyf.javaProj.web.abstractDemo;

/**
 * @author zyf
 * @date: 2017/6/22.
 * @time: 10:42
 */
abstract class AbstractClass {
    //抽象类,定义abstract关键字，默认是public
    //抽象方法
    abstract void b();

    //普通成员变量
    String name = "a";
    //普通成员方法
    String a(){
        return "test";
    }

    String c(){
        return "f";
    }
}
