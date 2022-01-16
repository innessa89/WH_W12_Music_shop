import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Flute flute;
    private Piano piano;
    private ISell iSell;


    @Before
    public void before(){
        shop=new Shop();
        guitar= new Guitar(10,4,"white","wood", InstrumentType.STRING);
        flute= new Flute(8,5,"silver","still", InstrumentType.WIND);
        piano=new Piano(20,3,"black","wood",InstrumentType.KEYBOARD);
    }

    @Test
    public void canGetMaxProfit(){
        shop.addItem(guitar);
        shop.addItem(flute);
        shop.addItem(piano);
        assertEquals(piano,shop.getMaxProfitISell());
        
        System.out.println(piano.markUp());
        System.out.println(flute.markUp());
        System.out.println(guitar.markUp());
        System.out.println(shop.getMaxProfitISell());
    }





}
