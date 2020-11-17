package sample;

import javafx.scene.paint.Color;

public class ExternalThread extends Thread{
    App app;

    public static void main(String[] args) {
        App app = new App();
        app.s(args);

    }


    public ExternalThread(App app) {
        this.app = app;
    }

    public void run(){


        app.setFillColor(Color.CHOCOLATE);

        for (int i = 256; i < 512 ; i++){
            app.clearImage();
            app.background(Color.CHOCOLATE);
            app.setFillColor(Color.BLUE);
            app.createRectangle(i,i,30,30);


        }



    }
}
