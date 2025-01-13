package profitShare.Profit.enums;

import lombok.Getter;

@Getter
public enum Status {

    ACTIVE("1", "ACTIVE"),
    PENDING("2", "PENDING"),
    INACTIVE("3", "INACTIVE"),
    COMPLETED("4", "COMPLETED");

    private final String key;
    private final String value;

    Status(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey(){
        return key;
    }

}
