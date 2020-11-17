package dad.javafx.calculadoraFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Controller implements Initializable {
	
	private Calculadora calculadora = new Calculadora();
	
	@FXML
	private BorderPane view;
	
	@FXML
	private TextField pantallaText;
	
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Ver.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		pantallaText.textProperty().bind(calculadora.pantallaProperty());
	}
	
	@FXML
	public void clic_Cero(ActionEvent e) {
		char num = '0';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Uno(ActionEvent e) {
		char num = '1';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Dos(ActionEvent e) {
		char num = '2';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Tres(ActionEvent e) {
		char num = '3';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Cuatro(ActionEvent e) {
		char num = '4';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Cinco(ActionEvent e) {
		char num = '5';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Seis(ActionEvent e) {
		char num = '6';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Siete(ActionEvent e) {
		char num = '7';
		calculadora.insertar(num);
	}
	
	@FXML
	public void borrarTodoBtn(ActionEvent e) {
		calculadora.borrarTodo();
	}
	
	@FXML
	public void clic_Ocho(ActionEvent e) {
		char num = '8';
		calculadora.insertar(num);
	}
	
	@FXML
	public void clic_Nueve(ActionEvent e) {
		char num = '9';
		calculadora.insertar(num);
	}
	
	@FXML
	public void borrarBtn(ActionEvent e) {
		calculadora.borrar();
	}
	
	@FXML
	public void insertarComaBtn(ActionEvent e) {
		calculadora.insertarComa();
	}
	
	@FXML
	public void operarBtn(ActionEvent e) {
		char operando = ((Button)e.getSource()).getText().charAt(0);
		calculadora.operar(operando);
	}

	public BorderPane getView() {
		return view;
	}

	public Calculadora getModel() {
		return calculadora;
	}

}