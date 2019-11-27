import java.awt.*;

public class Rect {
    private Color color = Color.BLACK;
    private int x, y, x2, y2;

    public Rect(Color color){
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY){
        g.setColor(color);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }

    //test time 2:

    public Rect(Color color, int x, int y, int x2, int y2) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
}
