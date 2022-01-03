package airport.planes;

import java.util.Objects;

abstract public class Plane {
    String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder("Plane{");
        sb.append("model='").append(model).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", maxFlightDistance=").append(maxFlightDistance);
        sb.append(", maxLoadCapacity=").append(maxLoadCapacity);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Plane plane = (Plane) object;
        return maxSpeed == plane.maxSpeed
                && maxFlightDistance == plane.maxFlightDistance
                && maxLoadCapacity == plane.maxLoadCapacity
                && model.equals(plane.model);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
