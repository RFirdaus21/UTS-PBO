package Other;
/*clearscreen */

/* delay */
public class threadSleep {
    public void delay500(){
        try { 
            Thread.sleep(500);
        }
        catch (InterruptedException e){
                throw new RuntimeException(e);
        }
    }
    public void delay750(){
        try { 
            Thread.sleep(750);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
