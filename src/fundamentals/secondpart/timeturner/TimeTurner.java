package fundamentals.secondpart.timeturner;

public class TimeTurner {
    
    private Integer limit;
    private int time = 0;
    private boolean up = true;

    public TimeTurner() {
    }

    public TimeTurner(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void advance() {
        if (up && time < limit) {
            time++;
        } else if (!up && time > 0) {
            time--;
        }
    }

    public void invertDirection() {
        if (up) {
            up = false;
        } else {
            up = true;
        }
    }

    @Override
    public String toString() {
        return String.format("time: %d, up: %s", time, up);
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((limit == null) ? 0 : limit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TimeTurner other = (TimeTurner) obj;
        if (limit == null) {
            if (other.limit != null)
                return false;
        } else if (!limit.equals(other.limit))
            return false;
        return true;
    }
    
}
