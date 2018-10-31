package Model;

import javafx.scene.paint.Color;

public class Star  extends DrawingCanvas{

    Color colorStar = Color.web("#FFFF66");

    public Star(double x, double y) {
        super(x, y);
    }


    public void drawStar(){
        gc = getGraphicsContext2D();
        gc.strokeOval(320,90,10,10);
        gc.setFill(colorStar);
        gc.fillOval(320,90,10,10);

    }

}
