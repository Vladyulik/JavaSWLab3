import java.util.Objects;

public class Car implements Comparable<Car> {
    private int buildYear;
    private int maxSpeed;
    private String model;
    private String color;
    private boolean isInsured;
    private boolean isDamaged;

    public Car(int buildYear, int maxSpeed, String model, String color, boolean isInsured, boolean isDamaged) {
        this.buildYear = buildYear;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.color = color;
        this.isInsured = isInsured;
        this.isDamaged = isDamaged;
    }

    @Override
    public int compareTo(Car other) {
        if (this.buildYear > other.buildYear) { return 1; }
        if (this.buildYear < other.buildYear) { return -1; }
        if (this.maxSpeed > other.maxSpeed) { return -1; }
        if (this.maxSpeed < other.maxSpeed) { return 1; }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;
        boolean equality = this.buildYear == other.buildYear &&
                           this.maxSpeed == other.maxSpeed &&
                           Objects.equals(this.model, other.model) &&
                           Objects.equals(this.color, other.color) &&
                           this.isInsured == other.isInsured &&
                           this.isDamaged == other.isDamaged;

        return equality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.buildYear, this.maxSpeed, this.model, this.color, this.isInsured, this.isDamaged);
    }

    @Override
    public String toString() {
        return "Car {" +
               "buildYear=" + buildYear +
               ", maxSpeed=" + maxSpeed +
               ", model=" + model +
               ", color=" + color +
               ", isInsured=" + isInsured +
               ", isDamaged=" + isDamaged +
               "}";
    }
}
