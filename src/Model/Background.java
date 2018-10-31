package Model;

import javafx.scene.paint.Color;


public class Background  extends DrawingCanvas{
    Color colorSky = Color.web("#87CEFA");
    Color colorSkyNight = Color.BLACK;


    public Background(double x, double y) {
        super(x, y);
    }




    public void drawSkyNight(){
        gc = getGraphicsContext2D();
        gc.strokeRect(5,4,650,150);
        gc.setFill(colorSkyNight);
        gc.fillRect(5,4,650,150);

    }




    public void drawSky(){
        gc = getGraphicsContext2D();
        gc.strokeRect(5,4,650,150);
        gc.setFill(colorSky);
        gc.fillRect(5,4,650,150);


    }









}
