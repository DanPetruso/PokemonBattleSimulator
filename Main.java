import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Main extends Application {

    public static void main(String[] args){ launch(args); }

    @Override
    public void start(Stage primaryStage){

        primaryStage.setTitle("Pokemon Battle Simulator");

        /*
        Label label1 = new Label("Player 1");
        Button pikachuButton = new Button("Pikachu");
        Button treeckoButton = new Button("Treecko");
        Button charmanderButton = new Button("Charmander");
        Button totodileButton = new Button("Totodile");

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label1, pikachuButton, treeckoButton, charmanderButton, totodileButton);
        Scene scene1 = new Scene(layout1, 300, 300);

        Label label2 = new Label("Player 2");
        Button meowthButton = new Button("Meowth");
        Button snivyButton = new Button("Snivy");
        Button cyndaquilButton = new Button("Cyndaquil");
        Button mudkipButton = new Button("Mudkip");

        VBox layout2 = new VBox();
        layout2.getChildren().addAll(label2, meowthButton, snivyButton, cyndaquilButton, mudkipButton);
        Scene scene2 = new Scene(layout2, 300, 300);
        */

        //primaryStage.setScene(scene1);
        primaryStage.show();

    }




}
