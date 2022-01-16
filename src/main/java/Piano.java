public class Piano extends Instrument implements IPlay,ISell{


    public Piano(double sellPrice, double buyPrice, String color, String material, InstrumentType type) {
        super(sellPrice, buyPrice, color, material, type);
    }

    public String play(){
        return "I can play";
    }

    public double markUp(){
        return this.getSellPrice()-this.getBuyPrice();
    }
}
