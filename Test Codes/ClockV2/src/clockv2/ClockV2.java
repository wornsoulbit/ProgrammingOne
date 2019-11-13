package clockv2;

/**
 *
 * @author Alex Vasil
 */
public class ClockV2 {

    private int hr;
    private int mi;
    private int se;

    public ClockV2() {
        this.hr = 0;
        this.mi = 0;
        this.se = 0;
    }

    public ClockV2(int hr, int mi) {
        this.hr = hr;
        this.mi = mi;
        this.se = 0;
    }

    public ClockV2(int hr, int mi, int se) {
        this.hr = hr;
        this.mi = mi;
        this.se = se;
    }

    public ClockV2(ClockV2 anotherClockV2) {
        this.hr = anotherClockV2.hr;
        this.mi = anotherClockV2.mi;
        this.se = anotherClockV2.se;
    }

    public void increaseHr() {
//        hr = (hr + 1) % 24;
        hr++;        
        if (hr == 24) {
            hr = 0;
        }
        
    }
    
    public void increaseMi() {
//        mi = (mi + 1) % 60;
        mi++;
        if (mi == 60) {
            mi = 0;
            increaseHr();
        }
    }

    public void increaseSe() {
//        se = (se + 1) % 60;
        se++;
        if (se == 60) {
            se = 0;
            increaseMi();
        }
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hr, mi, se);
    }

    public boolean equals(ClockV2 anotherClockV2) {
        return this.hr == anotherClockV2.hr
                && this.mi == anotherClockV2.mi
                && this.se == anotherClockV2.se;
    }
    
    public ClockV2 clone() {
        return new ClockV2(this);
    }

    public int getHr() {
        return hr;
    }

    public int getMi() {
        return mi;
    }

    public int getSe() {
        return se;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMi(int mi) {
        this.mi = mi;
    }

    public void setSe(int se) {
        this.se = se;
    }

}
