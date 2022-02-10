
public class StopWatch {
    private long starTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void setTime(){
        this.starTime = System.currentTimeMillis();
    }
    public void start(){
        this.starTime = System.currentTimeMillis();
        this.running = true;
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getElapsedTime(){
        long elapsed;
        if (running){
            elapsed = (System.currentTimeMillis()-this.starTime);
        }else {
            elapsed = (this.endTime-this.starTime);
        } return elapsed;
    }
}

