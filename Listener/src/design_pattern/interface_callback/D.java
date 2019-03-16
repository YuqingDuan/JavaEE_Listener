package design_pattern.interface_callback;

/**
 * PrintListener接口的实现类D
 */
public class D implements PrintListener {
    @Override
    public void printFive() {
        System.out.println("我是D监听器: A类中的print方法已经循环到5了!");
    }
}
