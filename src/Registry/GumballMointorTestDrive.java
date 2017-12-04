package Registry;

import java.rmi.Naming;


public class GumballMointorTestDrive {
	public static void main(String[] args){
		String[] location = {"127.0.0.1/sanaste",
				"127.0.0.1/www.com",
				"127.0.0.1/settle.com"};
		GumballMointor[] mointors = new GumballMointor[location.length];
		
		for(int i = 0; i < location.length; i++){
			try{
				GumballMachineRemote machine =(GumballMachineRemote) Naming.lookup(location[i]);
				mointors[i] = new GumballMointor(machine);
				System.out.println(mointors[i]);
 			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		
	}

}
