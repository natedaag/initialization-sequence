package edu.cnm.deepdive.examples;

public class ExampleSubclass extends ExampleClass {
	
	static {
		System.out.println("Static initialization of ExampleSubclass");
	}

	public ExampleSubclass() {
		this(ExampleClass.DEFAULT_VALUE);
		System.out.println("ExampleSubclass()");
	}

	public ExampleSubclass(int value) {
		super(value);
		System.out.println("ExampleSubclass(int)");
	}
}