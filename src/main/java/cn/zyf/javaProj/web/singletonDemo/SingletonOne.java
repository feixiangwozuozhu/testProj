package cn.zyf.javaProj.web.singletonDemo;

/**
 * @author zyf
 * @date: 2017/6/27.
 * @time: 15:38
 */
public class SingletonOne {
    //3.定义一个变量存储 实例对象
    // 由于下面是定义的静态方法赋值给这个变量，根据静态方法的java 定义，静态方法只能访问静态数据，所以这个变量就定义成静态变量
    private static  SingletonOne singletonOne = null;

    //1.定义构造方法（私有的）
    private SingletonOne () {
        System.out.println("懒汉式单列");
    }

    //2.定义一个能获取实例对象的方法(公有的，能被外部访问的)

    public static SingletonOne getInstance () {

        //这个方法执行过程，体现了延迟加载的思想，开始先判断变量是否存有值，如果有值，就直接返回，没有就重新赋值再返回。
        if (singletonOne == null) {
            singletonOne = new SingletonOne();
        }
        return singletonOne;
    }
}
