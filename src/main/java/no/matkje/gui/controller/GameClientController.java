package no.matkje.gui.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class GameClientController {

  @FXML
  private Scene scene;
  private FXMLLoader fxmlLoader;
  private Parent root;

  public void setScene(Scene scene) {
    this.scene = scene;
  }

  public void joinGame() throws IOException {
    fxmlLoader = new FXMLLoader(getClass().getResource("/no/matkje/fxml/inGameMenu.fxml"));
    root = fxmlLoader.load();

    InGameController controller = fxmlLoader.getController();
    controller.setScene(scene);

    scene.setRoot(root);
  }

  public void goHome() throws IOException {
    fxmlLoader = new FXMLLoader(getClass().getResource("/no/matkje/fxml/mainMenu.fxml"));
    root = fxmlLoader.load();

    MainMenuController controller = fxmlLoader.getController();
    controller.setScene(scene);

    scene.setRoot(root);
  }

}
