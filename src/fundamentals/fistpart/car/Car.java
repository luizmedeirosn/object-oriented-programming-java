package fundamentals.fistpart.car;

public class Car {
 
    private String brandName;
    private Integer year;

    public Car() {
        setName(brandName);
    }

    public Car(String brandName, Integer year) {
        setName(brandName);
        this.year = year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setName(String brandName) {
        if ( brandName == null || brandName.equals("") ) {
            this.brandName = "\"No Name\"";

        } else if (brandName.length() > 10) {
            this.brandName = brandName.substring(0, 10);

        } else {
            this.brandName = brandName;
        }
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        return String.format(
            "{%n" +
            "   brandName: %s,%n" +
            "   year: %d%n" +
            "}%n",
            brandName, year
        );
    }
}