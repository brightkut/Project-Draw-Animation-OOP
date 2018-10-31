package Model;

import javafx.scene.paint.Color;

public class Cloud extends DrawingCanvas {


    Color colorCloud = Color.web("#F8F8FF");


    public Cloud(double x, double y) {
        super(x, y);

    }


    public void drawCloud(){
        gc = getGraphicsContext2D();
        gc.strokeOval(23,75,150,60);
        gc.strokeOval(49,55,60,60);
        gc.strokeOval(85,36,60,60);
        gc.setFill(colorCloud);
        gc.fillOval(23,75,150,60);
        gc.fillOval(49,55,60,60);
        gc.fillOval(85,36,60,60);


    }
}
