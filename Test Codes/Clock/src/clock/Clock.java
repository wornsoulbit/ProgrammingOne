package clock;

/**
 * A class of a clock.
 * 
 * @author Alex Vasil
 */
public class Clock {
    
    private int hr;
    private int min;
    private int sec;

    public Clock() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }
    
    public Clock(int hr, int mi) {
        this.hr = hr;
        this.min = mi;
        this.sec = 0;
    }
    
    public Clock(int hr, int mi, int se) {
        this.hr = hr;
        this.min = mi;
        this.sec = se;
    }
    
    @Override
    public String toString() {
        //12:00:00
        return String.format("%02d:%02d:%02d", hr, min, sec);
    }
    
    public int getHr() {
        return hr;
    }

    public int getMi() {
        return min;
    }

    public int getSe() {
        return sec;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMi(int mi) {
        this.min = mi;
    }

    public void setSe(int se) {
        this.sec = se;
    }
    
    
}
