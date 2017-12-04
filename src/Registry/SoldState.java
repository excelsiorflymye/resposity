package Registry;

public class SoldState implements State{
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter(){
		System.out.println("You inserted a quarter!");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void ejectQuarter(){
		System.out.println("You have not insert a quarter!");
	}
	
	public void turnCrack(){
		System.out.println("You turned, but there is not a quarter!");
	}
	
	public void dispense(){
		System.out.println("You need to Pay first!");
	}
}
