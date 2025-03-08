class AccessModifiers {
    // Private Constructor
    private AccessModifiers() {
        System.out.println("Private Constructor Called");
    }

    // Public Constructor
    public AccessModifiers(int a) {
        System.out.println("Public Constructor Called with value: " + a);
    }

    // Protected Constructor
    protected AccessModifiers(String str) {
        System.out.println("Protected Constructor Called with value: " + str);
    }

    // Default (package-private) Constructor
    AccessModifiers(double d) {
        System.out.println("Default (Package-Private) Constructor Called with value: " + d);
    }

    public static void main(String[] args) {
        // Private constructor cannot be called from outside the class
        AccessModifiers obj1 = new AccessModifiers(10);
        AccessModifiers obj2 = new AccessModifiers("Java");
        AccessModifiers obj3 = new AccessModifiers(5.5);
    }
}