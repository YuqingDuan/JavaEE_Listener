package type01;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class MyHttpSessionListener implements HttpSessionListener {
    /*3. HttpSessionListener
            session的创建
                只要调用getSession
                    html:		不会
                    jsp:		会	  getSession();
                    servlet: 	会
            session的销毁
                超时  30分钟
                非正常关闭 销毁
                正常关闭服务器(序列化)*/

    /*作用：
        统计在线人数*/
    // session对象初始化的时候调用
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HttpSession created...");
    }

    // session对象销毁的时候调用
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSession destroyed...");
    }
}
