package cn.zyf.javaProj.web.interfaceDemo;

/**
 * @author zyf
 * @date: 2017/6/22.
 * @time: 11:56
 */
public interface InterfaceClass {
    public abstract void a();
    //接口方法只能是抽象方法，下面b()方法出现错误；
    //void b(){};
}
