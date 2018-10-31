package Model;

public class KingAction {
    private King king;


    private boolean isMoveUp, isMoveDown, isMoveRight, isMoveLeft, isSpeedUp, isSpeedDown;

    public KingAction(King king) {
        this.king = king;

    }
    public void setMoveUp(boolean moveUp) {
        isMoveUp = moveUp;
    }
    public void setMoveDown(boolean moveDown) {
        isMoveDown = moveDown;
    }
    public void setMoveRight(boolean moveRight) {
        isMoveRight = moveRight;
    }
    public void setMoveLeft(boolean moveLeft) {
        isMoveLeft = moveLeft;
    }
    public void setSpeedUp(boolean speedUp) {
        isSpeedUp = speedUp;
    }



    public void setSpeedDown(boolean speedDown) {
        isSpeedDown = speedDown;
    }
    public void action(){
        if (isMoveUp) king.goUp();
        if (isMoveDown) king.goDown();
        if (isMoveLeft) king.goLeft();
        if (isMoveRight) king.goRight();
        if (isSpeedUp) king.speedUp();
        if (isSpeedDown) king.speedDown();
    }
}
