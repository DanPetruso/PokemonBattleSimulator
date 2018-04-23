import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class Battle {

    public static Label hp1;
    public static Label hp2;


    public static BorderPane setScene(Pokemon pkmn1, Pokemon pkmn2){

        BorderPane layout = new BorderPane();

        VBox p1 = new VBox(10);

        ChoiceBox<Move> p1Attacks  = new ChoiceBox<>();
        Label name1 = new Label(pkmn1.name);
        hp1 = new Label(pkmn1.hp + "/" + pkmn1.maxHp);
        p1Attacks.getItems().addAll(pkmn1.move1, pkmn1.move2, pkmn1.move3, pkmn1.move4);
        p1Attacks.setValue(pkmn1.move1);

        p1.getChildren().addAll(name1, hp1, p1Attacks);
        layout.setLeft(p1);


        VBox p2 = new VBox(10);

        ChoiceBox<Move> p2Attacks  = new ChoiceBox<>();
        Label name2 = new Label(pkmn2.name);
        hp2 = new Label(pkmn2.hp + "/" + pkmn2.maxHp);
        p2Attacks.getItems().addAll(pkmn2.move1, pkmn2.move2, pkmn2.move3, pkmn2.move4);
        p2Attacks.setValue(pkmn2.move1);

        p2.getChildren().addAll(name2, hp2, p2Attacks);
        layout.setRight(p2);


        HBox center = new HBox();
        Button go = new Button("Go");

        go.setOnAction(e -> turn(pkmn1, p1Attacks, pkmn2, p2Attacks));

        center.getChildren().addAll(go);
        layout.setCenter(center);
        return layout;
    }

    public static void turn(Pokemon pkmn1, ChoiceBox<Move> move1, Pokemon pkmn2, ChoiceBox<Move> move2){
        if(pkmn1.spd > pkmn2.spd){
            int damage = attack(pkmn2, pkmn1, move1.getValue());
            pkmn2.hp -= damage;
            System.out.println(pkmn2.name + " lost " + damage + " HP!");
            if(pkmn2.checkDead()){

            }

            damage = attack(pkmn1, pkmn2, move2.getValue());
            pkmn1.hp -= damage;
            System.out.println(pkmn1.name + " lost " + damage + " HP!\n");
            if(pkmn1.checkDead()){

            }
        }

        else{
            int damage = attack(pkmn1, pkmn2, move2.getValue());
            pkmn1.hp -= damage;
            System.out.println(pkmn1.name + " lost " + damage + " HP!");

            damage = attack(pkmn2, pkmn1, move1.getValue());
            pkmn2.hp -= damage;
            System.out.println(pkmn2.name + " lost " + damage + " HP!\n");
        }
        hp1.setText(pkmn1.hp + "/"+ pkmn1.maxHp);
        hp2.setText(pkmn2.hp + "/"+ pkmn2.maxHp);
    }

    public static int attack(Pokemon gettingHit, Pokemon attacking, Move move){
        if(move.isPhysical)
            return gettingHit.physDamage(attacking.attk, move);
        else
            return gettingHit.spclDamage(attacking.spattk, move);
    }


}
