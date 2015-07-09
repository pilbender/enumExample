package net.raescott.enumexample;

public class App {
    public static void main( String[] args ) {
        System.out.println("toString(): " + BaseType.IDENTIFIER.toString());
        System.out.println("name(): " + BaseType.IDENTIFIER.name());
        System.out.println("getValue(): " + BaseType.IDENTIFIER.getValue());
		System.out.println("********************************************************************************");
		System.out.println("toString(): " + BaseType.BOOLEAN.toString());
		System.out.println("name(): " + BaseType.BOOLEAN.name());
		System.out.println("getValue(): " + BaseType.BOOLEAN.getValue());
	}
}
