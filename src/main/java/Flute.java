public class Flute extends Instrument implements IPlay, ISell {

    public Flute(double sellPrice, double buyPrice, String color, String material, InstrumentType type) {
        super(sellPrice, buyPrice, color, material, type);
    }

    @Override
    public String play() {
        return "Tu-tu-tu";
    }

    @Override
    public double markUp() {
        return this.getSellPrice()-this.getBuyPrice();
    }
}
