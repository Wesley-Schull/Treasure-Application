package Application;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    private Shop shop = new Shop();
    @FXML Label currentBalanceLabel, currentPriceLabel;
    @FXML TextField playerGoldTextField, itemGoldTextField, playerSilverTextField, itemSilverTextField, playerCopperTextField, itemCopperTextField;
    @FXML Button submitPlayerBalanceButton, submitItemPriceButton, purchaseItemButton;
    public void submitPlayerBalanceButtonClicked() {
        shop.playerWallet = new Wallet(Integer.parseInt(playerGoldTextField.getText()),
                Integer.parseInt(playerSilverTextField.getText()),
                Integer.parseInt(playerCopperTextField.getText()));
        displayWallets();
        purchaseButtonVisibilityCheck();
    }
    public void submitItemPriceButtonClicked() {
        shop.priceOfObject = new Wallet(Integer.parseInt(itemGoldTextField.getText()),
                Integer.parseInt(itemSilverTextField.getText()),
                Integer.parseInt(itemCopperTextField.getText()));
        displayWallets();
        purchaseButtonVisibilityCheck();
    }
    public void purchaseItemButtonClicked() {
        shop.makePurchase();
        currentBalanceLabel.setText(shop.playerWallet.toString());
        purchaseButtonVisibilityCheck();
    }
    private void displayWallets() {
        currentBalanceLabel.setText(shop.playerWallet.toString());
        currentPriceLabel.setText(shop.priceOfObject.toString());
    }
    private void purchaseButtonVisibilityCheck() {
        if (isPurchasable())
            purchaseItemButton.setVisible(true);
        purchaseItemButton.setVisible(false);
    }
    private boolean isPurchasable() {
        return shop.playerWallet.toCopper() >= shop.priceOfObject.toCopper();
    }
}