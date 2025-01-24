class Mother {
    void show() {
        System.out.println("Mother's show method");
    }
}
class Child extends Mother {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
}
public class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();
        Mother m1 = new Child();
        m1.show();
    }
}
