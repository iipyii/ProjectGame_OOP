/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeaaventure;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Homepage extends JPanel{
        private ImageIcon bg = new ImageIcon(this.getClass().getResource("/bg/1.png"));
	private ImageIcon exit = new ImageIcon(this.getClass().getResource("/button/exit.png"));
	private ImageIcon play = new ImageIcon(this.getClass().getResource("/button/play.png"));
        private ImageIcon player = new ImageIcon(this.getClass().getResource("/player/barista.png"));
	public JButton BStart = new JButton(play);
	public JButton BExit1  = new JButton(exit);
	Homepage(){
            setLayout(null);
            BStart.setBounds(305, 300, 135,60);
            add(BStart);
            add(BExit1);
            BExit1.setBounds(445,300,135,60);
            add(BExit1);
	}
	public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(bg.getImage(),0,0,600,400,this);
            g.drawImage(player.getImage(),250,200,100,100,this);
            g.setColor(Color.DARK_GRAY);
            g.setFont(new Font("Carnevalee Freakshow",Font.CENTER_BASELINE,50));		
            g.drawString("Cafe Adventure Game",35,200);	
	}
}
