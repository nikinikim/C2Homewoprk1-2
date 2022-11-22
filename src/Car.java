public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка - %s, %s цвет кузова, объём двигателя - %.1f л.",
                brand, model, year, country, color, engineVolume);
    }
}
