/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;

import javafx.event.EventHandler;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

/**
 *
 * @author USER
 */
public class MainController implements Initializable {
    
    @FXML
    private TextField hexa;
     
    @FXML
    private TextField binary;

    @FXML
    private TextField decimal;

    @FXML
    private Label label;

    
    @FXML
    void fromBinary(ActionEvent event) {
        String strBinary = binary.getText();
        int bin0 = Integer.parseInt(strBinary);
        decimal.getText();
        hexa.getText();
        
        if(binary.toString().length() > 0){
            String hex = Integer.toHexString(bin0);
            hexa.setText(hex);
            int binaryNum = Integer.parseInt(strBinary, 2);
            String dec = String.valueOf(binaryNum);
            decimal.setText(dec);
        }else if(binary.toString() == ""){
            System.out.println("Wrong input");
        }
    }

    @FXML
    void fromDecimal(ActionEvent event) {
        String strDecimal = decimal.getText();
        int dec0 = Integer.parseInt(strDecimal);
        binary.getText();
        hexa.getText();
        
        if(decimal.toString().length() > 0){
            String bin = Integer.toBinaryString(dec0);
            String hex = Integer.toHexString(dec0);
            binary.setText(bin);
            hexa.setText(hex);
        }else if(decimal.toString().isEmpty()){
            System.out.println("wrong input");
        }
    }

    @FXML
    void fromHexa(ActionEvent event) {
        String strHexa = hexa.getText();
        int hexa0 = Integer.parseInt(strHexa);
        
        decimal.getText();
        binary.getText();
        if(hexa.toString().length() > 0){
            String bin = Integer.toBinaryString(hexa0);
            binary.setText(bin);
            int hexaNum = Integer.parseInt(strHexa, 16);
            String decimalNum = String.valueOf(hexaNum);
            decimal.setText(decimalNum);
        }else if(hexa.toString().length() < 0){
            System.out.println("Wrong input");
        }
    }
    
      @FXML
    void clear(ActionEvent event) {
        decimal.getText();
        hexa.getText();
        binary.getText();
        
        decimal.setText("");
        hexa.setText("");
        binary.setText("");
    }

     @FXML
    void help(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Help");
        alert.setHeaderText("User guide");
        alert.setContentText("This is the first release of this application, so you may be experiencing"
                + " some inaccurate when you are trying to convert from binary to hexa numbers and vice versa. "
                + " Please clear the text field before converting your next number."
                + " I am trying so hard to fix that bug. Thank you!!");
        alert.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
