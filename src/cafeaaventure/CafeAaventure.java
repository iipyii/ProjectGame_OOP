/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeaaventure;

import static java.awt.SystemColor.text;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class CafeAaventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jf = new PlayGame();
        jf.setSize(600, 400);
        jf.setResizable(false);
        jf.setTitle("Cafe Adventure Game");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);

        
//        GamePanel gamePanel = new GamePanel();
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
        
        
    }
    
}
