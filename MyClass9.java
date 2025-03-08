class MyClass9 {
    interface PrivateInterface {
        int PRIVATE_VALUE = 50; 
        void show();
    }

    interface ProtectedInterface {
        int PROTECTED_VALUE = 75; 
        void show();
    }

    static class InnerClass implements PrivateInterface, ProtectedInterface {
        public void show() {
            System.out.println("PrivateInterface Value: " + PRIVATE_VALUE);
            System.out.println("ProtectedInterface Value: " + PROTECTED_VALUE);
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.show();
    }
}