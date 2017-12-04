//class Printer implements Runnable{
//	public void run(){
//		String name = Thread.currentThread().getName();
//		for(int i = 1; i <= 5; i++){
//			System.out.println(name + "打印完" + i + "本书");
//			if(i % 3 == 0){
//				System.out.println(name + "过热，暂停2秒钟");
//				try{
//					Thread.sleep(2000);					
//				}catch(InterruptedException e){
//					System.out.println(e);
//				}
//			}			
//		}
//	}
//}
//public class HashSetEx{
//	public static void main(String[] args){
//		Printer printerA = new Printer();
//		Printer printerB = new Printer();
//		Thread threadA = new Thread(printerA, "Prniter A");
//		Thread threadB = new Thread(printerB, "Printer B");
//		threadA.start();
//		threadB.start();
//		try{
//			threadA.join();
//			threadB.join();
//		}catch(InterruptedException e){
//			System.out.println(e);		
//		}
//		System.out.println("所有打印任务完毕");
//	}
//
//}
