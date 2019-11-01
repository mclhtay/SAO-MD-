package scout;
import java.awt.*;
import java.io.*;
import java.net.URL;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;



public class OP {

	public static BufferedImage portraits[] = new BufferedImage[37];
	public static BufferedImage thumbnails[] = new BufferedImage[37];
	public static BufferedImage banner;
	
	public static void pictures(){
		try{
			portraits[0] = ImageIO.read(ResourceLoader.load("images/OP/portrait/a-sinon.png"));
			portraits[1] = ImageIO.read(ResourceLoader.load("images/OP/portrait/Alice2.png"));
			portraits[2] = ImageIO.read(ResourceLoader.load("images/OP/portrait/Alice3.png"));
			portraits[3] = ImageIO.read(ResourceLoader.load("images/OP/portrait/b-leafa.png"));
			portraits[4] = ImageIO.read(ResourceLoader.load("images/OP/portrait/Eugeo3.png"));
			portraits[5] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshipasuna.png"));
			portraits[6] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshiplisbeth.png"));
			portraits[7] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshipsilica.png"));
			portraits[8] = ImageIO.read(ResourceLoader.load("images/OP/portrait/friendshipyuuki.png"));
			portraits[9] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-alice.png"));
			portraits[10] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-asuna.png"));
			portraits[11] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-eugeo.png"));
			portraits[12] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-kirito.png"));
			portraits[13] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-leafa.png"));
			portraits[14] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-silica.png"));
			portraits[15] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-sinon.png"));
			portraits[16] = ImageIO.read(ResourceLoader.load("images/OP/portrait/hw-yuuki.png"));
			portraits[17] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-asuna.png"));
			portraits[18] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-leafa.png"));
			portraits[19] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-silica.png"));
			portraits[20] = ImageIO.read(ResourceLoader.load("images/OP/portrait/onsen-sinon.png"));
			portraits[21] = ImageIO.read(ResourceLoader.load("images/OP/portrait/os-agil.png"));
			portraits[22] = ImageIO.read(ResourceLoader.load("images/OP/portrait/os-klein.png"));
			portraits[23] = ImageIO.read(ResourceLoader.load("images/OP/portrait/osasuna.png"));
			portraits[24] = ImageIO.read(ResourceLoader.load("images/OP/portrait/osk.png"));
			portraits[25] = ImageIO.read(ResourceLoader.load("images/OP/portrait/oss.png"));
			portraits[26] = ImageIO.read(ResourceLoader.load("images/OP/portrait/princess-asuna.png"));
			portraits[27] = ImageIO.read(ResourceLoader.load("images/OP/portrait/rainy-rain.png"));
			portraits[28] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-asuna.png"));
			portraits[29] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-leafa.png"));
			portraits[30] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-lisbeth.png"));
			portraits[31] = ImageIO.read(ResourceLoader.load("images/OP/portrait/sport-yui.png"));
			portraits[32] = ImageIO.read(ResourceLoader.load("images/OP/portrait/TD-kirito.png"));
			portraits[33] = ImageIO.read(ResourceLoader.load("images/OP/portrait/w-asuna.png"));
			portraits[34] = ImageIO.read(ResourceLoader.load("images/OP/portrait/w-kirito.png"));
			portraits[35] = ImageIO.read(ResourceLoader.load("images/OP/portrait/wed-asuna.png"));
			portraits[36] = ImageIO.read(ResourceLoader.load("images/OP/portrait/wed-kirito.png"));
			
			
			thumbnails[0] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/a-sinon.png"));
			thumbnails[1] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/Alice2.png"));
			thumbnails[2] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/Alice3.png"));
			thumbnails[3] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/b-leafa.png"));
			thumbnails[4] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/Eugeo3.png"));
			thumbnails[5] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshipasuna.png"));
			thumbnails[6] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshiplisbeth.png"));
			thumbnails[7] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshipsilica.png"));
			thumbnails[8] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/friendshipyuuki.png"));
			thumbnails[9] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-alice.png"));
			thumbnails[10] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-asuna.png"));
			thumbnails[11] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-eugeo.png"));
			thumbnails[12] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-kirito.png"));
			thumbnails[13] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-leafa.png"));
			thumbnails[14] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-silica.png"));
			thumbnails[15] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-sinon.png"));
			thumbnails[16] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/hw-yuuki.png"));
			thumbnails[17] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-asuna.png"));
			thumbnails[18] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-leafa.png"));
			thumbnails[19] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-silica.png"));
			thumbnails[20] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/onsen-sinon.png"));
			thumbnails[21] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/os-agil.png"));
			thumbnails[22] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/os-klein.png"));
			thumbnails[23] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/os-asuna.png"));
			thumbnails[24] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/osk.png"));
			thumbnails[25] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/oss.png"));
			thumbnails[26] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/princess-asuna.png"));
			thumbnails[27] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/rainy-rain.png"));
			thumbnails[28] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-asuna.png"));
			thumbnails[29] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-leafa.png"));
			thumbnails[30] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-lisbeth.png"));
			thumbnails[31] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/sport-yui.png"));
			thumbnails[32] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/TD-kirito.png"));
			thumbnails[33] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/w-asuna.png"));
			thumbnails[34] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/w-kirito.png"));
			thumbnails[35] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/wed-asuna.png"));
			thumbnails[36] = ImageIO.read(ResourceLoader.load("images/OP/thumbnail/wed-kirito.png"));


			banner = ImageIO.read(ResourceLoader.load("images/OP/banner.png"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		

	}
	

}
