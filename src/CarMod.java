public class CarMod {
    private int yearMade;
    private String model;
    private double price;
    private String colour;

    public CarMod() {
    }

    public CarMod(int yearMade, String model, double price, String colour) {
        this.yearMade = yearMade;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "CarMod{" +
                "yearMade=" + yearMade +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
