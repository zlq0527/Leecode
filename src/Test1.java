public class Test1 {
	public static void main(String[] args) {
		int c = 10;
		Integer a = 10;
		Integer B = new Integer(10);
		System.out.println(a == B);//false
		System.out.println(a == c); //true
		System.out.println(c == B);//true

		Integer i = 124;
		Integer i2 = 124;
		System.out.println(i == i2);

		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4); //false

		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5 == i6); //true;

	}
}
