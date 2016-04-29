package Application;

public class Shop {
    public Wallet playerWallet = new Wallet(0, 0, 0);
    public Wallet priceOfObject = new Wallet(0, 0, 0);
    public void makePurchase(){
        playerWallet.copper = calculateChange();
        updateGoldWallet(0);
        updateSilverWallet(0);
        playerWallet.simplifyWallet();
    }
    public int calculateChange(){
        int copper = playerWallet.toCopper();
        int price = priceOfObject.toCopper();
        if(copper-price<0) {
            return 0;
        }
        return copper-price;
    }
    public void updateGoldWallet(int gold){
        playerWallet.gold = gold;
    }
    public void updateSilverWallet(int silver){
        playerWallet.silver = silver;
    }
    public void updateCopperWallet(int copper){
        playerWallet.copper = copper;
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
