import game.DrawPoker;
import javafx.application.Application;

import javafx.stage.Stage;

public class PlayPoker extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) {
		new DrawPoker();

	}

}
