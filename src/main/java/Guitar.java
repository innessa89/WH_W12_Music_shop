public class Guitar extends Instrument implements IPlay,ISell{
    public Guitar(double sellPrice, double buyPrice, String color, String material, InstrumentType type) {
        super(sellPrice, buyPrice, color, material, type);
    }


    public String play() {
        return "Lalalala";
    }

    @Override
    public double markUp() {
        return this.getSellPrice()-this.getBuyPrice();
    }
}
