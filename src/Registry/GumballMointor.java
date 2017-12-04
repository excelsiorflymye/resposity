package Registry;

public class GumballMointor {

	GumballMachineRemote machine;
	
	public GumballMointor(GumballMachineRemote machine){
		this.machine = machine;
	}
	
	public void report(){
		try{
			System.out.println("GumballMachine is " + machine.getLocation());
			System.out.println("Current inventory " + machine.getCount() + " gumballs");
			System.out.println("Current state " + machine.getState());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
