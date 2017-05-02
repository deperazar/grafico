
package prueba;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;

public class TextPaintComponent extends JFrame{
    
    public TextPaintComponent(){
        add(new NewPanel());
    }
    
    public static void main(String[] args) {
        TextPaintComponent frame= new TextPaintComponent();
        frame.setTitle("TestPaintComponent");
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class NewPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
                
        g.drawString("PUNTOS: 100", 500, 70);
        g.setColor(Color.red);
        g.drawRect(250, 100, 100, 200);
        g.setColor(Color.blue);
        g.drawRect(200, 100, 100, 200);
        g.setColor(Color.green);
        g.fillRoundRect(30, 150, 100, 200,5,10);
        g.setColor(Color.yellow);
        g.drawRect(425, 150, 100, 200);
        g.fillRoundRect(425, 150, 100, 200, 5, 10);
        g.setColor(Color.pink);
        
        g.fillOval(250, 350, 35, 50);
        g.setColor(Color.red);
        g.fillRoundRect(200, 400, 100, 200, 10, 10);
        
    }
}
