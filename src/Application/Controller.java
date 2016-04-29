package Application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    Wallet playerWallet, objectPrice;
    Stage stage;
    Parent root;
    public Button submitBalanceButton, submitPriceButton;
    public Label currentBalanceLabel, currentPriceLabel;
    public TextField balanceGoldTextField, balanceCopperTextField, balanceSilverTextField;
    @FXML
    public void submitBalanceButtonPressed() throws IOException{
        playerWallet = createPlayerWallet();
        stage = (Stage) submitBalanceButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("pricePage.fxml"));
        Scene scene = new Scene(root, 240, 200);
        stage.setScene(scene);
        stage.show();
    }
    public void submitPriceButtonPressed() throws IOException{
        objectPrice = createPlayerWallet();
        stage = (Stage) submitBalanceButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("pricePage.fxml"));
        Scene scene = new Scene(root, 240, 200);
        stage.setScene(scene);
        stage.show();
    }
    public void displayCurrentBalance(){
        currentBalanceLabel.setText(playerWallet.toString());
    }
    private Wallet createPlayerWallet(){
        return new Wallet(Integer.parseInt(balanceGoldTextField.getText()),
                Integer.parseInt(balanceSilverTextField.getText()),
                Integer.parseInt(balanceCopperTextField.getText()));
    }
}
