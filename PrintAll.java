class PrintAll
 {
    static int staticVar1 = 100;
    static int staticVar2 = 200;
    int instanceVar1 = 10;
    int instanceVar2 = 20;

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
}