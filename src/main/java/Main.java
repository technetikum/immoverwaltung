import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.berning.immoverwaltung.view.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Immobilienverwaltung");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event -> System.out.println("Hello World!" + event.toString()));

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("_Datei");
        menuBar.getMenus().add(fileMenu);
        MenuItem menuItemNewFile = new MenuItem("Neu");
        fileMenu.getItems().add(menuItemNewFile);


        AnchorPane anchorpane = new AnchorPane();
        anchorpane.getChildren().add(btn);
        AnchorPane.setBottomAnchor(btn, 6.0);
        AnchorPane.setLeftAnchor(btn, 50.0);

        AppMenu appMenu = new AppMenu(anchorpane);

        ToolBar toolBar = new ToolBar(new Button("New"));
        AnchorPane.setTopAnchor(toolBar, 25.0);
        AnchorPane.setLeftAnchor(toolBar, 0.0);
        AnchorPane.setRightAnchor(toolBar, 0.0);
        anchorpane.getChildren().add(toolBar);

        primaryStage.setScene(new Scene(anchorpane, 800, 500));
        primaryStage.show();
    }
}

