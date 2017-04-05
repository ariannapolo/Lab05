package it.polito.tdp.anagrammi.controller;
/**
 * Sample Skeleton for 'Anagrammi.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.ricorsione.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	private Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="btnCalcolaAnagrammi"
    private Button btnCalcolaAnagrammi; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultCorrect"
    private TextArea txtResultCorrect; // Value injected by FXMLLoader

    @FXML // fx:id="txtResultWrong"
    private TextArea txtResultWrong; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doCalcolaAnagrammi(ActionEvent event) {
    	String parola = txtParola.getText();
    	model.risolvi(parola);
    	for(int i = 0; i< model.getAnagrammi(true).size(); i++){
    		txtResultCorrect.appendText(model.getAnagrammi(true).get(i)+"\n");
    	}
    	for(int i = 0; i< model.getAnagrammi(false).size(); i++){
    		txtResultWrong.appendText(model.getAnagrammi(false).get(i)+"\n");
    	}

    }

    @FXML
    void doReset(ActionEvent event) {
    	this.txtParola.clear();
    	this.txtResultCorrect.clear();
    	this.txtResultWrong.clear();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcolaAnagrammi != null : "fx:id=\"btnCalcolaAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultCorrect != null : "fx:id=\"txtResultCorrect\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultWrong != null : "fx:id=\"txtResultWrong\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
		
	}
}

