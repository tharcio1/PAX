package controlador;

import java.util.concurrent.Semaphore;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.scene.control.Slider;
import javafx.event.ActionEvent;
import javafx.scene.control.ScrollPane;

public class Controlador implements Initializable {

	 @FXML public TextField InsNome;
	 @FXML public TextField InsEndereco;
	 @FXML public TextField InsFone;
	 @FXML public TextField InsDia;
	 @FXML public TextField InsMes;
	 @FXML public TextField InsAno;
	 @FXML public TextField InsVendedor;
	 @FXML public TextField InsValor;
	 @FXML public TextField InsValorParc;

	 @FXML public ImageView branco;

	 @FXML public AnchorPane anchor;
	 @FXML public AnchorPane anchor2;

	 @FXML ScrollPane s1;

	 public Label nome;
	 public Label nome2;
	 public Label nome3;
	 public Label nome4;
	 public Label nome5;
	 public Label endereco;
	 public Label endereco2;
	 public Label endereco3;
	 public Label endereco4;
	 public Label endereco5;
	 public Label fone;
	 public Label fone2;
	 public Label fone3;
	 public Label fone4;
	 public Label fone5;
	 public Label dia;
	 public Label mes;
	 public Label ano;
	 public Label dia2;
	 public Label mes2;
	 public Label ano2;
	 public Label dia3;
	 public Label mes3;
	 public Label ano3;
	 public Label dia4;
	 public Label mes4;
	 public Label ano4;
	 public Label dia5;
	 public Label mes5;
	 public Label ano5;
	 public Label vendedor;
	 public Label vendedor2;
	 public Label vendedor3;
	 public Label vendedor4;
	 public Label vendedor5;
	 public Label valor;
	 public Label valor2;
	 public Label valor3;
	 public Label valor4;
	 public Label valor5;

  public void voltar(ActionEvent event){
  	InsNome.setText("");
  	InsValor.setText("");
  	InsEndereco.setText("");
  	InsFone.setText("");
  	InsDia.setText("");
  	InsMes.setText("");
  	InsAno.setText("");
  	InsVendedor.setText("");
  	InsValorParc.setText("");
  	String mesdois = "";
  	String mestres = "";
  	int mesdoisval = 0;
  	int mestresval = 0;
  	int mesquatroval = 0;
  	int mescincoval = 0;
  	nome.setText("");
  	nome2.setText("");
  	nome3.setText("");
  	nome4.setText("");
  	nome5.setText("");
  	endereco.setText("");
  	endereco2.setText("");
  	endereco3.setText("");
  	endereco4.setText("");
  	endereco5.setText("");
  	fone.setText("");
  	fone2.setText("");
  	fone3.setText("");
  	fone4.setText("");
  	fone5.setText("");
  	dia.setText("");
  	dia2.setText("");
  	dia3.setText("");
  	dia4.setText("");
  	dia5.setText("");
  	mes.setText("");
	mes2.setText("");
	mes3.setText("");
	mes4.setText("");
	mes5.setText("");
  	ano.setText("");
  	ano2.setText("");
  	ano3.setText("");
  	ano4.setText("");
  	ano5.setText("");
  	vendedor.setText("");
  	vendedor2.setText("");
  	vendedor3.setText("");
  	vendedor4.setText("");
  	vendedor5.setText("");
  	valor.setText("");
  	valor2.setText("");
  	valor3.setText("");
  	valor4.setText("");
  	valor5.setText("");
  	anchor.setVisible(false);
  	s1.setVisible(false);
  	branco.setVisible(true);
  }//Fim metodo voltar

  @FXML
  public void enviar(ActionEvent event){
  	mes.setText("");
	mes2.setText("");
	mes3.setText("");
	mes4.setText("");
	mes5.setText("");
  	String mesdois = InsMes.getText();
  	String mestres = InsMes.getText();
  	String mesum = InsMes.getText();
  	String anoum = InsAno.getText();
  	int mesumval = (Integer.parseInt(mesum));
  	int mesdoisval = (Integer.parseInt(mesdois)) + 1;
  	int mestresval = (Integer.parseInt(mesdois)) + 2;
  	int mesquatroval = (Integer.parseInt(mesdois)) + 3;
  	int anoumval = (Integer.parseInt(anoum));
  	if(mesumval == 10){
  	  mesquatroval = mesquatroval - 12;
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText(mestresval + "");
  	  mes4.setText("0" + mesquatroval);
  	  ano4.setText((anoumval + 1) + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	}//Fim if
  	else if(mesumval == 11){
  	  mestresval = mestresval - 12;
  	  mesquatroval = mesquatroval - 12;
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  ano2.setText(InsAno.getText());
  	  ano3.setText((anoumval + 1) + "");
  	  ano4.setText((anoumval + 1) + "");
  	}//Fim else if
  	else if(mesumval == 12){
  	  mesdoisval = mesdoisval - 12;
  	  mestresval = mestresval - 12;
  	  mesquatroval = mesquatroval - 12;
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  ano2.setText((anoumval + 1) + "");
  	  ano3.setText((anoumval + 1) + "");
  	  ano4.setText((anoumval + 1) + "");
  	}//Fim else if
  	else if(mesquatroval <= 9){
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	}
  	else if(mesquatroval == 10){
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText(mesquatroval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText()); 
  	}
  	else if(mesquatroval == 11){
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText(mestresval + "");
  	  mes4.setText(mesquatroval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	}
  	else{
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText(mestresval + "");
  	  mes4.setText(mesquatroval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	}//Fim else
  	/*if(mesdoisval > 12){
  	  mesdoisval -= 12;
  	  mes2.setText("0" + mesdoisval);
  	}
  	int mestresval = (Integer.parseInt(mesdois)) + 2;
  	if(mestresval > 12){
  	  mestresval -= 12;
  	  mes3.setText("0" + mestresval);
  	}
  	int mesquatroval = (Integer.parseInt(mesdois)) + 3;
  	if(mesquatroval > 12){
  	  mesquatroval -= 12;
  	  mes4.setText("0" + mesquatroval);
  	}*/
  	nome.setText(InsNome.getText());
  	nome2.setText(InsNome.getText());
  	nome3.setText(InsNome.getText());
  	nome4.setText(InsNome.getText());
  	endereco.setText(InsEndereco.getText());
  	endereco2.setText(InsEndereco.getText());
  	endereco3.setText(InsEndereco.getText());
  	endereco4.setText(InsEndereco.getText());
  	fone.setText(InsFone.getText());
  	fone2.setText(InsFone.getText());
  	fone3.setText(InsFone.getText());
  	fone4.setText(InsFone.getText());
  	dia.setText(InsDia.getText());
  	dia2.setText(InsDia.getText());
  	dia3.setText(InsDia.getText());
  	dia4.setText(InsDia.getText());
  	int dia2num =  Integer.parseInt(dia2.getText());
  	int dia3num =  Integer.parseInt(dia3.getText());
  	int dia4num =  Integer.parseInt(dia4.getText());
  	mes.setText(InsMes.getText());
  	/*if(mesdoisval <= 9 && mes2.getText() == ""){
  		mes2.setText("0" + mesdoisval);
  		if(mestresval == 10 && mes3.getText() == ""){
  			mes3.setText(mestresval + "");	
  		}else{
  			mes3.setText("0" + mestresval);
  		}
  		if(mesquatroval == 10 && mes4.getText() == ""){
  			mes4.setText(mesquatroval + "");	
  		}else{
  			mes4.setText("0" + mesquatroval);
  		}
  	}else if(mes2.getText() == "" && mes3.getText() == "" && mes4.getText() == ""){
  		mes2.setText(mesdoisval + "");
  		mes3.setText(mestresval + "");
  		mes4.setText(mesquatroval + "");
  	} //FIm else*/
  	ano.setText(InsAno.getText());
  	/*ano2.setText(InsAno.getText());
  	ano3.setText(InsAno.getText());
  	ano4.setText(InsAno.getText());*/
  	vendedor.setText(InsVendedor.getText());
  	vendedor2.setText(InsVendedor.getText());
  	vendedor3.setText(InsVendedor.getText());
  	vendedor4.setText(InsVendedor.getText());
  	valor.setText(InsValor.getText());
  	valor2.setText(InsValorParc.getText());
  	valor3.setText(InsValorParc.getText());
  	valor4.setText(InsValorParc.getText());

  	if(mesdoisval == 02 && dia2num > 28){
  	  dia2.setText("28");
  	} // trocar mes para 28 aumentar pros lados
  	else if(mestresval == 02 && dia3num > 28){
  	  dia3.setText("28");
  	}
  	else if(mesquatroval == 02 && dia4num > 28){
  	  dia4.setText("28");
  	}

  	anchor.setVisible(true);
  	s1.setVisible(true);
  	//anchor2.setVisible(false);
  }//Fim metodo enviar

  @FXML
  public void enviar2(ActionEvent event){
  	mes.setText("");
	mes2.setText("");
	mes3.setText("");
	mes4.setText("");
	mes5.setText("");
  	String mesdois = InsMes.getText();
  	String mestres = InsMes.getText();
  	int mesdoisval = (Integer.parseInt(mesdois)) + 1;
  	String mesum = InsMes.getText();
  	String anoum = InsAno.getText();
  	int mesumval = (Integer.parseInt(mesum));
  	int mestresval = (Integer.parseInt(mesdois)) + 2;
  	int mesquatroval = (Integer.parseInt(mesdois)) + 3;
  	int mescincoval = (Integer.parseInt(mesdois)) + 4;
  	int anoumval = (Integer.parseInt(anoum));

  	if(mesumval == 10){
  	  mesquatroval = mesquatroval - 12;
  	  mescincoval = mescincoval - 12;
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText(mestresval + "");
  	  mes4.setText("0" + mesquatroval);
  	  mes5.setText("0" + mescincoval);
  	  ano4.setText((anoumval + 1) + "");
  	  ano5.setText((anoumval + 1) + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	}//Fim if
  	else if (mesumval == 9) {
  	  mescincoval = mescincoval - 12;
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText(mestresval + "");
  	  mes4.setText(mesquatroval + "");
  	  mes5.setText("0" + mescincoval);
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	  ano5.setText((anoumval + 1) + "");
  	}
  	else if(mesumval == 11){
  	  mestresval = mestresval - 12;
  	  mesquatroval = mesquatroval - 12;
  	  mescincoval = mescincoval - 12;
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  mes5.setText("0" + mescincoval);
  	  ano2.setText(InsAno.getText());
  	  ano3.setText((anoumval + 1) + "");
  	  ano4.setText((anoumval + 1) + "");
  	  ano5.setText((anoumval + 1) + "");
  	}//Fim else if
  	else if(mesumval == 12){
  	  mesdoisval = mesdoisval - 12;
  	  mestresval = mestresval - 12;
  	  mesquatroval = mesquatroval - 12;
  	  mescincoval = mescincoval - 12;
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  mes5.setText("0" + mescincoval);
  	  ano2.setText((anoumval + 1) + "");
  	  ano3.setText((anoumval + 1) + "");
  	  ano4.setText((anoumval + 1) + "");
  	  ano5.setText((anoumval + 1) + "");
  	}//Fim else if
  	else if(mescincoval <= 9){
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  mes5.setText("0" + mescincoval);
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	  ano5.setText(InsAno.getText());
  	}//Fim else if
  	else if(mescincoval == 10){
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText("0" + mesquatroval);
  	  mes5.setText(mescincoval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	  ano5.setText(InsAno.getText());
  	}//Fim else if
  	else if(mescincoval == 11){
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText("0" + mestresval);
  	  mes4.setText(mesquatroval + "");
  	  mes5.setText(mescincoval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	  ano5.setText(InsAno.getText());
  	}//Fim else if
  	else if (mescincoval == 12) {
  	  mes2.setText("0" + mesdoisval);
  	  mes3.setText(mestresval + "");
  	  mes4.setText(mesquatroval + "");
  	  mes5.setText(mescincoval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	  ano5.setText(InsAno.getText());	
  	}
  	else{
  	  mes2.setText(mesdoisval + "");
  	  mes3.setText(mestresval + "");
  	  mes4.setText(mesquatroval + "");
  	  mes5.setText(mescincoval + "");
  	  ano2.setText(InsAno.getText());
  	  ano3.setText(InsAno.getText());
  	  ano4.setText(InsAno.getText());
  	  ano5.setText(InsAno.getText());
  	}//Fim else
  	/*if(mesdoisval > 12){
  	  mesdoisval -= 12;
  	  mes2.setText("0" + mesdoisval);
  	}
  	int mestresval = (Integer.parseInt(mesdois)) + 2;
  	if(mestresval > 12){
  	  mestresval -= 12;
  	  mes3.setText("0" + mestresval);
  	}
  	int mesquatroval = (Integer.parseInt(mesdois)) + 3;
  	if(mesquatroval > 12){
  	  mesquatroval -= 12;
  	  mes4.setText("0" + mesquatroval);
  	}
  	int mescincoval = (Integer.parseInt(mesdois)) + 4;
  	if(mescincoval > 12){
  	  mescincoval -= 12;
  	  mes5.setText("0" + mescincoval);
  	}*/
  	nome.setText(InsNome.getText());
  	nome2.setText(InsNome.getText());
  	nome3.setText(InsNome.getText());
  	nome4.setText(InsNome.getText());
  	nome5.setText(InsNome.getText());
  	endereco.setText(InsEndereco.getText());
  	endereco2.setText(InsEndereco.getText());
  	endereco3.setText(InsEndereco.getText());
  	endereco4.setText(InsEndereco.getText());
  	endereco5.setText(InsEndereco.getText());
  	fone.setText(InsFone.getText());
  	fone2.setText(InsFone.getText());
  	fone3.setText(InsFone.getText());
  	fone4.setText(InsFone.getText());
  	fone5.setText(InsFone.getText());
  	dia.setText(InsDia.getText());
  	dia2.setText(InsDia.getText());
  	dia3.setText(InsDia.getText());
  	dia4.setText(InsDia.getText());
  	dia5.setText(InsDia.getText());
  	int dia2num =  Integer.parseInt(dia2.getText());
  	int dia3num =  Integer.parseInt(dia3.getText());
  	int dia4num =  Integer.parseInt(dia4.getText());
  	int dia5num =  Integer.parseInt(dia5.getText());
  	mes.setText(InsMes.getText());
  	/*if(mesdoisval <= 9 && mes2.getText() == ""){
  		mes2.setText("0" + mesdoisval);
  		if(mestresval == 10 && mes3.getText() == ""){
  			mes3.setText(mestresval + "");		
  		}else{
  			mes3.setText("0" + mestresval);
  		}//Fim else
  		if(mesquatroval == 10 && mes4.getText() == ""){
  			mes4.setText(mesquatroval + "");		
  		}else{
  			mes4.setText("0" + mesquatroval);
  		}//Fim else
  		if(mescincoval == 10 && mes5.getText() == ""){
  			mes5.setText(mescincoval + "");		
  		}else{
  			mes5.setText("0" + mescincoval);
  		}//Fim else
  	}else if(mes2.getText() == "" && mes3.getText() == "" && mes4.getText() == "" && mes5.getText() == ""){
  		mes2.setText(mesdoisval + "");
  		mes3.setText(mestresval + "");
  		mes4.setText(mesquatroval + "");
  		mes5.setText(mescincoval + "");
  	} //FIm else
  	ano2.setText(InsAno.getText());
  	ano3.setText(InsAno.getText());
  	ano4.setText(InsAno.getText());
  	ano5.setText(InsAno.getText());*/
  	ano.setText(InsAno.getText());
  	vendedor.setText(InsVendedor.getText());
  	vendedor2.setText(InsVendedor.getText());
  	vendedor3.setText(InsVendedor.getText());
  	vendedor4.setText(InsVendedor.getText());
  	vendedor5.setText(InsVendedor.getText());
  	valor.setText(InsValor.getText());
  	valor2.setText(InsValorParc.getText());
  	valor3.setText(InsValorParc.getText());
  	valor4.setText(InsValorParc.getText());
  	valor5.setText(InsValorParc.getText());

  	if(mesdoisval == 02 && dia2num > 28){
  	  dia2.setText("28");
  	} // trocar mes para 28 aumentar pros lados
  	else if(mestresval == 02 && dia3num > 28){
  	  dia3.setText("28");
  	}
  	else if(mesquatroval == 02 && dia4num > 28){
  	  dia4.setText("28");
  	}
  	else if(mescincoval == 02 && dia5num > 28){
  	  dia5.setText("28");
  	}

  	anchor.setVisible(true);
  	s1.setVisible(true);
  	branco.setVisible(false);
  	//anchor2.setVisible(false);
  }//Fim metodo enviar2

  public Controlador(){
    branco = new ImageView();
    s1 = new ScrollPane();
  }//Fim metodo construtor

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  
  }//Fim metodo initialize

}//Fim classe controlador