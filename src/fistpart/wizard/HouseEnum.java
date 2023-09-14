package fistpart.wizard;

public enum HouseEnum {
    
    GRYFFINDOR(1),
    SLYTHERIN(2),
    HUFFLEPUFF(3),
    RAVENCLAW(4),
    WITHOUT_HOUSE(5);

    private int code;

    private HouseEnum(int code) {
        this.code = code;
    }

    public int getCode() { 
        return code;
    }

    public static HouseEnum valueOf(int code) {
        for (HouseEnum value : HouseEnum.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        return HouseEnum.WITHOUT_HOUSE;
    }
}
