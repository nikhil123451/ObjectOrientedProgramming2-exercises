public class UtensilCheck {
	public static boolean requireFork(MenuItem object) {
		if (object instanceof Salad || object instanceof Sandwich) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean requireKnife(MenuItem object) {
		if (object instanceof Sandwich) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean requireSpoon(MenuItem object) {
		if (object instanceof Cappuccino) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean requireStraw(MenuItem object) {
		if (object instanceof Drink && !(object instanceof Cappuccino)) {
			return true;
		} else {
			return false;
		}
	}
}
