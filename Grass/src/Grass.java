import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Grass extends JPanel{
    private BufferedImage image;

    public Grass() {
        try {
            image = ImageIO.read(new File("C:\\Users\\New\\Downloads\\grass.jpg"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
for( int x = 0; x < (getWidth()); x += 50){
    for(int y = 0 ; y < (getHeight()); y += 50) {
                g.drawImage(image, x, y,this);
}
    }

} }
