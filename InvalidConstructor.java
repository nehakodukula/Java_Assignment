class InvalidConstructor {
    // This is NOT a constructor, but a method because it has a return type.
    int InvalidConstructor() {
        System.out.println("This is not a constructor, it is a method returning int.");
        return 10;
    }

    String InvalidConstructor(String str) {
        System.out.println("This is not a constructor, it is a method returning String.");
        return str;
    }

    public static void main(String[] args) {
        InvalidConstructor obj = new InvalidConstructor();
        System.out.println(obj.InvalidConstructor());
        System.out.println(obj.InvalidConstructor("Hello"));
    }
}