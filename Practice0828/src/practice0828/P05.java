package practice0828;

public class P05 {

	public static void main(String[] argv) {
		new P05().test();
	}

	private void test() {
		Fruits fruits = new Apple();
		System.out.println(fruits.getName());
	}

	public class Fruits {
		private String name;

		public Fruits() {
			this.name = "unknown";
		}

		public String getName() {
			return name;
		}
	}

	public class Apple extends Fruits {
		public String getName() {
			return "Apple";
		}
	}

}
