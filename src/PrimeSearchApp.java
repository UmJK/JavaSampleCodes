import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeSearchApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RunnablePrimerSearch w1 = new RunnablePrimerSearch(1,10000);
		RunnablePrimerSearch w2 = new RunnablePrimerSearch(10000,25000);
		/*Thread t1 = new Thread(w1);
		Thread t2= new Thread(w2);
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		System.out.println("Primes b/w 1 and 10000 "+w1.count);
		System.out.println("Primes b/w 10000 and 25000 "+w2.count);
		*/
		ExecutorService pool = Executors.newFixedThreadPool(4);
		/*pool.execute(w1);
		pool.execute(w2);
		
		while(!(w1.resultReady && w2.resultReady))
		{
			Thread.sleep(200);
		}
		System.out.println("Primes b/w 1 and 10000 "+w1.count);
		System.out.println("Primes b/w 10000 and 25000 "+w2.count);*/
		CallablePrimerSearch c1= new CallablePrimerSearch(1,10000);
		CallablePrimerSearch c2 = new CallablePrimerSearch(1000000,250000);
		Future <Integer> r1 = pool.submit(c1);
		Future <Integer> r2 = pool.submit(c2);
		
		System.out.println("Primes b/w 1 and 10000 "+r1.get());
		System.out.println("Primes b/w 10000 and 25000 "+r2.get());
		
	}

}
