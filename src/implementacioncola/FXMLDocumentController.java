/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package implementacioncola;

import Cola.Cola;
import Modelo.Personas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author juan_p.gutierrez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    Cola<Personas> colaP;
    @FXML 
    private Button button;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtcorreo;
    @FXML private TextArea tarea;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        colaP.encolar(new Personas(txtnombre.getText(), txtcorreo.getText()));
       
    }
    
    
    @FXML 
    private void mostrar(ActionEvent event){
        String mostrar = colaP.toString();
        tarea.setText(mostrar);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colaP = new Cola<>();
    }    
    
}
