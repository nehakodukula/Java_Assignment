class MyClass10 {  // Renamed OuterClass to match the filename
    private interface PrivateInterface {
        int VALUE = 50;
        void show();
    }

    protected interface ProtectedInterface {
        int VALUE = 75;
        void show();
    }

    static class InnerClass implements PrivateInterface, ProtectedInterface {
        public void show() {
            System.out.println("PrivateInterface Value: " + PrivateInterface.VALUE);
            System.out.println("ProtectedInterface Value: " + ProtectedInterface.VALUE);
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.show();
    }
}