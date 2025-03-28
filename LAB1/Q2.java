class Mother {
    void show() {
        System.out.println("Hello World");
    }
}
class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}
public class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
        Mother m2 = new Child();
        m2.show();  
    }
}
