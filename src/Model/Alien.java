package Model;

import javafx.scene.paint.Color;

public class Alien extends DrawingCanvas {
    Color colorHead = Color.web("#00FF33");
    Color colorEyes = Color.WHITE;
    Color colorInEyes = Color.BLACK;

    double speed = 1.5;


    public Alien(double x, double y) {
        super(x, y);

    }

    public void drawAlien(){
        gc = getGraphicsContext2D();
        //head
        gc.strokeOval(300,110,35,35);
        gc.setFill(colorHead);
        gc.fillOval(300,110,35,35);
        //eyes
        gc.strokeOval(306,113,20,20);
        gc.setFill(colorEyes);
        gc.fillOval(306,113,20,20);
        gc.strokeOval(310,117,10,10);
        gc.setFill(colorInEyes);
        gc.fillOval(310,117,10,10);
        //leg
        gc.strokeLine(307,142,305,150);
        gc.strokeLine(326,143,328,150);
        //horn

        gc.strokeRect(308,103,5,10);
        gc.strokeRect(320,103,5,10);
        gc.setFill(colorHead);
        gc.fillRect(308,103,5,10);
        gc.fillRect(320,103,5,10);


    }
    public void goLeft(){

        if(getTranslateX()<=-460){
            setTranslateX(getTranslateX() + 0);

        }else {
            setTranslateX(getTranslateX() - speed);}

    }
    public void goRight(){

        if(getTranslateX()>=-46){
            setTranslateX(getTranslateX()+0);
        }else{

            setTranslateX(getTranslateX() + speed);}
    }
}
