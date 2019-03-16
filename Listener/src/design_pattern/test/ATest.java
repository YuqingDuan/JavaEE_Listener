package design_pattern.test;

import design_pattern.interface_callback.A;
import design_pattern.interface_callback.B;
import design_pattern.interface_callback.C;
import design_pattern.interface_callback.D;

public class ATest {
    public static void main(String[] args) {
        A a = new A();
        // a.print(new B());
        a.print(new C());
        // a.print(new D());
    }
}
