package type01;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    /*1. ServletContextListener
    servletcontext创建：
            1. 启动服务器的时候
    servletContext销毁：
            2. 关闭服务器. 从服务器移除项目*/

    /*作用：
    利用它来，在servletcontext创建的时候，
            1. 完成自己想要的初始化工作
			2. 执行自定义任务调度。 执行某一个任务。 Timer*/

    // application对象初始化的时候调用
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext initialized...");
    }

    // application对象销毁的时候调用
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext destroyed...");
    }
}
