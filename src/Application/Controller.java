package Application;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    Shop shop = new Shop();
    @FXML Label currentBalanceLabel, currentPriceLabel;
    @FXML TextField playerGoldTextField, itemGoldTextField, playerSilverTextField, itemSilverTextField, playerCopperTextField, itemCopperTextField;
    @FXML Button submitPlayerBalanceButton, submitItemPriceButton, purchaseItemButton;
    public void submitPlayerBalanceButtonClicked() {
        shop.playerWallet = new Wallet(Integer.parseInt(playerGoldTextField.getText()),
                Integer.parseInt(playerSilverTextField.getText()),
                Integer.parseInt(playerCopperTextField.getText()));
        currentBalanceLabel.setText(displayThisWallet(shop.playerWallet));
        purchaseButtonVisibilityCheck();
    }
    public void submitItemPriceButtonClicked() {
        shop.priceOfObject = new Wallet(Integer.parseInt(itemGoldTextField.getText()),
                Integer.parseInt(itemSilverTextField.getText()),
                Integer.parseInt(itemCopperTextField.getText()));
        currentPriceLabel.setText(displayThisWallet(shop.priceOfObject));
        purchaseButtonVisibilityCheck();
    }
    public void purchaseItemButtonClicked() {
        shop.makePurchase();
        currentBalanceLabel.setText(shop.playerWallet.toString());
        purchaseButtonVisibilityCheck();
    }
    public void purchaseButtonVisibilityCheck() {
        if (isPurchasable())
            purchaseItemButton.setVisible(true);
        else
            purchaseItemButton.setVisible(false);
    }
    public boolean isPurchasable() {
        if (shop.playerWallet.toCopper() >= shop.priceOfObject.toCopper())
            return true;
        return false;
    }
    public String displayThisWallet(Wallet thisWallet) {
        return thisWallet.toString();
    }
}