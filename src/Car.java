public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private String color;
    private int year;
    private String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if ("".equals(brand) || brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if ("".equals(model) || model == null) {
            this.model = "default";
        }else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;
        }
        if ("".equals(color) || color == null) {
            this.color = "белый";
        }else {
            this.color = model;
        }
        if (year <= 0) {
            this.year = 2000;
        }else {
            this.year = year;
        }
        if ("".equals(country) || country == null) {
            this.country = "default";
        }else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка - %s, %s цвет кузова, объём двигателя - %.1f л.",
                brand, model, year, country, color, engineVolume);
    }
}
