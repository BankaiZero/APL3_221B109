class One {
    One(int x) {
        System.out.println("One's constructor called with value: " + x);
    }
}
class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Two's constructor called with value: " + x);
    }
}
public class Main {
    public static void main(String[] args) {
        Two t = new Two(10);
    }
}
