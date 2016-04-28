package Application;

public class Shop {
    Wallet obj = new Wallet(0, 0, 0);
    Wallet priceOfObject = new Wallet(0, 0, 0);
    public void shopKeep(){
        obj.copper = changeCalculator();
        updateGoldWallet(0);
        updateSilverWallet(0);
        obj.simplifyWallet();
    }
    public int changeCalculator(){ //helper to shop
        int copper = walletToCopper();
        int price = priceToCopper();
        if(copper-price<0) {
            return 0;
        }
        return copper-price;
    }
    public int walletToCopper() { //helper to wallet
        return (obj.gold*100) + (obj.silver*10) + (obj.copper);
    }
    public int priceToCopper() { //helper to priceOfObject
        return (priceOfObject.gold*100) + (priceOfObject.silver*10) + (priceOfObject.copper);
    }
    public void updateGoldWallet(int gold){
        obj.gold = gold;
    }
    public void updateSilverWallet(int silver){
        obj.silver = silver;
    }
    public void updateCopperWallet(int copper){
        obj.copper = copper;
    }
    public void updateGoldPrice(int gold){
        priceOfObject.gold = gold;
    }
    public void updateSilverPrice(int silver){
        priceOfObject.silver = silver;
    }
    public void updateCopperPrice(int copper){
        priceOfObject.copper = copper;
    }
}
