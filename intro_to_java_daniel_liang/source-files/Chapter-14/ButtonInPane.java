import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

  @Override
  public void start(Stage primaryStage) {
    StackPane pane = new StackPane();
    pane.getChildren().add(new Button("OK"));
    pane.getChildren().add(new Button("NoOk"));
    primaryStage.setTitle("Button In Pane");
    primaryStage.setScene(new Scene(pane, 200, 50));
    primaryStage.show();
  }
}
