package factory;

public class NYPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item){
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("cheese")){
			Pizza cheesePizza = new CheesePizza(ingredientFactory);
			cheesePizza.setName("New York Style Cheese Pizza");
		}
		if(item.equals("calm")){
			Pizza calmPizza = new CalmPizza(ingredientFactory);
			calmPizza.setName("New York Style Calm Pizza");
			
		}
		return pizza;
	}

}
