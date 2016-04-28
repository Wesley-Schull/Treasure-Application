package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static void main(String[] args) {
        //launch(args);     <-- This is the GUI launcher. The following was some tests I conducted to see how the functions are used.
        Wallet testWallet1 = new Wallet(10, 20, 3014);
        System.out.println("testWallet1 = " + testWallet1.toString());
        testWallet1.simplifyWallet();
        System.out.println("testWallet1 = " + testWallet1.toString());
        testWallet1.simplifyWallet();
        System.out.println("testWallet1 = " + testWallet1.toString());
        Shop testShop1 = new Shop();
        testShop1.playerWallet = testWallet1;
        System.out.println("testShop1.playerWallet = " + testShop1.playerWallet.toString());
        testShop1.priceOfObject = new Wallet(20, 0, 0);
        testShop1.makePurchase();
        System.out.println("testWallet1 = " + testWallet1.toString());
        System.out.println("testShop1.playerWallet = " + testShop1.playerWallet.toString());


    }
}
