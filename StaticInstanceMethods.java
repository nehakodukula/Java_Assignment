public class StaticInstanceMethods {


    static int staticVar1 = 10;
    static String staticVar2 = "Static String";

    int instanceVar1;
    String instanceVar2;

    public StaticInstanceMethods(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    public static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    public void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String args) {
        StaticInstanceMethods obj = new StaticInstanceMethods(100, "Instance String");
    }
}