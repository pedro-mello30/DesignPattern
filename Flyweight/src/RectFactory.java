import java.awt.*;
import java.util.HashMap;

public class RectFactory {
    private static final HashMap<Color, Rect> rects = new HashMap<Color, Rect>();

    public static Rect getRect(Color color){
        Rect rect = (Rect)rects.get(color);

        if(rect == null){
            rect = new Rect(color);
            rects.put(color, rect);
        }

        return rect;
    }
}
