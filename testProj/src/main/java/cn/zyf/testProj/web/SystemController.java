package cn.zyf.testProj.web;

/**
 * @author zyf
 * @company 杭州动享互联网技术有限公司
 * @date: 2017/6/9.
 * @time: 19:15
 */
public class SystemController {

    public String hello(){
        return "world";
    }

    public static void main(String[] args) {
        System.out.println(new SystemController().hello());
    }

}
