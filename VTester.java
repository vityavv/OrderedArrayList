public class VTester {
	public static void main(String[] args) {
		NoNullArrayList<Integer> a = new NoNullArrayList<Integer>(11);
		a.add(1); a.add(2); a.add(3); a.add(0, 0);
		try {
			a.add(null);
			System.out.println("Illegal argument exception doesn't work");
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument exception works");
		}
		System.out.println(a.toString());
		OrderedArrayList<Integer> b = new OrderedArrayList<Integer>();
		b.add(4); b.add(3); b.add(-123); b.add(2); b.add(100);
		System.out.println(b.toString());
	}
}
