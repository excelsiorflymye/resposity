//class Printer extends Thread{
//	public Printer(String name){
//		super(name);
//	}
//	
//	public void run(){
//		String name = Thread.currentThread().getName();
//		int priority = Thread.currentThread().getPriority();
//		Thread.State state = Thread.currentThread().getState();
//		System.out.println(name + " priority is ;" + priority + "; state is " + state);
//		for(int i = 1; i <= 5; i++){
//		System.out.println(name + "印完" + i + "本书");	
//		if(i % 3 == 0){
//			System.out.println(name + "过热，暂停2秒钟");
//			try{
//				Thread.sleep(2000);
//			}catch(InterruptedException e){
//				System.out.println(e);					
//			}			
//		}
//		}
//	}
//}
//	class ThreadEx{
//		public static void main(String[] args){
//			Printer[] printer= new Printer[2];
//			printer[0] = new Printer("Printer A");
//			printer[1] = new Printer("Printer B");	
//			printer[0].setPriority(Thread.MAX_PRIORITY);
//			printer[1].setPriority(Thread.NORM_PRIORITY);	
//			for(Printer p :printer){
//				p.start();
//			}
//		System.out.println("有几台印刷机在运行" + (Thread.activeCount()-1));
//		
//	}
//}