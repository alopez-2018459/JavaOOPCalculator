/*
  *   Nombre: Alán René López Lucas
  *   Carné: 2018459
  *   Código: IN5AM
  *   Fecha de Creación: 21/03/2022
  *   Fecha de Modificación: 
 */
package org.alanlopez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculadoraView.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
