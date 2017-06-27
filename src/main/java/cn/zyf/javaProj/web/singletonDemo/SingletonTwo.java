package cn.zyf.javaProj.web.singletonDemo;

/**
 * @author zyf
 * @date: 2017/6/27.
 * @time: 15:46
 */
public class SingletonTwo {
    //3,定义一个静态变量存放单列实例对象的,
    // 使用静态变量存放实例对象，由于静态变量是属于类变量，只要创建了这个类，就会给这个静态变量开发一个内存空间，无论创建多少个对象都只会有一个静态变量
    // 如果是不加 static 关键字的变量及实例变量，就会每创建一次对象，开辟一个实例变量空间
    private static  SingletonTwo singletonTwo = new SingletonTwo();

    //1.定义构造方法（私有的）
    private SingletonTwo () {
        System.out.println("饿汉式单列");
    }

    //2.定义一个方法获取单列实例对象
    //使用static 关键字 详解
    // 为了让这个方法不在创建类实例的前提下，获取到该方法，所有就要有通过类名直接访问到该方法
    public static SingletonTwo getInstance () {
        return  singletonTwo;
    }
}
