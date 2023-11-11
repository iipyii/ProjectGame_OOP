
package tile;

import cafeaaventure.GamePanel;
import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TileManager {
    
    GamePanel gp;
    Tile[] tile;
    
    public TileManager(GamePanel gp) {
        
        this.gp = gp;
        
        tile = new Tile[1];
        
        getTileImage();
    }
    
    public  void getTileImage(){
        
        try{
            
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/bg/1.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2) {
    
    g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
}

}

