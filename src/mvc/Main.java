package mvc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent viewController = FXMLLoader.load(getClass().getResource("viewController.fxml"));
        ViewInfo viewInfoController = new ViewInfo();
        BeatModel beatModel = new BeatModel(viewInfoController);
        BeatController beatController = new BeatController(beatModel);
        beatModel.setBeatController(beatController);
        ViewController viewController = new ViewController(beatController);
        beatController.setView(viewController);


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("viewController.fxml"));
        fxmlLoader.setController(viewController);
        Parent controllerParent = fxmlLoader.load();
        primaryStage.setTitle("View Controller");
        
        primaryStage.setScene(new Scene(controllerParent, 250, 150));
        primaryStage.show();

//        Parent viewInfo = FXMLLoader.load(getClass().getResource("viewInfo.fxml"));
        FXMLLoader fxmlLoaderInfo = new FXMLLoader(getClass().getResource("viewInfo.fxml"));
        fxmlLoaderInfo.setController(viewInfoController);
        Parent viewInfo = fxmlLoaderInfo.load();
        Stage stage = new Stage();
        stage.setTitle("View Controller");
        stage.setScene(new Scene(viewInfo, 250, 20));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
