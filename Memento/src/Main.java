import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame{

    public static void main(String[] args) {

        new Main();
    }

    Originator originator = new Originator();
    Carataker carataker = new Carataker();

    private JButton save, undo, redo;
    private JTextArea textArea;

    int currentVersion = 0, historyLenght = 0;

    public Main(){

        this.setSize(750, 780);
        this.setTitle("Test With Memento");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        panel.add(new JLabel("Article:"));
        textArea = new JTextArea(40, 60);

        panel.add(textArea);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();


        KeysListener textKeyListener = new KeysListener();
        textArea.addKeyListener(textKeyListener);

        save = new JButton("Save");
        save.addActionListener(saveListener);

        undo = new JButton("Undo");
        undo.addActionListener(undoListener);


        redo = new JButton("Redo");
        redo.addActionListener(redoListener);

        panel.add(save);
        undo.setEnabled(false);
        redo.setEnabled(false);
        panel.add(undo);
        panel.add(redo);

        this.add(panel);
        this.setVisible(true);

    }

    public void save(){
        originator.setArticle(textArea.getText());
        carataker.addMemento(originator.storeInMemento());

        currentVersion++;
        historyLenght++;

        System.out.println("Save Files: "+ historyLenght);

        undo.setEnabled(true);
    }

    public void undo(){
        if(currentVersion >= 1){
            currentVersion--;
            textArea.setText(originator.restoreFromHistory(carataker.getMemento(currentVersion)));
            redo.setEnabled(true);
        }else{
            undo.setEnabled(false);
        }

    }

    public void redo(){
        if((historyLenght - 1) > currentVersion){
            currentVersion++;
            textArea.setText(originator.restoreFromHistory(carataker.getMemento(currentVersion)));
            undo.setEnabled(true);
        }else{
            redo.setEnabled(false);
        }
    }

    public class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == save){
                save();

            }else if (e.getSource() == undo){
                undo();

            } else if (e.getSource() == redo){
                redo();

            }
        }
    }

    public class KeysListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if ((e.getKeyCode() == KeyEvent.VK_Z) && (e.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
                undo();
            } else if ((e.getKeyCode() == KeyEvent.VK_Y) && (e.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
                redo();

            } else if ((e.getKeyCode() == KeyEvent.VK_S) && (e.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
                save();
            }
        }

        @Override
        public void keyTyped(KeyEvent keyEvent) {}

        @Override
        public void keyReleased(KeyEvent keyEvent) {}
    }


}
