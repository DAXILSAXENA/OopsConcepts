package Polymorphism;

public class Test {
	int i;

	Test(int i) {
		this.i = i;
	}

	void show(Test objectParameter) {
		System.out.println(i);
		System.out.println(objectParameter.i);
	}

	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(20);

		t1.show(t1);

		t2.show(t2);

		t1.show(t2);

		t2.show(t1);

	}
}
