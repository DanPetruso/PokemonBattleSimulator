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
        Scene scene;
        PokeDex dex = new PokeDex();

        scene = new Scene(Battle.setScene(dex.pikachu, dex.meowth), 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();


    }




}
