
import java.util.concurrent.Callable;

public class CallablePrimerSearch implements Callable<Integer> {
    
    long start,end;
    int count;
    volatile boolean resultReady;
    
    public CallablePrimerSearch(long start, long end) {
        
        this.start = start;
        this.end = end;
    }
    
    @Override
    public Integer call() {
        for(long i=start;i<=end;i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        resultReady = true;
        return count;
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