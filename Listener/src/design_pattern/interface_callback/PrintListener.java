package design_pattern.interface_callback;

/**
 * 打印监听器的接口PrintListener
 *
 * @author Stephen Duan
 * @date 01/01/1988
 */
public interface PrintListener {
    /*
     * 一旦出现了某一种事件， 达到了某一个状态，就调用这个方法
     * */
    void printFive();
}
