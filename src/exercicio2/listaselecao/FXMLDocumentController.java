/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.listaselecao;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author david
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private RadioButton RBnenhum;
    @FXML
    private ToggleGroup grupoFilme;
    @FXML
    private RadioButton RBjumanji;
    @FXML
    private RadioButton RBtitanic;
    @FXML
    private CheckBox CBacao;
    @FXML
    private CheckBox CBterror;
    @FXML
    private CheckBox CBromance;
    @FXML
    private CheckBox CBcomedia;
    @FXML
    private Label LblDados;
    @FXML
    private TextArea TAopniao;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void coletarDados(ActionEvent event) {
        String x = "";
        String y = "";
        String z = "";
        
//checkBox selecionados

        if(CBacao.isSelected()){
          x += CBacao.getText()+"\n"; 
          
        }
        
        if(CBcomedia.isSelected()){
          x += CBcomedia.getText()+"\n";
        
        }
        
        if(CBromance.isSelected()){
          x += CBromance.getText()+"\n";
        
        }
        
        if(CBterror.isSelected()){
          x += CBterror.getText()+"\n";
        
        }


// RadioButton selecionado
        if(RBjumanji.isSelected()){
       
          y = RBjumanji.getText()+"\n";     
       
        }
        
        if(RBtitanic.isSelected()){
       
          y = RBtitanic.getText()+"\n";     
       
        }
        
        if(RBnenhum.isSelected()){
       
          y = RBnenhum.getText()+"\n";     
       
        }
        
        z += TAopniao.getText()+"\n";
        
        LblDados.setText("Gênero(s) preferido(s): \n "+x+"Queria Assistir:\n"
                +y+"Opnião:\n"+ z);
    }
    
}
