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
        cuadro.setSize(2000, 700);
        cuadro.setLocationRelativeTo(null);
        cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro.setVisible(true);
    }
    }
    class nuevoPanel extends JPanel implements ActionListener{
        
        private Timer time;
        private int o;
        private int y;
        
        public nuevoPanel(){
            
            this.time=new Timer(2,this);
            this.time.start();
            this.o=20;
            
        }
        
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
                
        g.setColor(Color.blue);
        int x[]={o+40,o+80,o+120,o+160,o+200,o+200,o+0,o+0,o+40};
        int y[]={80,40,40,80,80,120,120,80,80};
        g.fillPolygon(x, y, 9);
   
        g.setColor(Color.black);
        g.fillOval(o+40, 120, 40, 40);
        g.fillOval(o+120, 120, 40, 40);
        
        g.drawRect(o+0, 0, 201, 161);
        
        System.out.println("CLICK");

    }
        @Override
        public void actionPerformed(ActionEvent e){
            o+=1;
            repaint();
        }
    }

    
    

