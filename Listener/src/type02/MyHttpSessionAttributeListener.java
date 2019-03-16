package type02;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    // session域中有属性被添加进来
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("attribute added in session scope...");
    }

    // session域中有属性被移除
    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("attribute removed in session scope...");
    }

    // session域中有属性的值被更改
    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("attribute replaced in session scope...");
    }
}
