package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    Canvas canvas;
    GraphicsContext gc;
    Scene theScene;


    @Override
    public void start(Stage primaryStage) throws Exception{


        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 512, 512));
        primaryStage.show();
        */
        Group root = new Group();
        this.theScene = new Scene( root );
        primaryStage.setScene( theScene );

        this.canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );

        this.gc = canvas.getGraphicsContext2D();
        primaryStage.show();
    }


    public void s(String[] args){ launch(args); }
    public static void main(String[] args) {
        launch(args);
    }

    public void setFillColor(Color color){
        theScene.setFill(color);
    }

    public void createRectangle(int x, int y, int l, int h){
        gc.setFill(Color.PAPAYAWHIP);
        gc.fillOval(x,y,l, h);
    }

    public void clearImage(){
        gc.clearRect(0,0,512,512 );
    }

    public void background(Color color){
        gc.setFill(color);
        gc.fillRect(0,0,512,512);
    }
}
