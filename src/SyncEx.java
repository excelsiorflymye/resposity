
class Account{
	private int saving = 0;
	public void transfer(int i){
		String name = Thread.currentThread().getName();
		synchronized(this){
			int sum = saving;
			sum += i;
			System.out.println(name + "转账" + i + "元，贝多芬账户余额为：" + sum + "元");
			saving = sum;
		}
	}
}

class People implements Runnable{
	Account account;
	int time;
	public People(Account account, int time){
		this.account = account;
		this.time = time;
	}
	
	public void run(){
		for(int i = 1; i <= time; i++){
			account.transfer(500);
		}
	}
}
public class SyncEx {
	public static void main(String[] args){
		Account account = new  Account();
		People lisa = new People(account, 8);
		People vanGagh = new People(account, 2);
		Thread lisaThread = new Thread(lisa, "lisa");
		Thread vanGaghThread = new Thread(vanGagh, "vanGagh");
		lisaThread.start();
		vanGaghThread.start();		
	}

}
