package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        menuStage(primaryStage, root);
    }


    public static void main(String[] args) {
        launch(args);
    }


    private static void menuStage(Stage primaryStage, Parent root) {
        primaryStage.setTitle("Shop menu");
        Scene scene = new Scene(root, 1080, 720);

        Button showAllProducts = new Button("Dostępne produkty");
        showAllProducts.setMinSize(80, 40);
        Button showCart = new Button("Koszyk");
        showCart.setMinSize(80, 40);

        VBox menuButtons = new VBox();




        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
