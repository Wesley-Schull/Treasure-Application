package Application;

public class Shop {
    public Wallet playerWallet = new Wallet(0, 0, 0);
    public Wallet priceOfObject = new Wallet(0, 0, 0);
    public void makePurchase(){
        playerWallet.copper = calculateChange();
        playerWallet.gold = 0;
        playerWallet.silver = 0;
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
}