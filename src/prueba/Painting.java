/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;


import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author Estudiante
 */
public class Painting extends JFrame {
    
    public Painting(){
        add(new nuevoPanel());
    }
    
    public static void main(String[] args) {
        Painting cuadro= new Painting();
        cuadro.setTitle("TestPaintComponent");
        cuadro.setSize(600, 700);
        cuadro.setLocationRelativeTo(null);
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
    }
    class nuevoPanel extends JPanel implements ActionListener{
        
        private Timer time;
        
        int x;
        int y;
        
        public nuevoPanel(){
            this.time=new Timer(25,this);
            this.time.start();
        }
        
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
                
        g.setColor(Color.blue);
        int x[]={40,80,120,160,200,200,0,0,40};
        int y[]={80,40,40,80,80,120,120,80,80};
        g.fillPolygon(x, y, 9);
   
        g.setColor(Color.black);
        g.fillOval(40, 120, 40, 40);
        g.fillOval(120, 120, 40, 40);
        
        g.drawRect(0, 0, 201, 161);
        
        g.setColor(Color.blue);
        int w[]={60,100,140,180,220,220,20,20,60};
        int c[]={80,40,40,80,80,120,120,80,80};
        g.fillPolygon(w, c, 9);
   
        g.setColor(Color.black);
        g.fillOval(60, 120, 40, 40);
        g.fillOval(140, 120, 40, 40);
        
        g.drawRect(20, 0, 201, 161);
        
        g.setColor(Color.blue);
        int q[]={80,120,160,200,240,240,40,40,80};
        int e[]={80,40,40,80,80,120,120,80,80};
        g.fillPolygon(q, e, 9);
   
        g.setColor(Color.black);
        g.fillOval(80, 120, 40, 40);
        g.fillOval(160, 120, 40, 40);
        
        g.drawRect(40, 0, 201, 161);
        System.out.println("CLICK");

    }
        @Override
        public void actionPerformed(ActionEvent e){
            x+=1;
            y+=1;
            repaint();
        }
    }

    
    

