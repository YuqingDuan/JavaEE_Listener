package domain;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * HttpSessionActivationListener这种Listener不用在web.xml中注册
 * Serializable要实现序列化与反序列化必须要实现这个接口
 * Eclipse和idea不同,直接在${TOMCAT_HOME}\work\Catalina\localhost\项目名称中生成SESSIONS.ser,重启tomcat就能实现活化的功能,无需以上的这些设置.
 * 在自己的web工程项目中的 META-INF/context.xml
 */
public class AnimalBean implements HttpSessionActivationListener, Serializable {
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("session will passivate...");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("session did activate...");
    }
}
