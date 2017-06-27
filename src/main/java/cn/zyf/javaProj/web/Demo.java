package cn.zyf.javaProj.web;

/**
 * @author zyf
 * @date: 2017/6/26.
 * @time: 17:11
 */
public class Demo {
    public static void main(String[] args) {
        SuperDemo superDemo = new SubDemo();
        Demo demo = new Demo();
        System.out.println(superDemo.test(1));
        System.out.println("------------");
//        System.out.println(demo.aa);
    }
}
