package domain;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * HttpSessionBindingListener这种Listener不用在web.xml中注册
 */
public class PersonBean implements HttpSessionBindingListener {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("An instance of PersonBean has been bound into session scope...");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("An instance of PersonBean in session scope has been unbound...");
    }
}
