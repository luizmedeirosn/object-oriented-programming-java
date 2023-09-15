package fistpart.date;

public class Month {
    
    private String name;
    private Integer days;

    public Month(String name, Integer days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public Integer getDays() {
        return days;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Month other = (Month) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}