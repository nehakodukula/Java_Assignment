class MultiConstructor {
    MultiConstructor() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {
        System.out.println("This is a method, not a constructor.");
    }

    public static void main(String[] args) {
        MultiConstructor obj = new MultiConstructor();
        // Calling the method instead of the constructor
        obj.callConstructor();
        obj.callConstructor();
    }
}