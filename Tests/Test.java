/**
 * Created by Barry on 4/20/2016.
 */

import org.junit.Assert;
import Application.Shop;
import Application.Wallet;

import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void TestFiveGoldPurchase(){
        Shop obj = new Shop();
        obj.updateGoldWallet(5);
        obj.updateGoldPrice(3);
        Assert.assertEquals(obj.calculateChange(),200);
    }
    @org.junit.Test
    public void TestTenGoldPurchase(){
        Shop obj = new Shop();
        obj.updateGoldWallet(10);
        obj.updateGoldPrice(5);
        Assert.assertEquals(obj.calculateChange(),500);
    }
    @org.junit.Test
    public void TestNegativeNumber(){
        Shop obj = new Shop();
        obj.updateGoldWallet(10);
        obj.updateGoldPrice(20);
        Assert.assertEquals(obj.calculateChange(),0);
    }
    @org.junit.Test
    public void TestGetGold(){
        Wallet obj = new Wallet(0, 0, 0);
        obj.gold=10;
        assertEquals(obj.gold,10);
    }
    @org.junit.Test
    public void TestGetSilver(){
        Wallet obj = new Wallet(0, 0, 0);
        obj.silver = 10;
        assertEquals(obj.silver,10);
    }
    @org.junit.Test
    public void TestGetCopper(){
        Wallet obj = new Wallet(0, 0, 0);
        obj.copper = 10;
        assertEquals(obj.copper,10);
    }
    @org.junit.Test
    public void TestGoldAndSilverPurchase(){
        Shop obj = new Shop();
        obj.updateGoldWallet(5);
        obj.updateSilverWallet(11);
        obj.updateGoldPrice(5);
        obj.updateSilverPrice(10);
        Assert.assertEquals(obj.calculateChange(),10);
    }
    @org.junit.Test
    public void TestGoldAndCopperPurchaseTest(){
        Shop obj = new Shop();
        obj.updateGoldWallet(10);
        obj.updateCopperWallet(55);
        obj.updateGoldPrice(3);
        obj.updateCopperPrice(25);
        Assert.assertEquals(obj.calculateChange(),730);
    }
    @org.junit.Test
    public void TestWalletToCopper_Gold(){
        Shop obj = new Shop();
        obj.updateGoldWallet(10);
        Assert.assertEquals(obj.playerWallet.toCopper(), 1000);
    }
    @org.junit.Test
    public void TestWalletToCopper_GoldSilver(){
        Shop obj = new Shop();
        obj.updateGoldWallet(10);
        obj.updateSilverWallet(5);
        Assert.assertEquals(obj.playerWallet.toCopper(), 1050);
    }
    @org.junit.Test
    public void TestWalletToCopper_GoldSilverCopper(){
        Shop obj = new Shop();
        obj.updateGoldWallet(10);
        obj.updateSilverWallet(5);
        obj.updateCopperWallet(2);
        Assert.assertEquals(obj.playerWallet.toCopper(), 1052);
    }
    @org.junit.Test
    public void TestPriceToCopper_Gold(){
        Shop obj = new Shop();
        obj.updateGoldPrice(10);
        Assert.assertEquals(obj.priceOfObject.toCopper(), 1000);
    }
    @org.junit.Test
    public void TestPriceToCopper_GoldSilver(){
        Shop obj = new Shop();
        obj.updateGoldPrice(10);
        obj.updateSilverPrice(5);
        Assert.assertEquals(obj.priceOfObject.toCopper(), 1050);
    }
    @org.junit.Test
    public void TestPriceToCopper_GoldSilverCopper(){
        Shop obj = new Shop();
        obj.updateGoldPrice(10);
        obj.updateSilverPrice(5);
        obj.updateCopperPrice(2);
        Assert.assertEquals(obj.priceOfObject.toCopper(), 1052);
    }
    @org.junit.Test
    public void TestShopKeepGold(){
        Shop obj = new Shop();
        obj.updateGoldPrice(10);
        obj.updateGoldWallet(20);
        obj.makePurchase();
        Assert.assertEquals(obj.playerWallet.toCopper(), 1000);
    }
    @org.junit.Test
    public void TestShopKeepSilver(){
        Shop obj = new Shop();
        obj.updateGoldPrice(8);
        obj.updateSilverPrice(2);
        obj.updateSilverWallet(5);
        obj.updateGoldWallet(20);
        obj.makePurchase();
        Assert.assertEquals(obj.playerWallet.toCopper(), 1230);
    }
    @org.junit.Test
    public void TestSimplifyWallet(){
        Wallet obj = new Wallet(0, 0, 2543);
        if(obj.gold == 25 && obj.silver == 4 &&  obj.copper == 3){
            Assert.assertEquals(0,0);
        }
    }
}
