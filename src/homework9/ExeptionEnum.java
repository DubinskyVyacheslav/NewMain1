package homework9;

public enum ExeptionEnum {

    DIVISION_ON_ZERO(1),
    INDEX_OUT_OF_BOUND(2),
    ONLY_NUMBER(3);


    private final int code;

    public int getCode() {
        return code;
    }

    ExeptionEnum(int code) {
        this.code = code;
    }
}
