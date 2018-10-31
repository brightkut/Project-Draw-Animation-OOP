package Model;

public class AlienAction {
    private Alien alien;


    private boolean  isMoveRight, isMoveLeft ;

    public AlienAction(Alien alien) {
        this.alien = alien;
    }
    public void setMoveRight(boolean moveRight) {
        isMoveRight = moveRight;
    }
    public void setMoveLeft(boolean moveLeft) {
        isMoveLeft = moveLeft;
    }
    public void action(){

        if (isMoveLeft) alien.goLeft();
        if (isMoveRight) alien.goRight();

    }


}
