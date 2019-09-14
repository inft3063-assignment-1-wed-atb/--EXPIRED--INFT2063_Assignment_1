

public class test {

	public static void main(String[] args) {

		recieptDemo demo = new recieptDemo();
		
		demo.itemDetails("Peanuts", 10, 2);
		demo.itemDetails("Chocolate", 50, 3);
		demo.itemDetails("Drugs", 100, 22);
		demo.itemDetails("Beer", 4, 33);
		demo.itemDetails("Dildo", 2.5, 3);
		demo.itemDetails("Degree", 2, 3);
		
		demo.cash(2600);
		
		System.out.println(demo.printReciept());
		

	}

}
