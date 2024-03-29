
public class RunnablePrimerSearch implements Runnable {
    
    long start,end;
    int count;
    volatile boolean resultReady;
    public RunnablePrimerSearch(long start, long end) {
        
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        for(long i=start;i<=end;i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        
    }

    private boolean isPrime(long num) {
        if(num <= 2) {
            return true;
        }
        for(long i=2;i<num;i++) {
            if((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
