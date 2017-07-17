package Decorator;

public class SideDishone extends SideDish{

	SideDishone(Meal meal) {
		super(meal);
	}
	
	public String getContent(){
		return this.meal.getcontent()+",可樂 "+", 薯條";
	}
	
	public double getPrice(){
		return this.meal.price();
	}

}
