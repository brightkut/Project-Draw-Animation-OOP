package Model;

import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Sun extends DrawingCanvas {

    Color colorEyes = Color.BLACK;
    Color colorHead = Color.YELLOW;
    Color colorInEyes = Color.WHITE;




    public Sun(double x, double y) {

        super(x, y);

    }


    public void drawSun(){
        gc = getGraphicsContext2D();
        //head
        gc.strokeOval(495,40,70,70);
        //eyes
        gc.strokeOval(508,56,14,14);
        gc.strokeOval(537,56,14,14);
        // in eyes
        gc.strokeOval(510,56,5,5);
        //set color for head
        gc.setFill(colorHead);
        gc.fillOval(495,40,70,70);
        //set color for eyes
        gc.setFill(colorEyes);
        gc.fillOval(508,56,14,14);
        gc.fillOval(537,56,14,14);
        //set color in eyes
        gc.setFill(colorInEyes);
        gc.fillOval(510,58,5,5);
        gc.fillOval(539,58,5,5);
        // smile
        gc.strokeArc(515,70,30,23,0,-180, ArcType.OPEN);
        gc.setFill(colorHead);
        gc.fillRect(525,117,10,30);
        gc.fillRect(525,5,10,30);
        gc.fillRect(460,70,30,10);
        gc.fillRect(570,70,30,10);
        gc.strokeRect(525,117,10,30);
        gc.strokeRect(525,5,10,30);
        gc.strokeRect(460,70,30,10);
        gc.strokeRect(570,70,30,10);




    }
}
