public enum Planet {
    MERCURY(1, 8.50, 1.5, null),
    VENUS(2, 7.5, 2.5, MERCURY),
    EARTH(3, 6.5, 3.5, VENUS),
    MARS(4, 5.5, 4.5, EARTH),
    JUPITER(5, 4.5, 5.5, MARS),
    SATURN(6, 3.5, 6.5, JUPITER),
    URANUS(7, 2.5, 7.5, SATURN),
    NEPTUNE(8, 1.5, 8.5, URANUS);

    private final int serialNumberFromSun;
    private final double distanceFromPreviousPlanet;
    private final double radius;
    private final Planet previousPlanet;
    private final double distanceFromSun;

    public int getSerialNumberFromSun() {
        return serialNumberFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getRadius() {
        return radius;
    }

    public Planet getPreviousPlanet() {
        return previousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    Planet(int serialNumberFromSun, double distanceFromPreviousPlanet, double radius, Planet previousPlanet) {
        this.serialNumberFromSun = serialNumberFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = (radius * 2) + (distanceFromPreviousPlanet * serialNumberFromSun);
    }
}
