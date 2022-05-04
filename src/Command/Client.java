package Command;

public class Client {
    public static void main(String[] args){
        /*TV tv = new TV();
        TwoButtonController rc = new TwoButtonController(tv);

        rc.button1Pressed();
        rc.button2Pressed();

        rc.button1Pressed();
        rc.button2Pressed();*/

        TV tv = new TV();

        MuteCommand muteCommand = new MuteCommand(tv);
        PowerCommand powerCommand = new PowerCommand(tv);

        TwoButtonController rc = new TwoButtonController(powerCommand, muteCommand);

        rc.button1Pressed();
        rc.button2Pressed();

        rc.button1Pressed();
        rc.button2Pressed();
    }
}
