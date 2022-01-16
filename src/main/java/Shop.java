import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public void addItem(ISell item) {
        stock.add(item);
    }

    public  void removeItem(ISell item){
        stock.remove(item);
    }

    public double calculateProfit(){
       double profit=0;
       for(ISell iSell:stock){
           profit+=iSell.markUp();
       }
       return profit;
    }

    public ISell getMaxProfitISell(){
        ISell maxProfitISell=null;
        for(ISell iSell:stock){
            if(maxProfitISell==null){
                maxProfitISell=iSell;
                continue;
            }
            if(maxProfitISell.markUp()<iSell.markUp()){
                maxProfitISell=iSell;
            }
        }
        return maxProfitISell;
    }
}
