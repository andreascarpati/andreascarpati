/**
 * Sample Skeleton for 'Libretto.fxml' Controller Class
 */

package Scarpati.LAB_INF_5F.viewcontrol;

import java.net.URL;
import java.util.ResourceBundle;

import Scarpati.LAB_INF_5F.model.Esame;
import Scarpati.LAB_INF_5F.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LibrettoController {
	//chiamata al modello
	Model model= new Model();

	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtCodice"
    private TextField txtCodice; // Value injected by FXMLLoader

    @FXML // fx:id="txtTitolo"
    private TextField txtTitolo; // Value injected by FXMLLoader

    @FXML // fx:id="txtDocente"
    private TextField txtDocente; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="btnCerca"
    private Button btnCerca; // Value injected by FXMLLoader

    @FXML // fx:id="txtMessage"
    private TextArea txtMessage; // Value injected by FXMLLoader

    @FXML
    void handleCerca(ActionEvent event) {
    	String codice = txtCodice.getText() ;
    	
    	if(codice.length()<5) {
    		txtMessage.appendText("Codice corso non valido\n");
    		return ;
    	}
    	
    	Esame e = model.trovaEsame(codice) ;
    	
    	if(e==null) {
    		txtMessage.appendText("Codice "+codice+" non trovato\n");
    	} else {
    		txtMessage.appendText("Codice "+codice+" trovato\n");
    		
    		txtCodice.setText(e.getCodice());
    		txtTitolo.setText(e.getTitolo());
    		txtDocente.setText(e.getDocente());
    	}

    }

    @FXML
    void handleInserisci(ActionEvent event) {
    	// recupera i dati dalla vista
    	String codice = txtCodice.getText() ;
    	String titolo = txtTitolo.getText() ;
    	String docente = txtDocente.getText() ;
    	
    	// verifica la validità dei dati
    	if( codice.length()<5 || titolo.length()==0 || docente.length()==0 ) {
    		txtMessage.appendText("Dati esame insufficienti\n");
    		return ;
    	}
    	
    	// chiedi al Model di effettuare l'operazione
    	Esame esam = new Esame(codice, titolo, docente) ;
    	String result = model.addEsame(esam) ;
    	
    	// aggiorna la vista con il risultato dell'operazione
    	
    		txtMessage.appendText(result);
    	
    
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtCodice != null : "fx:id=\"txtCodice\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtTitolo != null : "fx:id=\"txtTitolo\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtDocente != null : "fx:id=\"txtDocente\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtMessage != null : "fx:id=\"txtMessage\" was not injected: check your FXML file 'Libretto.fxml'.";

    }

	
}
