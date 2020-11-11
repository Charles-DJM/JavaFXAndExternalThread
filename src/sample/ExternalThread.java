package sample;

import javafx.application.Platform;
import javafx.scene.paint.Color;

import java.io.IOException;

public class ExternalThread extends Thread {

    Main main;

    public ExternalThread(Main main) {
        this.main = main;
    }

    public void run(){

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        main.setFillColor(Color.CHOCOLATE);

        for (int i = 256; i < 512 ; i++){
            main.clearImage();
            main.background(Color.CHOCOLATE);
            main.setFillColor(Color.BLUE);
            main.createRectangle(i,i,30,30);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
