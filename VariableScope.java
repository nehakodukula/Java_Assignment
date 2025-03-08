import java.util.*;
public class VariableScope {
    static int myVar = 10; 

    public static void main(String[] args) {
        int myVar = 20; 

        System.out.println("Local variable: " + myVar); 
        System.out.println("Global variable: " + VariableScope.myVar); 
    }
}
