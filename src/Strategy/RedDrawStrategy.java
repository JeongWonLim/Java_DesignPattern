package Strategy;

import java.awt.*;

public class RedDrawStrategy extends DrawStrategy{
    @Override
    public void draw(Ball ball) {
        ball.setColor(Color.RED);
    }
}
