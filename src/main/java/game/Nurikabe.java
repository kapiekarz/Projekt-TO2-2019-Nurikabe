package game;

import com.google.inject.Guice;
import com.google.inject.Injector;
import controller.NurikabeController;
import javafx.application.Application;
import javafx.stage.Stage;


public class Nurikabe extends Application {
    private static final double BUTTON_PADDING = 5;
    private static final int NUM_BUTTON_LINES = 5;
    private static final int BUTTONS_PER_LINE = 7;
    private Stage primaryStage;
    private NurikabeController controller;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Nurikabe");

        this.controller = new NurikabeController(primaryStage);
        this.controller.initLayout();

    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GameModule());
        Game game = injector.getInstance(Game.class);

        System.out.println("game.Nurikabe");
        launch(args);
    }

}
