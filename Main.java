public class Main {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (int i = 0; i < planets.length; i++) {
            System.out.println("Планета: " + planets[i] +
                    ", Порядковий номер від сонця: " + planets[i].getSerialNumberFromSun() +
                    ", Відстань від попередньої планети: " + planets[i].getDistanceFromPreviousPlanet() +
                    ", Радіус: " + planets[i].getRadius() +
                    ", Попередня планета: " + planets[i].getPreviousPlanet() +
                    ", Наступна планета: " + (i + 1 < planets.length ? planets[i + 1] : null) +
                    ", Відстань від сонця: " + planets[i].getDistanceFromSun());
        }
    }
}
