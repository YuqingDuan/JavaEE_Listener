package type01;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {
    /*request创建:
        访问服务器上的任意资源都会有请求出现。
        访问 html：
        访问 jsp:	会
        访问 servlet : 会
    request销毁：
        服务器已经对这次请求作出了响应。*/

    // request对象初始化的时候调用
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("HttpServletRequest initialized...");
    }

    // request对象销毁的时候调用
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("HttpServletRequest destroyed...");
    }
}
