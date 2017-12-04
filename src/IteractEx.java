
class Depot{
	private int stock = 0;
	synchronized public void produce(int i){
		while(stock >= 3){
			System.out.println("库存3本以上，暂停印刷");
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		stock += i;
		System.out.println("印了" + i + "本书" + "现在库存总共有" + stock + "本书");
		notify();
	}
	
	synchronized public void consume(int i){
		while(stock < i){
			System.out.println("库存不足，暂停发货");
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		stock -= i;
		System.out.println("卖出" + i + "本书" + "现在库存剩余 " + stock + "本书");
		if(1 >= stock){
			System.out.println("库存低，催促印刷");	
			notify();
		}	
	}
}

class Printer extends Thread{
	Depot depot;
	int time;
	public Printer(Depot depot, int time){
		this.depot = depot;
		this.time = time;
	}
	public void run(){
		for(int i = 1; i <= time; i++){
			depot.produce(1);
		}
	}
}

class Sender extends Thread{
	Depot depot;
	int time;
	public Sender(Depot depot, int time){
		this.depot = depot;
		this.time = time;
	}
	
	public void run(){
		for(int i = 1; i <= time; i++){
			depot.consume(1);			
		}
	}
}

public class IteractEx {
	public static void main(String[] args){
		Depot depot = new Depot();
		Printer printer = new Printer(depot, 5);
		Sender sender = new Sender(depot, 5);
		printer.start();
		sender.start();
	}

}
