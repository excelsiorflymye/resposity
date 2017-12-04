package factory;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Calms calm;
	
	abstract void prepare();
	
	void bake(){
		System.out.println(" Bake for 25 minites at 350");
	}
	
	void cut(){
		System.out.println(" Cutting the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place the pizza in official PizzaStore box");
	}

	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	public String toString(){
		StringBuffer sbf = new StringBuffer();
		sbf.append("name is").append(name).append("\n")
		.append("sauce is").append(sauce).append("\n")
		.append("dough is").append(dough).append("\n")
		.append("veggies is").append(veggies).append("\n")
		.append("cheese is").append(cheese).append("\n")
		.append("pepperoni is").append(pepperoni).append("\n")
		.append("calm is").append(calm);
		return sbf.toString();
	}
}

