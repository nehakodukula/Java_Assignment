
class PrintStaticVarIn {

    static int staticVar1 = 100;
    static int staticVar2 = 200;

    void instanceMethod() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
        PrintStaticVarIn obj = new PrintStaticVarIn(); // Corrected class name
        obj.instanceMethod();
    }
}