package co.edu.uniquindio.proyectofinal;

import co.edu.uniquindio.proyectofinal.mapping.mappers.EmpresaDeEventosMapper;
import co.edu.uniquindio.proyectofinal.viewController.EmpresaDeEventosViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class EmpresaDeEventosApplication extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Empresa De Eventos");
        mostrarVentanaPrincipal();
    }

    private void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(EmpresaDeEventosApplication.class.getResource("EmpresaDeEventosView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            EmpresaDeEventosViewController empresaDeEventosViewController = loader.getController();
//            empresaDeEventosViewController.setAplicacion(this);
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            //scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}