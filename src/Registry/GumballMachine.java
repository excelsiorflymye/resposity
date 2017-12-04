package Registry;

import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	String location;
		
	public GumballMachine(String location, int numberGumballs) throws RemoteException{
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrack(){
		state.turnCrack();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public int getCount(){
		return count;
	}
	
	public String getLocation(){
		return location;
	}
	
	public State getState(){
		return state;
	}
	
	public State getNoQuarterState(){
		return noQuarterState;
	}
	
	public State getHasQuarterState(){
		return hasQuarterState;
	}
	
	public State getSoldState(){
		return soldState;
	}
	
	public State getSoldOutState(){
		return soldOutState;
	}
	
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out of the slot....");
		if(count != 0){
			count = count - 1;
		}
	}
	
	
	
}


