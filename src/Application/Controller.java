package Application;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    public Button submitBalanceButton;
    public Label testLabel;
    public TextField balanceGoldTextField;
    public TextField balanceSilverTextField;
    public TextField balanceCopperTextField;
    @FXML
    public void submitBalanceButtonPressed(){
        testLabel.setText("Button Pushed");
    }
}
