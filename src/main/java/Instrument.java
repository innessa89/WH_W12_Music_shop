public abstract class Instrument {

    private double sellPrice;
    private double buyPrice;
    private String color;
    private String material;
    private InstrumentType type;

    public Instrument(double sellPrice, double buyPrice, String color, String material, InstrumentType type) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.color = color;
        this.material = material;
        this.type = type;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }
}
