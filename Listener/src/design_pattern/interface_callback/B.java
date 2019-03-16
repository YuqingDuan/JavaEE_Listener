package design_pattern.interface_callback;

/**
 * PrintListener接口的实现类B
 */
public class B implements PrintListener {
    @Override
    public void printFive() {
        System.out.println("我是B监听器: A类中的print方法已经循环到5了!");
    }
}
