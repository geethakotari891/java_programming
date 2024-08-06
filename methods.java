public class methods {
    void Hello(){
        System.out.println("hello!");
    }
    public static void sayHello() {
        System.out.println("Hello");
    }
    public static void main (String[] args){
        sayHello();
        methods e1 = new methods();
        e1.Hello();
    }
}
