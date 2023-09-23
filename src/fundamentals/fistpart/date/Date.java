package fundamentals.fistpart.date;

public class Date {

    private Integer day;
    private Integer month;
    private Integer year;
    
    private static final Month[] MONTHS = { 
        new Month("January", 31),
        new Month("February", 28),
        new Month("March", 31),
        new Month("April", 30),
        new Month("May", 31),
        new Month("June", 30),
        new Month("July", 31),
        new Month("August", 31),
        new Month("September", 30),
        new Month("October", 31),
        new Month("November", 30),
        new Month("December", 31)
    };

    public Date() {
    }

    public Date(Integer day, Integer month, Integer year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        
        try {
            int monthDays = MONTHS[month-1].getDays();
            if (day >= 1 && day <= monthDays) {
                this.day = day;
            } else {
                throw new IllegalArgumentException("Enter a valid number of days");
            }
            
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        if (month != null && month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Enter a valid month number");
        }
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        try {
            this.year = Integer.parseInt(year.toString());

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Enter valid years. -100 = 100 a.C");

        } catch (NullPointerException e) {
            throw new NullPointerException("Enter valid years. -100 = 100 a.C");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(String.format("%n   month: %d,%n", month));
        sb.append(String.format("   day: %d,%n", day));
        sb.append( year >= 0 ? String.format("   year: %d%n", year) : String.format("   year: %d a.C%n", -1*year) );
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((day == null) ? 0 : day.hashCode());
        result = prime * result + ((month == null) ? 0 : month.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
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
        Date other = (Date) obj;
        if (day == null) {
            if (other.day != null)
                return false;
        } else if (!day.equals(other.day))
            return false;
        if (month == null) {
            if (other.month != null)
                return false;
        } else if (!month.equals(other.month))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        return true;
    }

}
