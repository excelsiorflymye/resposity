package factory;

public class CalmPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CalmPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void prepare(){
		System.out.println("name " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		calm = ingredientFactory.createCalms();
	}
}
