import java.util.Objects;

/**
 * Represents a Car with properties such as build year, maximum speed, model, color,
 * insurance status, and damage status. The Car class provides methods for comparing
 * cars by build year and maximum speed, and for checking equality based on all fields.
 */
public class Car implements Comparable<Car> {
    private int buildYear;
    private int maxSpeed;
    private String model;
    private String color;
    private boolean isInsured;
    private boolean isDamaged;

    /**
     * Constructs a Car instance with the specified details.
     *
     * @param buildYear the year the car was built
     * @param maxSpeed the maximum speed of the car in km/h
     * @param model the model name of the car
     * @param color the color of the car
     * @param isInsured true if the car is insured, false otherwise
     * @param isDamaged true if the car is damaged, false otherwise
     */
    public Car(int buildYear, int maxSpeed, String model, String color, boolean isInsured, boolean isDamaged) {
        this.buildYear = buildYear;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.color = color;
        this.isInsured = isInsured;
        this.isDamaged = isDamaged;
    }

    /**
     * Compares this car to another car by build year, and if equal, by maximum speed.
     *
     * @param other the other Car object to be compared
     * @return a positive integer if this car is newer or has a lower max speed,
     *         a negative integer if this car is older or has a higher max speed,
     *         or zero if both build year and max speed are equal
     */
    @Override
    public int compareTo(Car other) {
        if (this.buildYear > other.buildYear) { return 1; }
        if (this.buildYear < other.buildYear) { return -1; }
        if (this.maxSpeed > other.maxSpeed) { return -1; }
        if (this.maxSpeed < other.maxSpeed) { return 1; }
        return 0;
    }

    /**
     * Indicates whether some other object is "equal to" this one. Two cars are
     * considered equal if all their fields have identical values.
     *
     * @param obj the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
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

    /**
     * Returns a hash code value for the car. This is computed based on
     * the car's build year, max speed, model, color, insurance status,
     * and damage status.
     *
     * @return a hash code value for this car
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.buildYear, this.maxSpeed, this.model, this.color, this.isInsured, this.isDamaged);
    }

    /**
     * Returns a string representation of the Car object, including build year,
     * max speed, model, color, insurance, and damage status.
     *
     * @return a string representation of the car
     */
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
