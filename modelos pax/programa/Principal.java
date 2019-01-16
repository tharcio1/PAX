import controlador.Controlador;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{

	public static Scene tela;

		@Override
		public void start(Stage primaryStage) throws IOException {
			Parent fxmlTela = FXMLLoader.load(getClass().getResource("/tela/Tela2.fxml"));
    	tela = new Scene(fxmlTela);
    	primaryStage.setScene(tela);
    	primaryStage.show();
		}//Fim metodo start

	public static void main(String args[]){
		launch(args);
	}//Fim metodo main
}//Fim classe Principal