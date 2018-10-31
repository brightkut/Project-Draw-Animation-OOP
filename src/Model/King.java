package Model;

import javafx.scene.paint.Color;

public class King  extends Human{
    Color colorCrown = Color.YELLOWGREEN;
    public King(double x, double y) {
        super(x, y);
    }



    public void draw(){
        drawHuman();
        drawCrown();
    }

    public void drawCrown(){
        gc.strokeRect(62, 325, 40, 4);
        gc.strokeRect(62, 315, 10, 10);
        gc.strokeRect(77, 315, 10, 10);
        gc.strokeRect(92, 315, 10, 10);
        gc.setFill(colorCrown);
        gc.fillRect(62,325,40,4);
        gc.fillRect(62,315,10,10);
        gc.fillRect(77,315,10,10);
        gc.fillRect(92,315,10,10);
    }

    public void goRight(){


        if(getTranslateX()>=275){
            setTranslateX(getTranslateX()+0);
        }else{

            setTranslateX(getTranslateX() + speed);
    }
    }

    public void goUp(){


        if(getTranslateY()<=-60){

            setTranslateY(getTranslateY() + 0);
        }else{
            setTranslateY(getTranslateY() - speed);
    }

    }

    public void goDown(){


        if(getTranslateY()>=-37){

            setTranslateY(getTranslateY() + 0);
        }else{

            setTranslateY(getTranslateY() + speed);
    }
    }

    public void goLeft(){

        if(getTranslateX()<=-205){
            setTranslateX(getTranslateX() + 0);

        }else {
            setTranslateX(getTranslateX() - speed);
    }

    }
}
