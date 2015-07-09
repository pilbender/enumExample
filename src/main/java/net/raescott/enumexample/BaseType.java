package net.raescott.enumexample;

/**
 * @author Richard Scott Smith <scott.smith@isostech.com>
 */
public enum BaseType {
	IDENTIFIER("identifier"),
	BOOLEAN("boolean"),
	INTEGER("integer"),
	FLOAT("float"),
	STRING("string"),
	POINT("point"),
	PAIR("pair"),
	DIRECTED_PAIR("directedPair"),
	DURATION("duration"),
	FILE("file"),
	URI("uri");

	private final String value;

	BaseType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	/**
	 * It is also possible to run this class as well.  Remember enum classes cannot be instantiated.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("toString(): " + BaseType.IDENTIFIER.toString());
		System.out.println("name(): " + BaseType.IDENTIFIER.name());
		System.out.println("getValue(): " + BaseType.IDENTIFIER.getValue());
		System.out.println("value: " + BaseType.IDENTIFIER.value);
	}
}
