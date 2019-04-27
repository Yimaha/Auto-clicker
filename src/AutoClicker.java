import java.awt.Robot;

public class AutoClicker {
    private Robot robot;
    private int delay;

    public AutoClicker(){
        delay = 300;
        try{
            robot = new Robot();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void clickMouse(){
        robot.keyPress()
    }
}
