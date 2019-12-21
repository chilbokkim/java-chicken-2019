package domain;

public enum Category {
    CHICKEN("ġŲ"),
    BEVERAGE("����");

    private final String name;

    Category(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
