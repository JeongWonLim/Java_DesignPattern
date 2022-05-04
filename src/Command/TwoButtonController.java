package Command;

//Before class
/*
public class TwoButtonController {
    private TV tv;

    public TwoButtonController(TV tv){
        this.tv = tv;
    }

    public void button1Pressed(){
        tv.power();
    }

    public void button2Pressed(){
        tv.mute();
    }
}
*/

//After class
public class TwoButtonController {
    private Command command1;
    private Command command2;

    public TwoButtonController(Command command1, Command command2){
        this.command1 = command1;
        this.command2 = command2;
    }

    public void button1Pressed(){
        command1.execute();
    }

    public void button2Pressed(){
        command2.execute();
    }
}