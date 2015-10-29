package ch.bfh.view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * THe class WindowSanbox defines and shows the GUI (Graphical User Interface).
 * 
 * @author  elia.boesiger, patrik.aebischer
 * @since   28.10.2015
 * @version 1.0
 */
public class UserInterface extends Application {

    //Static variables
    private static final int WINDOW_MIN_HEIGHT = 400;
    private static final int WINDOW_MIN_WIDTH = 600;
    
    //Member variables

     /**
     * The main entry point for all JavaFX applications.
     * 
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set.
     */
    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();

        Scene scene = new Scene(root, WINDOW_MIN_WIDTH, WINDOW_MIN_HEIGHT,
                Color.web("white", 1.0));
        
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(WINDOW_MIN_WIDTH);
        primaryStage.setMinHeight(WINDOW_MIN_HEIGHT);

        Platform.setImplicitExit(true); 

        primaryStage.setTitle("fsdfdsf");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Main-Function will be executed by the start of the programm.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
