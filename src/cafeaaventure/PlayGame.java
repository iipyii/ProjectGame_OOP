/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeaaventure;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Admin
 */
public class PlayGame extends JFrame implements ActionListener {

    Homepage home = new Homepage();
    GamePanel gamePanel = new GamePanel();
//        
//        jf.add(gamePanel);
//        
//       
//        jf.pack();
//
//      
//        jf.setVisible(true);
//        
//        gamePanel.startGameThread();
//    playstate1 state1 = new playstate1();
//    gameover gover = new gameover();

    public PlayGame() {
        this.setSize(600, 400);
        this.add(home);
        home.BExit1.addActionListener(this);
        home.BStart.addActionListener(this);
//        state1.BExithome.addActionListener(this);
//        state1.BPause.addActionListener(this);
//        state1.Bresum.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home.BStart) {
            this.setLocationRelativeTo(null);
            this.remove(home);
            this.setSize(600, 400);
            this.add(gamePanel);
            this.pack();
            this.setVisible(true);
            gamePanel.startGameThread();
            
//            state1.requestFocusInWindow();
//            state1.timestart = false;
//            state1.scor = 0;
//            state1.HP = 3;
//            state1.times = 100;
//            state1.startball = false;
//            state1.timestart = false;
//        } else if (e.getSource() == state1.BExithome) {
//            System.exit(0);
        } else if (e.getSource() == home.BExit1) {
            System.exit(0);
//        } else if (e.getSource() == state1.BPause) {
//            this.setLocationRelativeTo(null);
//            this.setSize(1000, 800);
//            this.add(state1);
//            state1.requestFocusInWindow();
//            state1.t.suspend();
//            state1.time.suspend();
//            state1.actor.suspend();
//            state1.tballs1.suspend();
//            state1.tballs5.suspend();
//        } else if (e.getSource() == state1.Bresum) {
//            this.setLocationRelativeTo(null);
//            this.setSize(1000, 800);
//            this.add(state1);
//            state1.requestFocusInWindow();
//            state1.t.resume();
//            state1.time.resume();
//            state1.actor.resume();
//            state1.tballs1.resume();
//            state1.tballs5.resume();
        }
        this.validate();
        this.repaint();
    }

    public static void main(String[] args) {
        JFrame jf = new PlayGame();
        jf.setSize(600, 400);
        jf.setTitle("Cafe Adventure Game");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}