import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlyweightTest extends JFrame {

    JButton bDrawing;
    int width = 1500;
    int height = 1000;
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray};

    public FlyweightTest(){
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Design Pattern");


        JPanel contentPane = new JPanel();

        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel  = new JPanel();

        bDrawing = new JButton("Start Drawing");
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(bDrawing, BorderLayout.SOUTH);



        bDrawing.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 1000000; i++){


//                    test time 1:
//                    g.setColor(getRandColor());
//                    g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());

//                    test time 2:
//                    Rect rect = new Rect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
//                    rect.draw(g);

//                  method Flyweight:
                    Rect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());




                }


                long endTime = System.currentTimeMillis();

                System.out.println("That took: " + (endTime - startTime) + " milliseconds");
            }
        });

        this.add(contentPane);
        this.setVisible(true);

    }

    private int getRandX(){ return (int)(Math.random()*width); }

    private int getRandY(){ return (int)(Math.random()*height); }

    private Color getRandColor(){ return shapeColor[(int)(Math.random()*9)]; }

}
