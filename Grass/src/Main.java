import javax.swing.*;

public class Main {
    public static void main(String[] args) {
JFrame frame = new JFrame("Grass");
Grass grass = new Grass();
frame.add(grass);
frame.setSize(600,600);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
    }
}