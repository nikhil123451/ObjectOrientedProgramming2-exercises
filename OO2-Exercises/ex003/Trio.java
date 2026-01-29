
public class Trio implements MenuItem {
	
	private String name;
	private double price;
	
	public Trio(Sandwich sandwich, Salad salad, Drink drink) {
		name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
		
		double firstMaximumPrice = Math.max(sandwich.getPrice(), salad.getPrice());
		double firstMinimumPrice = Math.min(sandwich.getPrice(), salad.getPrice());
		double secondMaximumPrice = Math.max(firstMinimumPrice, drink.getPrice());
		
		price = firstMaximumPrice + secondMaximumPrice;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
