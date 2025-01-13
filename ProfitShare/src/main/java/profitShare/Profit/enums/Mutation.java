package profitShare.Profit.enums;



public enum Mutation {

    DEBIT("Debit", "D"),
    CREDIT("Credit", "C");

    private final String type;
    private final String description;


    Mutation(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return type + ": " + description;
    }

}
