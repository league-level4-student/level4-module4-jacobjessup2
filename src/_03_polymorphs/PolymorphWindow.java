package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    ArrayList<Polymorph> array = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 
   	 array.add(new RedMorph(10,10,50,50));
   	 array.add(new CircleMorph(250,250,50,50));
   	 array.add(new MouseMorph(0,0,50,50));
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 //draw polymorph
   	 for (Polymorph polymorph : array) {
		polymorph.draw(g);
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 //update polymorph
   	 for (Polymorph polymorph : array) {
		polymorph.update();
	}
    }
}
