package Application;

public class Shop {
    Wallet playerWallet = new Wallet(0, 0, 0);
    Wallet priceOfObject = new Wallet(0, 0, 0);
    public void makePurchase(){
        playerWallet.copper = calculateChange();
        updateGoldWallet(0);
        updateSilverWallet(0);
        playerWallet.simplifyWallet();
    }
    public int calculateChange(){ //helper to shop
        int copper = walletToCopper();
        int price = priceToCopper();
        if(copper-price<0) {
            return 0;
        }
        return copper-price;
    }
    public int walletToCopper() { //helper to wallet
        return (playerWallet.gold*100) + (playerWallet.silver*10) + (playerWallet.copper);
    }
    public int priceToCopper() { //helper to priceOfObject
        return (priceOfObject.gold*100) + (priceOfObject.silver*10) + (priceOfObject.copper);
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
