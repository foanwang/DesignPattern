package Decorator;

public class FriedChiken implements Meal {
	
	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 49.0;
	}

	@Override
	public String getcontent(String content) {
		// TODO Auto-generated method stub
		return "炸雞";
	}

}
