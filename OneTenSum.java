public class OneTenSum {
	public static void main(String[] argvs)
	{
	// Set up an array for the intermediate results.
	int[] results = {0,0,0,0,0,0,0,0,0,0};
	int sum = 0;
	try{
	
	/*
	addthings thread0 = new addthings(0,1);
	addthings thread1 = new addthings(0,2);
	addthings thread2 = new addthings(0,3);
	addthings thread3 = new addthings(0,4);
	addthings thread4 = new addthings(0,5);
	addthings thread5 = new addthings(0,6);
	addthings thread6 = new addthings(0,7);
	addthings thread7 = new addthings(0,8);
	addthings thread8 = new addthings(0,9);
	addthings thread9 = new addthings(0,10);
	
	Thread t0 = new Thread(thread0);
	Thread t1 = new Thread(thread1);
	Thread t2 = new Thread(thread2);
	Thread t3 = new Thread(thread3);
	Thread t4 = new Thread(thread4);
	Thread t5 = new Thread(thread5);
	Thread t6 = new Thread(thread6);
	Thread t7 = new Thread(thread7);
	Thread t8 = new Thread(thread8);
	Thread t9 = new Thread(thread9);
	*/
	// Create two threads writing the intermediate results.
/*	Thread t0 = new Thread(() -> results[0] = 1);
	Thread t1 = new Thread(() -> results[1] = results[0]+2);
	Thread t2 = new Thread(() -> results[2] = results[1]+3);
	Thread t3 = new Thread(() -> results[3] = results[2]+4);
	Thread t4 = new Thread(() -> results[4] = results[3]+5);
	Thread t5 = new Thread(() -> results[5] = results[4]+6);
	Thread t6 = new Thread(() -> results[6] = results[5]+7);
	Thread t7 = new Thread(() -> results[7] = results[6]+8);
	Thread t8 = new Thread(() -> results[8] = results[7]+9);
	Thread t9 = new Thread(() -> results[9] = results[8]+10);
*/	
	Thread t0 = new Thread(() -> results[0] = addthings(0,1));
	Thread t1 = new Thread(() -> results[1] = addthings(results[0],2));
	Thread t2 = new Thread(() -> results[2] = addthings(results[1],3));
	Thread t3 = new Thread(() -> results[3] = addthings(results[2],4));
	Thread t4 = new Thread(() -> results[4] = addthings(results[3],5));
	Thread t5 = new Thread(() -> results[5] = addthings(results[4],6));
	Thread t6 = new Thread(() -> results[6] = addthings(results[5],7));
	Thread t7 = new Thread(() -> results[7] = addthings(results[6],8));
	Thread t8 = new Thread(() -> results[8] = addthings(results[7],9));
	Thread t9 = new Thread(() -> results[9] = addthings(results[8],10));
	
	// Start both threads.
	t0.start();
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	t9.start();

	// Let the main thread wait until both threads are dead.
	//try {
	    t0.join();
	    t1.join();
	    t2.join();
	    t3.join();
	    t4.join();
	    t5.join();
	    t6.join();
	    t7.join();
	    t8.join();
	    t9.join();
	} catch (Exception e) { e.printStackTrace(); }
	
	// Sum up the intermediate results and print it.
	for(int i = 0; i < 10; i++)
		{
			System.out.println("Step " + i + " gives " + results[i]);
		}
	}


//class addthings implements Runnable{
		public static int addthings(int gg, int wp) {
			// TODO Auto-generated method stub
			gg = gg + wp;
			//System.out.println("Sum is: "  + sum);
			return gg;
		}
	}