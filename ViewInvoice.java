/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byunicite;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculateController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private VBox va;
    
    @FXML
    private VBox vb;
    
    @FXML
    private VBox vc;
 @FXML
    private VBox vd;
    
    @FXML
    private Button done;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        va.getChildren().add(new Label("City"));
        vb.getChildren().add(new Label("Numbers"));
        vc.getChildren().add(new Label("Price"));
        vd.getChildren().add(new Label("Type"));
        
        va.getChildren().add(new Label(" "));
        vb.getChildren().add(new Label(" "));
        vc.getChildren().add(new Label(" "));
        vd.getChildren().add(new Label("  "));

        
        double sum = 0;
        for (Piece p : Byunicite.pieces) {
            Label type = new Label(p.Type);
            Label numbers = new Label(p.Numbers);
            Label  city = new Label(p.City);
            Label price = new Label(p.price + "");
            
            va.getChildren().add(city);
            vb.getChildren().add(numbers);
            vc.getChildren().add(price);
             vd.getChildren().add(Type);
            
            sum += p.price;
        }
        
        va.getChildren().add(new Label(" "));
        vb.getChildren().add(new Label(" "));
        vc.getChildren().add(new Label(" "));
        vd.getChildren().add(new Label("  "));

        va.getChildren().add(new Label("Total"));
        vb.getChildren().add(new Label(" "));
        vc.getChildren().add(new Label(sum + ""));
        vd.getChildren().add(new Label("  "));
        
    }
    
    @FXML
    private void Done(ActionEvent event){
        System.exit(0);
    }
    
    @FXML
    private void help(ActionEvent event) {
        try {
            HelpController.prevLay = "window 8.fxml";
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
            Stage stage = (Stage) done.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);

        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
}
