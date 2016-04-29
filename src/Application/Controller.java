package Application;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller {
    public Button submitBalanceButton;
    public Label testLabel;
    public TextField balanceGoldTextField, balanceCopperTextField, balanceSilverTextField;
    GridPane mainGridPane, setBalanceGridPane, chargeGridPane, creditGridPane;
    Stage stage;
    Scene mainScene, setBalanceScene, chargeScene, creditScene;
    @FXML
    public void submitBalanceButtonPressed(){
        testLabel.setText("Button Pushed");
    }
}
