/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;


import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.event.*;
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
    class nuevoPanel extends JPanel implements ActionListener, MouseListener{
        
        private Timer time;
        private int o;
        private int y;
        private int i;
        private int secuencia;
 
        public nuevoPanel(){
            
            this.i=0;
            this.addMouseListener(this);
            this.time=new Timer(25,this);  
            this.time.start();
            this.o=5;
          
        }
        
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Image fondo= loadImage("fondo.png");
        Image cat=  loadImage("cats.gif");
                
        g.drawImage(fondo, 0, 0, null);
        
        g.drawImage(cat,o,y+350,132+o,430+y,(this.secuencia*132),0,(this.secuencia*132)+132,80,this);
        
        
        g.drawRect(o,350,132,80);
        
       
        
        g.setColor(Color.blue);
        int x[]={o+40,o+80,o+120,o+160,o+200,o+200,o+0,o+0,o+40};
        int y[]={240+80,240+40,240+40,240+80,240+80,240+120,240+120,240+80,240+80};
        //g.fillPolygon(x, y, 9);
   
        g.setColor(Color.black);
        //g.fillOval(o+40, 240+120, 40, 40);
        //g.fillOval(o+120, 240+120, 40, 40);
        
        //g.drawRect(o+0,240+ 0, 201, 161);
        
        //g.fillRect(600,240+ 0, 201, 161);
        
    }
        @Override
        public void actionPerformed(ActionEvent e){
            
            o+=5;
            
            if(this.secuencia==5){
                this.secuencia=0;
            }
            else{
                this.secuencia++;
            }
          
            //checkcollision();
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
        
        @Override
        public Rectangle getBounds(){
                return new Rectangle(o+0,240, 201, 161);
        }
        
        public void mouseClicked(MouseEvent e){

            Point mp=e.getPoint();
            if(this.getBounds().contains(mp)){
                if(i==0){
                    
                    time.stop();
                    i=1;
                }
                else{
                    time.start();
                    i=0;
                }
            }
        }
        
        public void checkcollision(){
            Rectangle carro= this.getBounds();
            Rectangle muro= new Rectangle(600, 240, 201, 161);
            
            if(carro.intersects(muro)){
                System.out.println("Collision");
                time.stop();
            }
        }
        
        public Image loadImage(String imageName){
            ImageIcon ii= new ImageIcon(imageName);
            Image image =ii.getImage();
            return image;
        }
        
    }

    
    

